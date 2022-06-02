package com.trybe.trybespring.domain;

public class Book {

  private UUID id;

  private String name;

  private String author;

  public Book(String name, String author) {
      this.id = UUID.randomUUID(); // toda nova instância terá um novo id
      this.name = name;
      this.author = author;
  }

  ...getters and setters
}
