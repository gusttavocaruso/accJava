package com.imobiliaria.classes;

import java.time.LocalDate;

public class Venda extends Imovel {

  private double valorVenda;
  private boolean vendido;

  public Venda(String endereco, LocalDate dataCadastro, double valorVenda) {
    super(endereco, dataCadastro);
    this.valorVenda = valorVenda;
    this.vendido = false;
  }

  public double getValorVenda() {
    return valorVenda;
  }

  public void setValorVenda(double valorVenda) {
    this.valorVenda = valorVenda;
  }

  public boolean isVendido() {
    return vendido;
  }

  public void vender() {
    if (ativo) {
      this.vendido = true;
    }
  }

}
