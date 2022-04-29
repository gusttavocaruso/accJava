public class get() {

  public static void main(String[] args) {
    var estudantes = List.of("João", "Maria", "Pedro", "Rosa");
    String estudanteDoIndice2 = estudantes.get(2);
    System.out.println(estudanteDoIndice2); // Pedro
  }

}
