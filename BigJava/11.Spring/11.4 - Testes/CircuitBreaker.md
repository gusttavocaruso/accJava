## Circuit Breaker

Existem hoje um conjunto de ferramentas que, utilizadas em conjunto, podem nos ajudar a manter a capacidade de lidar com problemas e adaptar-nos a mudanças. Isso é o que chamamos de "Resiliência". O CircuitBreaker é implementado através de uma máquina de estados finitos com três estados normais: fechado(CLOSED), aberto(OPEN) e semiaberto(HALF_OPEN).

🔴 CLOSED: Representa o status normal da aplicação, onde cada camada atua como esperado, sejam serviços externos ou internos à sua infraestrutura.

🟢 OPEN : Representa status a partir da identificação de alguma anomalia, alguma camada que não está respondendo informações como esperado ou que ficou inoperante

🟡 HALF_OPEN: Representa o status intermediário e indica que o circuito já esteve no status OPEN e que está validando a possibilidade de se tornar CLOSED, dependendo da janela a ser observada.

Mas como podemos definir quando um circuito deve se tornar aberto?

Vejamos uma camada de serviço que invoca um repository (persistence) para listar registros salvos na base de dados:
```java
public List<Estudante> listarEstudantes() {
  return estudanteRepository.findAll();
}
```

Para a aplicação, o serviço de banco de dados é um ponto de falha e, caso esteja indisponível, a aplicação deve “sobreviver” e não permitir que o erro seja propagado à pessoa usuária. Assim, utilizaremos uma das bibliotecas destinadas para tratar falhas, conhecida como resilience-4j:

```xml
<dependency>
     <groupId>io.github.resilience4j</groupId>
     <artifactId>resilience4j-all</artifactId>
     <version>1.7.1</version>
 </dependency>
 <dependency>
     <groupId>io.github.resilience4j</groupId>
     <artifactId>resilience4j-spring-boot2</artifactId>
     <version>1.7.1</version>
 </dependency>
```

🖊 Anote aí:: Ela também pode ser encontrada internamente dentro do Spring Framework no módulo de Cloud, através da dependência spring-cloud-starter-circuitbreaker-resilience4j — no exemplo, consideramos o uso da biblioteca original. Para obter mais detalhes sobre essa biblioteca, você pode acessar a página oficial da solução. Não deixe de conferir!

O que deveria ser alterado no método citado para garantir que o fluxo passasse a ser monitorado por um circuit breaker?

Basicamente isso:
```java
@CircuitBreaker(name = "estudantes")
public List<Estudante> listarEstudantes() {
  return estudanteRepository.findAll();
}
```

Agora que temos um método gerenciado, podemos efetuar as devidas configurações. Para isso, utilizamos o arquivo application.yml na pasta resources do projeto. Adicionaremos a seguinte configuração:

```
Taxa de erro esperada para que o circuito seja aberto: 10%
Tempo que o CircuitBreaker deve esperar antes de fazer a transição de aberto para meio aberto: 10s
```

```yml
resilience4j.circuitbreaker:
  configs:
    default:
      waitDurationInOpenState: 10s
      failureRateThreshold: 10
  instances:s
    estudantes:
      baseConfig: default
```

Com isso, temos que o retorno do método deixaria de ser um possível erro relacionado ao banco e passaria para algo como:

`CircuitBreaker 'estudantes' is OPEN and does not permit further calls`

