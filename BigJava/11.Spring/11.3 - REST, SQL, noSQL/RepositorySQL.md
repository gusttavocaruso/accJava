```java
package br.trybe.data.repository;

import org.springframework.data.repository.CrudRepository;
import br.trybe.data.model.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {

}
```

Essa abstração nos leva aos métodos de realização das operações padrão de um CRUD sem precisarmos nos preocupar em declarar repetidas vezes para diferentes entities! Assim, é disponibilizado, por exemplo:

- save(T entity): para incluir ou atualizar um registro;
- findById(id): para localizar o nosso registro pelo id (lembra da anotação @Id?);
- findAll(): retorna a lista de todos os registros na base;
- delete(T entity): para excluir o registro.
