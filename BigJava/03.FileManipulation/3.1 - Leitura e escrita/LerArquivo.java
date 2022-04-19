package trybe; 
   
import java.io.BufferedReader; 
import java.io.File; 
import java.io.FileReader; 
import java.io.IOException; 
 
public class LerArquivo {

  private static final String caminhoArquivo = "/path/to/some/file.txt"; 
    
  public void lerConteudoArquivo() {

    File meuArquivo = new File(caminhoArquivo); 
    FileReader leitorArquivo = null; 
    BufferedReader bufferedLeitor = null; 

    if(meuArquivo.exists()) { 
      try { 
        leitorArquivo = new FileReader(meuArquivo ); 
        bufferedLeitor = new BufferedReader(leitorArquivo); 

        String conteudoLinha = bufferedLeitor.readLine(); 

        while(conteudoLinha != null) {
          System.out.println(conteudoLinha);
          conteudoLinha = bufferedLeitor.readLine(); 
        }
      } catch (IOException  e) {
        e.printStackTrace();
      } finally {
        this.fecharObjetos(leitorArquivo, bufferedLeitor);
      }
    }

  }

  private void fecharObjetos(FileReader fileReader, BufferedReader bufferedReader) { 
    try {
      fileReader.close();
      bufferedReader.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}

/**
 * No código acima, criamos um objeto File para representar nosso arquivo. Posteriormente, criamos mais 2 objetos das classes FileReader e BufferdRead. Esse primeiro é o meio que o Java nos fornece para trabalhar com leitura de caracteres do arquivo. Já o segundo é um mecanismo intermediário entre o arquivo e nosso programa, que funciona como um espaço de memória para aquela operação.

O BufferReader lê nosso arquivo linha por linha. Na estrutura do arquivo, essas linhas são delimitadas pelo caractere ‘\n’. Para obter o conteúdo da linha, chamamos o método readLine() e, caso o retorno desse método seja null, é um indicativo de que o arquivo acabou.

Pensando nesse comportamento, na linha 23 criamos um laço de repetição que será executado enquanto o arquivo não for null e mandamos imprimir o conteúdo daquela linha no console. O próximo passo é ler o conteúdo da linha seguinte até que todas sejam lidas.

Perceba que a operação de leitura pode lançar uma exceção. Para resolver isso, circulamos nosso trecho de código com os blocos Try/Catch. Também adicionamos o bloco finally, garantindo que o conteúdo dele sempre será executado. Nesse último, chamamos o método que criamos, responsável por fechar nosso arquivo.
 */
