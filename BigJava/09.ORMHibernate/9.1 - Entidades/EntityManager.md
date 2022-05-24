## Alguns dos métodos usados pelo EntityManager:

merge - Adiciona uma entidade ao contexto de persistência, de modo que, quando a transação for confirmada, a entidade será persistida no banco de dados. Ao usar merge(), os objetos não são gerenciados pelo EntityManager.

find - Recupera uma entidade por sua chave primária.

refresh - Atualiza o estado da entidade atual do banco de dados.

flush - Sincroniza o estado do contexto de persistência com o banco de dados.

createQuery - Cria uma instância Query que pode ser usada para recuperar entidades do banco de dados.

createNamedQuery - Carrega uma Consulta que foi definida em uma anotação @NamedQuery dentro de uma das entidades de persistência. As consultas nomeadas fornecem um mecanismo limpo para centralizar consultas JPA na definição da classe de persistência na qual a consulta será executada.

getTransaction - Define uma EntityTransaction para usar em suas interações com o banco de dados. Assim como as transações de banco de dados, você normalmente iniciará a transação, executará suas operações e, em seguida, confirmará ou reverterá sua transação. O método getTransaction() permite acessar esse comportamento no nível do EntityManager, em vez do banco de dados.

persist - Adiciona uma entidade ao contexto de persistência, de modo que, quando a transação for confirmada, a entidade persistirá no banco de dados. Ao usar persist(), os objetos são gerenciados.