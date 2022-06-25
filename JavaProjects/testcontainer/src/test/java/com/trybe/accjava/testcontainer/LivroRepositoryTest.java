package com.trybe.accjava.testcontainer;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import com.mongodb.assertions.Assertions;
import com.trybe.accjava.testcontainer.model.Livro;
import com.trybe.accjava.testcontainer.repository.LivroRepository;

@Testcontainers
@DataMongoTest(excludeAutoConfiguration = EmbeddedMongoAutoConfiguration.class)
public class LivroRepositoryTest {

  @Container
  static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo");

  @Autowired
  private LivroRepository livroRepository;

  @AfterEach
  void cleanUp() {
      this.livroRepository.deleteAll();
  }

  Livro livroMock = new Livro("61ff1e243dabcd00b6452431", "livro1", "isbn1");
  @Test
  void DeveCadastrarNovoLivro() {
      this.livroRepository.insert(livroMock);


      Livro livro = livroRepository.insert(new Livro("1", "livro teste", "isbnteste"));

      Assertions.assertNotNull(livro );   }


  @Test
  void DeveListarTodosOsLivros() {
      this.livroRepository.findAll();

      List<Livro> livro = livroRepository.findAll();

      Assertions.assertNotNull(livro );   }



  @Test
  void DeveBuscarLivroPeloId() {
      this.livroRepository.findById(livroMock.getId());

      Optional<Livro> livro = livroRepository.findById("");

      Assertions.assertNotNull(livro );   }


  @Test
  void DeveAtualizarLivroPeloId() {
      this.livroRepository.findById(livroMock.getId());
      this.livroRepository.save(livroMock);

      Livro livro = livroRepository.save(livroMock);

      Assertions.assertNotNull(livro );   }



  @Test
  void DeveExcluirLivroPeloId() {
    this.livroRepository.deleteById(livroMock.getId());

    Optional<Livro> livro = livroRepository.findById("");

    Assertions.assertEquals(livro, Optional.empty());
  }

}