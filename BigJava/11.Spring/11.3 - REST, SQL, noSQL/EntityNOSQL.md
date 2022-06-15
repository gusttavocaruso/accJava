```java
package br.trybe.data.nosql.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("countryItems")
public class CountryItem {

  @Id
  private String id;

  private String name;
  private String capital;
  private String ddi;
  
  public CountryItem(String id, String name, String capital, String ddi) {
    super();
    this.id = id;
    this.setName(name);
    this.setCapital(capital);
    this.setDdi(ddi);
  }

  public String getDdi() {
    return ddi;
  }

  public void setDdi(String ddi) {
    this.ddi = ddi;
  }

  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString(){
    return this.id.concat(") ").concat(this.name).concat(":").concat(this.capital).concat(" - DDI:").concat(this.ddi);
  }

}
```

@Document está indicando que a classe é referente a um documento, indicando entre aspas a collection de que faz parte.

@Id possui o mesmo propósito dos bancos relacionais, funcionando como nossa chave primária.
