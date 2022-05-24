public class Application {

  public static void main(String[] args) {

    PessoaDesenvolvedora p = new PessoaDesenvolvedora();
    p.setNome("Pessoa Desenvolvedora 1");

    Salario s = new Salario();
    s.setValor(5000.0);
    s.setPessoaDesenvolvedora(p);

    p.setSalario(s);

    Commit c = new Commit();
    c.setDescricao("Fist commit");
    c.setPessoaDesenvolvedora(p);

    p.addCommit(c);

    c = new Commit();
    c.setDescricao("Second commit");
    c.setPessoaDesenvolvedora(p);

    p.addCommit(c);

    PessoaDesenvolvedoraService serviceP = new PessoaDesenvolvedoraService();
    serviceP.save(p);
  }

}
