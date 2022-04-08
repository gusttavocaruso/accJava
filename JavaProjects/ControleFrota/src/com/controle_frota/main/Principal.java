package com.controle_frota.main;

import com.controle_frota.core.Caminhao;
import com.controle_frota.core.Carro;

public class Principal {

  public static void main(String[] args) {

    Carro C1 = new Carro("BIR 3464", 2018);
    Caminhao C2 = new Caminhao("TRR 3233", 2022);


    C1.abastecer("Posto 1", "Gusta", 110);
    C1.abastecer("Posto 9", "pepe", 80);

    C2.abastecer(null, "Pedro", 280);
    C2.abastecer(null, "Bino", 315);

    C1.listaAbastecimentos();
    C2.listaAbastecimentos();

  }

}
