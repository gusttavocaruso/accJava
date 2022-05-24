@Entity
@Table(name = "tb_salario")
public class Salario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Double valor;

  private String cargo;

  @OneToOne(mappedBy = "salario", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
  private PessoaDesenvolvedora pessoaDesenvolvedora;

    /** setters e getters **/
}
