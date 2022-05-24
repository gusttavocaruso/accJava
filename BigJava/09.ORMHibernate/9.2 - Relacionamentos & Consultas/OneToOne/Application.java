public class Application {

  public static void main(String[] args) {

    PessoaDesenvolvedora p = new PessoaDesenvolvedora();
    p.setNome("Pessoa Desenvolvedora 1");

    Salario s = new Salario();
    s.setValor(5000.0);
    s.setPessoaDesenvolvedora(p);

    p.setSalario(s);

    PessoaDesenvolvedoraService serviceP = new PessoaDesenvolvedoraService();
    serviceP.save(p);
  }

}
