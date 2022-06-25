package com.trybe.accjava.testcontainer.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "Livro")
public class Livro {

  public Livro(@JsonProperty("id") String id,
      @JsonProperty("nome") String nome,
      @JsonProperty("isbn") String isbn) {
    this.id = id;
    this.nome = nome;
    this.isbn = isbn;
  }

  private String id;
  private String nome;
  private String isbn;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

}
