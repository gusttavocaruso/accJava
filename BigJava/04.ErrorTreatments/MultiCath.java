public class MultiCath {

  public static void main(String[] args) {

    int[] numeros = new int[10];
    Scanner entrada = new Scanner(System.in);

    try {
        System.out.println("Digite um número de índice que você quer acessar: "); 
        int indice = entrada.nextInt(); 
         
        numeros[indice] = 10; // essa linha pode lançar a ArrayIndexOutOfBoundsException 
        numeros[indice] = 2 / 0; // essa linha irá lançar a ArithmeticException

        System.out.println(numeros);
    } catch (ArrayIndexOutOfBoundsException e ) {
        System.out.println("Ops, essa posição não existe!"); 
    } catch (ArithmeticException e ) {
        System.out.println("Ops, não é possível dividir por 0"); 
    }
  }

}

/**
 * Aqui o código espera que uma informação seja digitada pela pessoa usuária. Se for digitado um número que não exista como posição do Array, será lançada exceção ArrayIndexOutOfBoundsException. Caso a posição seja válida, uma divisão por 0 será realizada, o que ocasionará a exceção ArithmeticException.
 */
