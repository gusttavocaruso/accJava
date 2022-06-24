package com.betrybe;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;

import org.apache.commons.io.IOUtils;
import org.jboss.logging.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.vertx.core.http.HttpServerRequest;


@Provider
public class LogFilter implements ContainerRequestFilter{

  private static final Logger LOG = Logger.getLogger(LogFilter.class);

  @Context
  UriInfo info;

  @Context
  HttpServerRequest request;

  @Override
  public void filter(ContainerRequestContext requestContext) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    String metodo = requestContext.getMethod();
    String rota = info.getPath();
    byte[] byteArray = IOUtils.toByteArray(requestContext.getEntityStream());
    Livro livro = mapper.readValue(byteArray, Livro.class);
    
    LOG.infof("Método: %s | Endpoint: %s | Objeto: %s", metodo, rota,mapper.writeValueAsString(livro));
    
    requestContext.setEntityStream(new ByteArrayInputStream(byteArray));

  }
}

/**
 * Em um cenário hipotético, imagine que essa API possui integração com outros sistemas e salva o livro no banco de dados. Seria muito interessante se pudéssemos ter um registro de logs dos livros que estão sendo inseridos.
 * Para isso que essa classe serve.
 * 
 * Ao implementar a interface, temos que implementar o método filter à nossa classe. Ele será o responsável por receber as requisições antes de nossos controllers. Dentro dele posso fazer os tratamentos que preciso, como escrever um log. Aqui foi utilizada a classe IOUtils da biblioteca apache-commons-io para facilitar o tratamento com a entrada de dados e obter o objeto que queremos adicionar no log.
 */
