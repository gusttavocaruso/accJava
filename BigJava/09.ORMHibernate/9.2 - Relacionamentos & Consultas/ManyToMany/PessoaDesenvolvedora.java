@Entity
@Table(name = "tb_pessoa_desenvolvedora")
public class PessoaDesenvolvedora {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  private String linguagens;

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(name = "relacionamento_pessoadesenvolvedora_projeto",
      joinColumns = {@JoinColumn(name = "pessoa_desenvolvedora_id")},
      inverseJoinColumns = {@JoinColumn(name = "projeto_id")})
  private Set<Projeto> projetos;

  public PessoaDesenvolvedora() {
    super();
    this.projetos = new HashSet<Projeto>();
  }

  /* getters e setters */

  public void addProjeto(Projeto projeto) {
    this.projetos.add(projeto);
  }

}
