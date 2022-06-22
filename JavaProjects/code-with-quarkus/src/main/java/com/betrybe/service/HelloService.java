package com.betrybe.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {

  public String sayHello(String name){
    return "Welcome, " + name;
  }

}
