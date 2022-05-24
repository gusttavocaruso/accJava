@Entity
@Table(name="T_LIVROS", schema="PUBLICACAO")
public class Livro {

  private String titulo;

  @Column(name="ISBN_NUMERO")
  private String isbn;
  ...
}

/**
 * Dessa forma, dizemos ao Hibernate que nossa classe Java chamada Livro representa a tabela T_LIVROS dentro do esquema PUBLICACAO do banco de dados.
 * 
 * A anotação @Column, além da propriedade name, nos permite definir propriedades adicionais da coluna, incluindo comprimento, se é anulável, se deve ser único, sua precisão e escala (se for um valor decimal), se é inserível e atualizável e assim por diante.
 */
