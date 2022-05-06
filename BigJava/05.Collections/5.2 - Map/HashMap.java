public class HashMap {

  var estudantes = new HashMap<String, String>();

  estudantes.put("x038702", "João");
  estudantes.put("x784244", "Maria");
  estudantes.put("x105852", "Joana");

  String valorAnterior = estudantes.put("x038702", "José");
  // Mesma matricula usada no mapeamento com João

  System.out.println("Valor anterior de x038702: " + valorAnterior);
  // Valor anterior de x038702: João
  System.out.println("Estudantes: " + estudantes);
  // Estudantes: {x038702=José, x784244=Maria, x105852=Joana}

  System.out.println(estudantes.get("x105852"));
  // Joana

  estudantes.remove("x038702");

}

/**
 * Note, no código acima, que o método put tem um comportamento interessante: caso haja um mapeamento com aquela chave, ele substitui o mapeamento e retorna o valor anterior.
 * “João” foi substituído no mapa, e o valor foi salvo na variável valorAnterior
 */