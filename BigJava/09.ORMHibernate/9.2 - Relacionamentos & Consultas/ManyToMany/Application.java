public class Application {
  
  public static void main(String[] args) {

    // Instanciar os objetos de serviços que vão persistir os dados no banco
    PessoaDesenvolvedoraService pessoaDesenvolvedoraService = new PessoaDesenvolvedoraService();
    ProjetoService projetoService = new ProjetoService();

    /**
     * Instanciar alguns projetos 
     */
    Projeto projetoA = new Projeto();
    projetoA.setNome("Projeto A");
    projetoA.setTecnologia("Java");
    projetoService.save(projetoA);

    Projeto projetoB = new Projeto();
    projetoB.setNome("Projeto B");
    projetoB.setTecnologia("Javascript");
    projetoService.save(projetoB);

    Projeto projetoC = new Projeto();
    projetoC.setNome("Projeto C");
    projetoC.setTecnologia("Golang");
    projetoService.save(projetoC);

    Projeto projetoD = new Projeto();
    projetoD.setNome("Projeto D");
    projetoD.setTecnologia("Python");
    projetoService.save(projetoD);

    /**
     * Instanciamos algumas pessoas desenvolvedoras e adicionamos projetos
     */
    PessoaDesenvolvedora pessoaDesenvolvedora1 = new PessoaDesenvolvedora();
    pessoaDesenvolvedora1.setNome("Pessoa 1");
    pessoaDesenvolvedora1.setLinguagens("Java,Python");
    // Persiste os dados no banco
    pessoaDesenvolvedoraService.save(pessoaDesenvolvedora1);

    pessoaDesenvolvedora1.addProjeto(projetoC);
    pessoaDesenvolvedora1.addProjeto(projetoD);
    // Persiste os dados no banco
    pessoaDesenvolvedoraService.update(pessoaDesenvolvedora1);

    PessoaDesenvolvedora pessoaDesenvolvedora2 = new PessoaDesenvolvedora();
    pessoaDesenvolvedora2.setNome("Pessoa 2");
    pessoaDesenvolvedora2.setLinguagens("Javascript,Golang");
    // Persiste os dados no banco
    pessoaDesenvolvedoraService.save(pessoaDesenvolvedora2);

    pessoaDesenvolvedora2.addProjeto(projetoA);
    pessoaDesenvolvedora2.addProjeto(projetoB);
    pessoaDesenvolvedora2.addProjeto(projetoC);
    // Persiste os dados no banco
    pessoaDesenvolvedoraService.update(pessoaDesenvolvedora2);

  }

}
