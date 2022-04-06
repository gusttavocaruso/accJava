package com.imobiliaria.main;

import java.time.LocalDate;
import com.imobiliaria.classes.Aluguel;
import com.imobiliaria.classes.Venda;

public class Principal {

  public static void main(String[] args) {

    Aluguel apto01 = new Aluguel("Rua dos bobos, 00", LocalDate.now(), 1200);
    System.out.println("Endereço: " + apto01.getEndereco());
    System.out.println("Valor aluguel: " + apto01.getValorAluguel());

    Venda apto02 = new Venda("Rua sola, 355", LocalDate.now(), 350000);
    System.out.println("Endereço: " + apto02.getEndereco());
    System.out.println("Valor aluguel: " + apto02.getValorVenda());

    apto01.ativarCadastro();
    apto01.alugar();

    System.out.println(apto01.isAlugado());

  }

}
