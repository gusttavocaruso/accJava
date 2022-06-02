package com.trybe.trybespring.config;

import com.trybe.trybespring.application.BookController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

  public JerseyConfig() {
    register(BookController.class);
  }

}

/**
 * Após criar nosso controller, temos que realizar uma configuração adicional para que o Spring reconheça o Jersey (JAX-RS). Vamos criar a seguinte classe dentro de config e informar nosso controller.
 */
