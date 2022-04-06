package com.imobiliaria.classes;

import java.time.LocalDate;

public class Imovel {

  private String endereco;
  private LocalDate dataCadastro;
  protected boolean ativo;

  public Imovel(String endereco, LocalDate dataCadastro) {
    super();
    this.endereco = endereco;
    this.dataCadastro = dataCadastro;
    this.ativo = false;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public LocalDate getDataCadastro() {
    return dataCadastro;
  }

  public void setDataCadastro(LocalDate dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  public boolean isAtivo() {
    return ativo;
  }

  public void ativarCadastro() {
    this.ativo = true;
  }

}
