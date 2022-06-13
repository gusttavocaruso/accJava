## Podemos utilizar o @Autowired de algumas formas:

#

### - Em construtores

A classe PessoaDesenvolvedoraService declara que depende da classe PessoaFuncionariaService pelo seu construtor:

```java
@Service
public class PessoaDesenvolvedoraService{

  @Autowired
  public PessoaDesenvolvedoraService(PessoaFuncionariaService pessoaFuncionariaService){
    this.pessoaFuncionariaService = pessoaFuncionariaService;
  }

}
```
#

### - Em métodos (setters) :

A classe PessoaDesenvolvedoraService declara que depende da classe PessoaFuncionariaService pelo seu método setter:

```java
@Service
public class PessoaDesenvolvedoraService {

    private PessoaFuncionariaService pessoaFuncionariaService;

    public String controlarHorasExtrasTrabalhadas(){
      pessoaFuncionariaService.controlarHorasExtrasTrabalhadas();
    }

    private  PessoaFuncionariaService getPessoaFuncionariaService(){
      return pessoaFuncionariaService;
    }

  @Autowired
  public void setPessoaFuncionariaService (PessoaFuncionariaService pessoaFuncionariaService) {
    this.pessoaFuncionariaService = pessoaFuncionariaService;
  }

}
```
#

### - Em atributos:

A classe PessoaDesenvolvedoraService declara que depende da classe PessoaFuncionariaService pela declaração desse atributo na classe:

```java
@Service
public class PessoaDesenvolvedoraService{

  @Autowired  
  private PessoaFuncionariaService pessoaFuncionariaService;

  public Long calcularHoraExtrasTrabalhadas() {
    pessoaFuncionariaService.calcularHoraExtrasTrabalhadas();
  }

}
```
#

Quando a aplicação sobe e começa a procurar pelos beans, as dependências que foram declaradas com @Autowired precisam estar disponíveis, pois são consideradas obrigatórias. Em caso negativo, o Spring lança uma exceção do tipo NoSuchBeanDefinitionException. Caso tenha algum bean que corra o risco de não estar disponível, é importante defini-lo como não obrigatório da seguinte forma:

```java
@Service
public class PessoaDesenvolvedoraService{

  @Autowired(required = false)
  private PessoaFuncionariaService pessoaFuncionariaService;

  public Long calcularHoraExtrasTrabalhadas() {
    pessoaFuncionariaService.calcularHoraExtrasTrabalhadas();
  }

}
```
#