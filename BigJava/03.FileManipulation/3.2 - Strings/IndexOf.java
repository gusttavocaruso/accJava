public class IndexOf {

  String saudacao = "Olá, Mundo!"; 
  System.out.println(saudacao.indexOf('M')); // imprime: 5

  String lorem = "Lorem ipsum dolor sit amet"; 
  System.out.println(lorem.indexOf('s', 10)); // imprime: 18
  /**
   * Perceba que agora foi impressa a primeira posição do caractere s a partir da posição 10, ou seja, primeiro serão puladas 10 posições, e depois a primeira ocorrência do caractere s será encontrada.
   */

}
