@Entity
@Table(name = "tb_pessoa_desenvolvedora")
public class PessoaDesenvolvedora {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  @JoinColumn(name = "salario_id")
  @OneToOne(fetch = FetchType.LAZY)
  private Salario salario;

    /** setters e getters **/
}
