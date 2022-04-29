public class ArrayList {

  public static void main(String[] args) {
    var estudantes = new ArrayList<String>(Arrays.asList("João", "Maria", "Pedro", "Rosa"));
    estudantes.add("Joana");
    System.out.println(estudantes);
  }

}

/**
E para remover? Podemos fazer a remoção por índice ou pelo próprio elemento. Nesse último caso, o método remove a primeira ocorrência para o qual o equals retornar true:
 */

public static void main(String[] args) {
  var estudantes = new ArrayList<String>(Arrays.asList("João", "Maria", "Pedro", "Rosa"));
  estudantes.remove(1);
  System.out.println(estudantes);
  estudantes.remove("Pedro");
  System.out.println(estudantes);
}
