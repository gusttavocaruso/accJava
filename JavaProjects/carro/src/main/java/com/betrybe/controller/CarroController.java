package com.betrybe.controller;

import com.betrybe.dto.AtualizarCarroDTO;
import com.betrybe.dto.CriarCarroDTO;
import com.betrybe.model.Carro;
import com.betrybe.service.CarroService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/carro")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarroController {

  @Inject
  private CarroService service;

  @GET
  public List<Carro> listar(){
    return service.listar();
  }

  @GET
  @Path("/{id}")
  public Carro buscarPorId(@PathParam("id") Long id){
    return service.buscarPorId(id);
  }

  @POST
  public void salvar(CriarCarroDTO carroDTO){
    service.salvar(carroDTO);
  }

  @PATCH
  @Path("/{id}")
  public void atualizar(@PathParam("id") Long id, AtualizarCarroDTO carroDTO){
    service.atualizar(carroDTO, id);
  }

  @DELETE
  @Path("/{id}")
  public void deletar(@PathParam("id") Long id){
    service.deletar(id);
  }

}