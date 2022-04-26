public static void main(String[] args) {

  int[] numeros = new int[10]; 
   
  try { 
    numeros[15] = 10; 
    System.out.println(numeros); 
  } catch (ArrayIndexOutOfBoundsException e) { 
    System.out.println("Ops, essa posição não existe!"); 
  } 

}

/**
 * Aqui estou criando um array com 10 posições, em que os índices vão de 0 até 9, e estou acessando a posição 15.
 */
