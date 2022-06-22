package com.betrybe;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.betrybe.service.HelloService;

@Path("/identificacao")
public class PortariaController {
  
  @Inject
  private HelloService helloService;

  @GET
  public String hey(@QueryParam(value = "name") String name) {
    return helloService.sayHello(name);
  }
  // http://localhost:8080/identificacao?name=Gusta

}
