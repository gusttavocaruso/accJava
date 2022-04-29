public class set() {

  public static void main(String[] args) {
    var estudantes = Arrays.asList("João", "Maria", "Pedro", "Rosa");
    estudantes.set(0, "Joana"); // Altera o valor do indece 0 para Joana
  }

}

/**
O Arrays.asList retorna uma lista de tamanho fixo, cujos valores são mutáveis. Então agora conseguirmos alterar um valor da nossa lista. No entanto, não poderemos adicionar ou remover elementos dela. Para adicionar ou remover elementos, podemos criar explicitamente um ArrayList a partir da nossa lista.
 */
