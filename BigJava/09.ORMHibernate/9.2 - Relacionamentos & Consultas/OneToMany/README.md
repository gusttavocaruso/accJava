### Classes PessoaDesenvolvedora & Commit

@OneToMany: Definimos o relacionamento um para muitos com as seguintes propriedades:
    - mappedBy (mapeado por): É o nome do atributo da entidade em que está associada.

    - orphanRemoval=true: Significa que a entidade filha (Commit) deve ser removida automaticamente pelo ORM se não for mais referenciada por uma entidade pai. Não confundir com cascadeType, que tem a mesma ideia, porém no nível do banco de dados.

    - cascade = CascadeType.ALL: Indica ao Hibernate que, para um registro deletado nessa entidade, todos os correspondentes na entidade a que esse registro se relaciona também devem ser deletados. Ou seja, se deletar uma PessoaDesenvolvedora, todos os seus commits também devem ser deletados.

@ManyToOne: Definimos o relacionamento muitos para um.

@JoinColumn: Definimos, pela propriedade name, o nome da coluna que queremos associar na tabela de commit.

### Classe main Application

No código acima, instanciamos dois objetos do tipo Commit, atribuímos um valor ao atributo descricao e associamos o objeto p ao atributo pessoaDesenvolvedora do objeto do tipo Commit. E então adicionamos cada commit instanciado ao objeto p. 
