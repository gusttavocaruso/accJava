package com.trybe.accjava.testcontainer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.trybe.accjava.testcontainer.model.Livro;

@Repository
public interface LivroRepository extends MongoRepository<Livro, String> {
}
