package com.betrybe.dto;

public class CriarCarroDTO {

  private String nome;
  private String ano;
  private Double preco;

  public String getNome() {
    return nome;
  }

  public String getAno() {
    return ano;
  }

  public Double getPreco() {
    return preco;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setAno(String ano) {
    this.ano = ano;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

}
