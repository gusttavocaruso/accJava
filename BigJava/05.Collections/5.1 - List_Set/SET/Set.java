public class Set {

  var estudantes = Set.of("João", "Maria", "Pedro", "Rosa"); // lista imutável

  var estudantes = new HashSet<>(); // mutável

}


// A operação de adição de elementos no Set retorna um boolean. Como o Set não admite elementos repetidos, essa flag retornada indica se houve sucesso na operação:

public static void main(String[] args) {

  var estudantes = new HashSet<>();
  var adicionouJoao = estudantes.add("João");
  var adicionouJoaoDeNovo  = estudantes.add("João");
  var adicionouMaria  = estudantes.add("Maria");
  System.out.println(String.format("adicionouJoao: %b", adicionouJoao)); // true
  System.out.println(String.format("adicionouJoaoDeNovo: %b", adicionouJoaoDeNovo)); // false
  System.out.println(String.format("adicionouMaria: %b", adicionouMaria)); // true

}
