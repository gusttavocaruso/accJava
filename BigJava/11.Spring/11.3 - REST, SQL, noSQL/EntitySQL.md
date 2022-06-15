```java
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String capital;
  private String ddi;

  public Country() {
  }

  public Country(Long id, String name, String capital, String ddi){
    this.id=id;
    this.name=name;
    this.capital=capital;
    this.ddi=ddi;
  }

  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

  public String getDdi() {
    return ddi;
  }

  public void setDdi(String ddi) {
    this.ddi = ddi;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString(){
    return this.name.concat(":").concat(this.capital).concat(" - DDI:").concat(this.ddi);
  }

}
```
@Entity - Informa que a classe é uma entidade que vai ser persistida em um banco de dados.

@Id - Informa que o atributo será o campo de controle no banco de dados para a tabela criada com base nessa classe, é um Id.

Sendo um Id, esse atributo será uma chave primária — ou seja, uma informação única que é utilizada para Identificar um registro em específico.

@GeneratedValue(strategy = GenerationType.AUTO) - Indica que não é preciso preencher esse atributo ao criar um novo registro, já que a própria biblioteca se encarregará dessa ação. O strategy, como GenerationType.AUTO, avisa qual vai ser a forma de gerar uma nova informação — é por esse atributo que o valor pode ser gerado por dentro do próprio mecanismo do banco de dados, como as sequences, do Oracle.
