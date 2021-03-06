package com.trybe.trybespring.application;

import org.springframework.stereotype.Controller;

import javax.ws.rs.*;

@Controller
@Path("/api/books")
public class BookController {

  private List<Book> books = new ArrayList<>();

  @POST
  @Consumes("application/json") // tipo de dado que é consumido
  @Produces("application/json") // tipo de dado enviado como resposta
  public Response add(Book book) {
    books.add(book);
    return Response.ok(book).build();
  }

  @GET
  @Consumes("application/json")
  @Produces("application/json")
  public Response findAll() {
    return Response.ok(books).build();
  }

  @GET
  @Path("/{id}")
  @Consumes("application/json")
  @Produces("application/json")
  public Response findById(@PathParam("id") UUID id) {
    try {
      Book book = books.stream().filter(b -> b.getId().equals(id)).findAny().orElseThrow();
      return Response.ok(book).build();
    } catch (NoSuchElementException e) {
      return Response.status(404).build();
    }
  }

}
