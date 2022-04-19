public class ListarDiretorio {
  
  public void listar() {

    File meuArquivo = new File(caminhoArquivo); 

    if (meuArquivo.isDirectory() && meuArquivo.canRead()) { 
      for (File f : meuArquivo.listFiles()) { 
        System.out.println(f.getName()); 
      } 
    }
  }

}


/**
 * Como sabemos, a classe File é apenas uma representação. Com isso, podemos fazer algumas coisas legais caso essa representação seja de um diretório.
 *
 * Estamos verificando se o objeto meuArquivo é um diretório e se possuímos permissão suficiente para lê-lo integralmente. Caso sim, pegamos todo o seu conteúdo. Como é um diretório, dentro poderá conter outros diretórios ou arquivos. Com isso, podemos navegar pela árvore de arquivos do nosso sistema operacional.
 */