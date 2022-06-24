package com.betrybe;

import java.io.Serializable;

public class Livro implements Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = -4063528376391148522L;
  private String nome;
  private String anoPublicacao;
  private String nomeAutor;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getAnoPublicacao() {
    return anoPublicacao;
  }

  public void setAnoPublicacao(String anoPublicacao) {
    this.anoPublicacao = anoPublicacao;
  }

  public String getNomeAutor() {
    return nomeAutor;
  }

  public void setNomeAutor(String nomeAutor) {
    this.nomeAutor = nomeAutor;
  }

}
