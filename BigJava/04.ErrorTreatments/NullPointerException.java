public class NullPointerException {

  public static void main(String[] args) {

    try {

      printLength(null);

    } catch(NullPointerException e) {

      System.out.println("Não foi possível obter o comprimento da palavra: "
          +e.getMessage());

    }

  } 

  public static void printLength(String palavra) {
    System.out.println(palavra.length());
  }

}
