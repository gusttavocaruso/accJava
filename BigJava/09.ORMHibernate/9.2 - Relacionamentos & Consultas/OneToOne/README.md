### Classes PessoaDesenvolvedora & Salario

A entidade PessoaDesenvolvedora tem um atributo chamado salário do tipo Salario, e as anotações @OneToOne desse atributo estão representando um relacionamento um para um para a entidade Salario. De forma similar, a entidade Salario possui um atributo do tipo PessoaDesenvolvedora anotada com OneToOne, que representa o relacionamento.

 Vamos entender melhor cada anotação desse exemplo:

@Table: Através da propriedade name, definimos o nome que essa entidade representará no banco de dados. Nesse caso, usamos o prefixo tb (abreviação de tabela) para diferenciar do nome da entidade.

@OneToOne: Definimos o relacionamento um para um com as seguintes propriedades:
    - mappedBy (mapeado por): É o nome do atributo da entidade a que está associada.

    - orphanRemoval=true: Significa que a entidade filha (Salário) deve ser removida automaticamente pelo ORM se não for mais referenciada por uma entidade pai. Não confundir com cascadeType, que tem a mesma ideia, porém no nível do banco de dados.

    - fetchType=LAZY: Recupera a entidade do relacionamento somente quando realmente precisamos dela, ou seja, no momento em que invocamos o método getter do atributo. É importante saber que a sessão deve estar aberta para invocar o getter e recuperar a entidade, pois o Hibernate usa o padrão proxy. Caso contrário (quando a sessão for fechada), a entidade passará do estado persistente para desanexado, e uma exceção LazyInitializationException será lançada.

@JoinColumn: Definimos, pela propriedade name, o nome da coluna que queremos associar na tabela de salario.

### Classe principal Application

É instanciado um objeto do tipo PessoaDesenvolvedora e atribuído um valor ao atributo nome. É criado um objeto do tipo Salario ao qual é atribuído um valor ao atributo valor, e também colocamos o objeto do tipo PessoaDesenvolvedora no atributo correspondente do objeto do tipo Salario.

Uma vez que o objeto do tipo Salario foi criado, vamos atribuí-lo ao atributo salario do objeto p. Por fim, chamamos um serviço que se encarrega de salvar o objeto p no banco de dados
