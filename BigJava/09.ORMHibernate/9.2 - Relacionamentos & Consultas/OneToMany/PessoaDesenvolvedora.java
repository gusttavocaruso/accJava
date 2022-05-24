@Entity
@Table(name = "tb_pessoa_desenvolvedora")
public class PessoaDesenvolvedora {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  @OneToOne(mappedBy = "pessoaDesenvolvedora", cascade = CascadeType.ALL, orphanRemoval = true,
      fetch = FetchType.LAZY)
  private Salario salario;

  @OneToMany(mappedBy = "pessoaDesenvolvedora", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Commit> commits;

  /** setters e getters **/
}
