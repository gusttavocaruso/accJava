@Entity
@Table(name = "tb_projeto")
public class Projeto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  private String tecnologia;

  @ManyToMany(mappedBy = "projetos")
  private Set<PessoaDesenvolvedora> pessoasDesenvolvedoras;

  /* getters e setters */
}
