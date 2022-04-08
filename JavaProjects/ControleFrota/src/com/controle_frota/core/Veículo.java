package com.controle_frota.core;

import java.util.ArrayList;

public abstract class Veículo {

  private String placa;
  private int anoFabricacao;
  private String combustivel;
  protected ArrayList<String> abastecimentos;

  public Veículo(String placa, int anoFabricacao) {
    this.placa = placa;
    this.anoFabricacao = anoFabricacao;
    this.abastecimentos = new ArrayList<>();
  }

  public abstract void abastecer(String local, String motorista, double valor);

  public void listaAbastecimentos() {
    System.out.println("+-- Lista de abastecimentos para o veiculo: " + this.placa + " --+");
    for (String abastecimento : this.abastecimentos) {
      System.out.println("|" + abastecimento + "\t|");
    }
    System.out.println("+---------- END ----------+\n");
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public int getAnoFabricacao() {
    return anoFabricacao;
  }

  public void setAnoFabricacao(int anoFabricacao) {
    this.anoFabricacao = anoFabricacao;
  }

  public String getCombustivel() {
    return combustivel;
  }

  public void setCombustivel(String combustivel) {
    this.combustivel = combustivel;
  }

}
