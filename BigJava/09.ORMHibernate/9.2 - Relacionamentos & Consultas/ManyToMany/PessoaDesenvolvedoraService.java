public class PessoaDesenvolvedoraService {

  EntityManagerFactory emf =
      Persistence.createEntityManagerFactory("com.trybe.acc.java.hibernate.sample-hibernate");

  public void save(PessoaDesenvolvedora p) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.persist(p);
    em.getTransaction().commit();

    em.close();
  }

  public void update(PessoaDesenvolvedora p) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.merge(p);
    em.getTransaction().commit();

    em.close();
  }

  public void delete(PessoaDesenvolvedora p) {
    EntityManager em = emf.createEntityManager();

    // Recupera se a entidade a ser deletada
    PessoaDesenvolvedora toBeDeleted = em.find(PessoaDesenvolvedora.class, p.getId());

    em.getTransaction().begin();
    em.remove(toBeDeleted);
    em.getTransaction().commit();

    em.close();
  }

  /**
  * Método main apenas para exemplificar o uso do métodos da classe
  */
  public static void main(String[] args) {

    // Instanciamos um objeto do tipo PessoaDesenvolvedora
    PessoaDesenvolvedora pessoaDesenvolvedora = new PessoaDesenvolvedora();
    pessoaDesenvolvedora.setNome("Pessoa 1");
    pessoaDesenvolvedora.setLinguagens("Java,Python");

    // Persiste os dados no banco
    this.save(pessoaDesenvolvedora);

    pessoaDesenvolvedora.setNome("Pessoa Desenvolvedora 1");
    // Persiste os dados no banco com ATUALIZAÇÃO
    this.update(pessoaDesenvolvedora);

    this.delete(pessoaDesenvolvedora);

  }

}
