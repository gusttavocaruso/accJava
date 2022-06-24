package com.betrybe.repository;

import com.betrybe.model.Carro;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CarroRepository implements PanacheRepositoryBase<Carro, Long> {
}


/**
 * Aqui precisamos apenas que nossa classe implemente a interface PanacheRepositoryBase para herdar todos os métodos de persistência de dados. Como parâmetro para ela, nós informamos a classe que será utilizada nas operações do banco de dados e o tipo do dado que representa a chave primária, que neste caso é Long.

Com a anotação @ApplicationScoped, estamos indicando para o Quarkus que essa classe será utilizada com injeção de dependência. */
