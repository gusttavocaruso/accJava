public class Calculadora {

  public int soma(int a, int b) { 
    return a + b; 
  } 

  public int soma(int a, int b, int c) { 
      return a + b + c; 
  } 

  public double soma(double a, double b) { 
      return a + b; 
  }

}

// Aqui nessa classe, os métodos estão com o mesmo nome, mas a quantidade de parâmetros e os tipos deles são diferentes. Quando chamamos esses métodos, o Java saberá qual deles será utilizado pela quantidade de parâmetros recebidos e/ou pelos tipos deles
