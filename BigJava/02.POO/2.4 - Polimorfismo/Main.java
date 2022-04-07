public class Main {
  
  public static void main(String[] args) { 
    Carro carro = new Carro(); 
    carro.abastecer(); 
    carro.acelerar(); 
     
    Moto moto = new Moto(); 
    moto.abastecer(); 
    moto.acelerar();             
  }

}

/**

Saída =>
Método abastecer da classe Veiculo. 
Método acelerar da classe Carro. 
Método abastecer da classe Veiculo. 
Método acelerar da classe Moto.

 */
