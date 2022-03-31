import java.util.Scanner;

  class UsandoScanner { 

    public static void main(String[] args) { 

      Scanner scanner = new Scanner(System.in);
      System.out.print("Entre com o primeiro número: ");
      String input1 = scanner.next();
      System.out.print("Entre com o segundo número: ");
      String input2 = scanner.next();
      scanner.close();

      int n1 = Integer.parseInt(input1);
      int n2 = Integer.parseInt(input2);

      int resultado = n1 + n2;
      System.out.println("O resultado da soma é: " + resultado);

    }

  }

/**
* Nesse código, nós instanciamos um objeto do tipo Scanner e o utilizamos para ler entradas do console do Java, depois convertemos a entrada da pessoa usuária em inteiro e realizamos uma soma, e por fim imprimimos o resultado no console. Note que o método .parseInt() só converte Strings que representam valores numéricos. Caso você tente converter uma letra, ou qualquer caractere que não seja um número inteiro, será gerado um erro.

* Há também como converter inputs do Scanner para SHORT, LONG, FLOAT e DOUBLE utilizando sintaxe bastante parecida com as linhas 14 e 15 desse código. Exs:

    SHORT =>
      short idade = Short.parseShort(input);

    LONG =>
      long populacaoChinesa = Long.parseLong(input);

    FLOAT =>
      float gasolina = Float.parseFloat(input1);

    DOUBLE =>
      double gasolina = Double.parseDouble(input1);
*/
