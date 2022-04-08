Podemos criar um objeto a partir de uma classe abstrata, desde que os métodos abstratos sejam implementados no momento da criação do objeto. Exemplo:

```java
Developer developer = new Developer() {

  public double wage() { 
    return 4000.0; 
  }

  public String mainSkill() { 
    return "Debug"; 
  }

};
```

Que recurso estranho, não é? Ao mesmo tempo em que criamos o objeto developer, definimos como implementar seus métodos abstratos…

As implementações deste objeto só podem ser usadas por ele. Não há uma classe que permita reutilizar o código. Por isso, este recurso é chamado de classe anônima, que é bastante utilizado quando o código do método é muito curto e não reutilizável.


### Resumindo

    - Classes abstratas servem para declarar métodos abstratos

    - O método abstrato é usado quando o mesmo método é implementado de uma maneira diferente em cada classe herdeira

    - Classes abstratas são um tipo especial de classe: podem ter atributos, herdar e serem herdadas, mas não podem ser instanciadas — servem para definir como as classes herdeiras vão se comportar
