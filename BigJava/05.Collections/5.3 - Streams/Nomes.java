public class Nomes {

  Collection<String> nomes = List.of("Fulano", "Maria", "Fulano", "José", "José", "Joana");
  long pessoasDistintas = nomes.stream()
              .distinct()
              .count();

  System.out.println(pessoasDistintas); // 4

}
