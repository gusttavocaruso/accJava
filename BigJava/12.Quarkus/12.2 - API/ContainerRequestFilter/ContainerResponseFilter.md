Interceptando respostas com ContainerResponseFilter
Podemos utilizar filtros para modificar o retorno de nossas APIs. Um caso de uso muito comum é o problema do CORS.

CORS é uma sigla para Cross-Origin Resource Sharing (Compartilhamento de recursos com origens diferentes). É um mecanismo de segurança dos navegadores, por meio de alguns cabeçalhos adicionais, para permitir que uma aplicação seja executada a partir de um determinado domínio. Mais detalhes aqui.

Para essa configuração não precisar ser feita em todos os seus controllers, pode ser feita uma classe que implementa a interface ContainerResponseFilter. Vamos criar um novo projeto Quarkus para vermos um exemplo.

Execute o seguinte comando no terminal:

```
mvn io.quarkus.platform:quarkus-maven-plugin:2.6.3.Final:create \
    -DprojectGroupId=com.betrybe \
    -DprojectArtifactId=quarkus-response-filter \
    -DclassName="com.betrybe.HelloController" \
    -Dpath="/hello" \
    -Dextensions="resteasy-jackson"
cd quarkus-response-filter
```

Ao abrir o projeto, podemos ver que temos uma classe já definida:

```java
package com.betrybe;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloController {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    return "Hello RESTEasy";
  }

}
```

Não iremos alterar essa classe. Vamos criar uma classe chamada CorsResponseFilter, que irá implementar a interface ContainerResponseFilter:

```java
package com.betrybe;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class CorsResponseFilter implements ContainerResponseFilter {

  @Override
  public void filter(
    ContainerRequestContext requestContext,
    ContainerResponseContext responseContext) throws IOException {

    //teste para validar que o filtro foi executado
    responseContext.getHeaders().putSingle("x-teste", "true");
    responseContext.getHeaders().putSingle("Access-Control-Allow-Origin", "*");
    responseContext.getHeaders().putSingle("Access-Control-Allow-Credentials", "true");
    responseContext.getHeaders().putSingle("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS, HEAD");
    responseContext.getHeaders().putSingle("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With");  

  }

}
```
