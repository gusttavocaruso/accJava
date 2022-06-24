utilizar a anotação `@Min` para definir um valor mínimo na variável idade:

```java
package org.acme;

import javax.validation.constraints.Min;

public class Pessoa {

  private String nome;
  
  @Min(message="A idade mínima é 16 anos", value=16)
  private int idade;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

}
```

Agora, em nosso controller, podemos usar a anotação `@Valid` do lado de nosso parâmetro:

```java
package org.acme;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/titulo-eleitor")
@Consumes(MediaType.APPLICATION_JSON)
public class PessoaController {

  @POST
  public void salvar(@Valid Pessoa pessoa) throws Exception {
    
    //restante do código
  }

}
```

Se executarmos novamente a requisição, teremos o seguinte retorno:

```
{
    "classViolations": [],
    "parameterViolations": [
        {
            "constraintType": "PARAMETER",
            "message": "A idade mínima é 16 anos",
            "path": "salvar.pessoa.idade",
            "value": "10"
        }
    ],
    "propertyViolations": [],
    "returnValueViolations": []
}
```

Assim, sempre que formos utilizar a classe Pessoa, já estaremos levando junto a regra de negócio referente ao seu atributo.

<a href="https://docs.jboss.org/hibernate/stable/validator/reference/en-US/html_single/">Mais sobre anotações/validações</a>
