/**
 * Vamos começar com o exemplo de uma papelaria: imagine que você tem uma frase com excesso de vírgulas e deseja removê-las das duas primeiras palavras. Para isso, limitamos a 3 divisões após a vírgula. O limite, então, é o número que especifica um limite no número de divisões a serem encontradas. Por exemplo:
 */

public class SplitTwo {

  String frase = "caneta,lápis,lapiseira,caderno,borracha"; 
  String formatado[] = frase.split(",", 3); 

  for (String novo_formato : formatado) 
    System.out.println(novo_formato); // imprime ["caneta", "lápis", "lapiseira,caderno,borracha"]

}

/**
 * Nos exemplos acima, podemos notar que, sem um limite definido, todos os valores foram separados em diferentes itens no array de String. Quando foi adicionado um limite positivo, o array encontrou dois valores, separou-os e colocou o restante como um valor único, limitando o tamanho do array.
 */
