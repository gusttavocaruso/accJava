import java.util.Scanner; 
   
class UsandoScanner { 

  public static void main(String[] args) { 

    Scanner scan = new Scanner(System.in); 
    System.out.print("Qual o seu nome: "); 
    String nome = scan.next(); 
    System.out.println("Boas-vindas, " + nome + "!"); 
    scan.close(); 

  }

}

/**
* Para ler entradas, sobretudo usando a Scanner, nós recebemos todos os dados como Strings!
*/
