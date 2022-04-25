/**
Suponha que você está fazendo uma integração entre sistemas, de modo que o sistema terceiro só consegue te retornar uma string com as informações da transação. As regras acordadas foram:

Os primeiros caracteres devem mostrar o total da transação;
Em seguida deve aparecer a letra M, para informar que os próximos 3 caracteres referem-se ao nome da moeda em que a transação foi efetuada.
Por exemplo: o valor retornado 123.45MCAD mostra que foi feita uma transação no valor de 123,45 em dólares canadenses(CAD).

O seu desafio é criar um conversor de transação para esse sistema!
*/

public class IndexOfCase {

  String transacao = "123.45MCAD"; // Informação recebida de outro sistema 
  int separador = transacao.indexOf('M'); // Retorna 6

  double total = getTotal(transacao, separador - 1); // Retorna 123.45 
  String moeda = getMoeda(transacao, separador + 1); // Retornar CAD


  // ======================
  // Sendo uma String, não necessariamente precisamos colocar apenas um caractere, é possível fazer algo como:
  String verso = "Um Anel para a todos governar, Um Anel para encontrá-los"; 

  System.out.println(verso.indexOf("governar")); // Imprime: 21
  /**
   Note que, no último exemplo, a função indexOf procura onde está o primeiro caractere da palavra governar na string verso. Dessa vez, a função não vai apenas procurar por g, mas sim pela palavra inteira. Quando encontrá-la, retornará a posição do primeiro caractere dessa palavra. Mas não para por aqui! Para que possamos criar códigos cada vez melhores, ainda temos novos métodos a aprender. Vamos descobrir quais são?
   */

}
