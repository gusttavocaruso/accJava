public class List {

  public static void main(String[] args) {
    List<String> estudantes = Arrays.asList("João", "Maria", "Pedro", "Rosa");
    System.out.println(estudantes); // [João, Maria, Pedro, Rosa]
  }

}


// Esse trecho de código traz a criação de uma lista a partir da sintaxe simplificada de um array. É o equivalente a declarar:

List<String> estudantes = Arrays.asList(new String[]{"João", "Maria", "Pedro", "Rosa"});


// Ou mesmo:

String[] arrayDeEstudantes = new String[]{"João", "Maria", "Pedro", "Rosa"};
List<String> estudantes = Arrays.asList(arrayDeEstudantes);


/**
A documentação desse método não torna pública a implementação de List que é retornada. Mas como sabemos que todas as implementações de List devem atender a certas especificações, não precisamos nos preocupar. É como trabalhar instanciando um ArrayList ou LinkedList.
 */


// Outra forma ainda mais simples de se criarem listas, com a ressalva de que são listas imutáveis, é utilizando a sintaxe que estreou no Java 9:

var estudantes = List.of("João", "Maria", "Pedro", "Rosa");
