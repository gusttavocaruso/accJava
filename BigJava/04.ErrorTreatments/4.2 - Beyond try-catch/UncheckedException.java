/**
 * Uma exceção do tipo unchecked é um erro que só será capturado em tempo de execução, ou seja, o compilador não nos avisará que precisamos tratar esse erro.

A diferença na construção de nossa classe customizada é que agora ela terá que ser subclasse de RuntimeException, que por sua vez é subclasse de Exception.
 */

public class NomeDeArquivoInvalidoException extends RuntimeException { 
   
  public NomeDeArquivoInvalidoException() { 
      super("Nome de arquivo não pode conter números"); 
  }

}

import java.io.IOException; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.Scanner; 


public class App {

  public static void main(String[] args) { 
    Scanner entrada = new Scanner(System.in); 
    System.out.println("Digite o caminho do arquivo"); 
    String caminho = entrada.next(); 
      
    escreverLinhas(caminho); 
  } 
    
  public static void escreverLinhas(String caminho){ 
    if(contemNumero(caminho)) { 
      throw new NomeDeArquivoInvalidoException(); 
    } 

    Path caminhoArquivo = Paths.get(caminho); 
    try { 
      Files.readAllLines(caminhoArquivo).forEach(System.out::println); 
    } catch (IOException e) { 
      System.out.println(e); 
    }
  }

  public static boolean contemNumero(String palavra) {
    for(char c : palavra.toCharArray()) {
      if(Character.isDigit(c)) {
        return true;
      }
    }
    return false;
  }

}

/**
 * Uma grande diferença que podemos ver aqui é que o compilador não nos obriga a usar try-catch quando chamamos o método escreverLinhas. Também não precisamos utilizar o comando throws porque essa é uma exceção do tipo unchecked. Nós só sabemos da existência dela durante a execução do programa. Então, se cairmos no fluxo de erro, nosso programa será encerrado




 * Como não tratamos a exception, o compilador permitiu a execução, mas o caso de erro aconteceu mesmo assim, e nosso programa foi encerrado sem o tratamento correto. No console, podemos perceber que nossa exceção customizada foi lançada e a mensagem que definimos em seu contrutor foi impressa. Agora que sabemos que existe um caso de erro, podemos tratá-lo com o uso do try-catch:
 */

public static void main(String[] args) { 
  Scanner entrada = new Scanner(System.in); 
  System.out.println("Digite o caminho do arquivo"); 
  String caminho = entrada.next(); 

  try { 
    escreverLinhas(caminho); 
  } catch (NomeDeArquivoInvalidoException e ) { 
    System.out.println("Nome do arquivo está inválido"); 
  } finally { 
    entrada.close(); 
  }

}