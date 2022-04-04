public class Main {

  public static void main(String[] args) { 
    Calculadora objCalculadora = new Calculadora(); 
 
    objCalculadora.setPrimeiroNumero(10); 
    objCalculadora.setSegundoNumero(7); 
     
    System.out.println("Resultado da multiplicação é: " + objCalculadora.multiplicar()); 
  }

}
