## A injeção de dependências pode ser realizada de algumas formas:
#

### - Via construtor :

Para usarmos os beans na nossa classe service, declaramos essa dependência via construtor. Aqui dizemos que a classe PessoaDesenvolvedoraService depende da classe PessoaFuncionariaService:

Obs: a classe que será passada no construtor deve ser um bean gerenciado pelo Spring.

```java
@Component
public class PessoaDesenvolvedoraService {

  @Autowired
  public PessoaDesenvolvedoraService(PessoaFuncionariaService pessoaFuncionariaService){
      this.pessoaFuncionariaService = pessoaFuncionariaService;
   }

}
```
#

### - Via método (setter injection):

Para usarmos os beans na nossa classe service, declaramos essa dependência via método (setter). Aqui dizemos que a classe PessoaDesenvolvedoraService depende da classe PessoaFuncionariaService, e isso permite que seja utilizado o método controlarHorasTrabalhadas, conforme o código a seguir:

```java
@Component
public class PessoaDesenvolvedoraService{

  private PessoaFuncionariaService pessoaFuncionariaService;

  public Long controlarHorasExtrasTrabalhadas(){
    pessoaFuncionariaService.controlarHorasExtrasTrabalhadas();
  }

  private  PessoaFuncionariaService getPessoaFuncionariaService(){
    return pessoaFuncionariaService;
  }

  @Autowired
  public void setPessoaFuncionariaService (PessoaFuncionariaService pessoaFuncionariaService){
    this.pessoaFuncionariaService = pessoaFuncionariaService;
  }

}
```
#

### - Via propriedades (campos):

Para usarmos os beans na nossa classe service, declaramos essa dependência via atributo. Aqui dizemos que a classe PessoaDesenvolvedoraService depende da classe PessoaFuncionariaService:

```java
@Component
public class PessoaDesenvolvedoraService{

  @Autowired  
  private PessoaFuncionariaService pessoaFuncionariaService;

  public Long calcularHoraExtrasTrabalhadas() {
    pessoaFuncionariaService.calcularHoraExtrasTrabalhadas();
  }
    
}
```
#
