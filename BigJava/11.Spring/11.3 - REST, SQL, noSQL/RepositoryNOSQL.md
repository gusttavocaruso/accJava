```java
package br.trybe.data.nosql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.trybe.data.nosql.model.CountryItem;

public interface ItemRepository  extends MongoRepository<CountryItem, String> {

  @Query("{name:'?0'}")
  CountryItem findItemByName(String name);

}
```

O conteúdo dentro da anotação @Query indica a query que será utilizada na busca.
