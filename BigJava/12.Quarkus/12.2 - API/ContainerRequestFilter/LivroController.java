package com.betrybe;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/livro")
public class LivroController {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
      return "Hello RESTEasy";
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public Response salvar(Livro livro) {
    return Response.ok(livro).build();
  }

}
