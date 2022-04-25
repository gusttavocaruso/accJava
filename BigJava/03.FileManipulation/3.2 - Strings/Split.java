public class Split {

  String casasTexto = "Grifinória;Sonseria;Corvinal;Lufa-Lufa"; 
  String casas[] = casasTexto.split(";"); 

  for (String casa : casas) 
    System.out.println(casa);

  // =======================

  String casasTexto = "Grifinória123Sonseria456Corvinal789Lufa-Lufa"; 
  String casas[] = casasTexto.split("\d+"); 

  for (String casa : casas)
    System.out.println(casa);

}


/**
 * Observe que a expressão regular \d+, vista no exemplo do código acima, encontra todos os números de 0 a 9, independente de quantos são. Isso significa que o método split vai encontrar todos os números e dividir a String, adicionando tudo em um array e retornando String sem números. Com isso, mesmo que os números mudem entre os nomes, o resultado ainda será o mesmo
 */
