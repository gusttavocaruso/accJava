@Entity
@Table(name = "tb_commit")
public class Commit {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String descricao;

  @ManyToOne
  @JoinColumn(name = "pessoa_desenvolvedora_id")
  private PessoaDesenvolvedora pessoaDesenvolvedora;

    /** setters e getters **/
}
