public class ContaBancaria { 

  public void depositar(int valor) { 
    System.out.println(valor); 
  } 
 
}

public class Banco { 

  public static void main(String[] args) { 
    ContaBancaria conta01234 = new ContaBancaria(); 
    conta01234.depositar(500);
  }

}