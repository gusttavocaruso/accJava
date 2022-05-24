A interface EntityManagerFactory se apresenta no pacote java.persistence e é utilizada para fornecer um gerenciador de entidades. É necessário passar como parâmetro o nome da unidade de persistência encontrada no arquivo persistence.xml:

```java
EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.trybe.acc.java.hibernate.sample-hibernate");  
```

Muitas coisas acontecendo nessa linha de código, não é mesmo? Vamos entender melhor:

Persistence - A Persistence é uma classe do javax.persistence usada para obter uma interface EntityManagerFactory.

createEntityManagerFactory() - O papel desse método é criar e retornar um EntityManagerFactory para a unidade de persistência. Assim, o método recebe como parâmetro o nome da unidade de persistência criada no arquivo persistence.xml.

2. Obter um EntityManager

Tem-se o objeto do tipo EntityManager a partir do objeto EntityManagerFactory (estabelecido no passo anterior), através da chamada ao método createEntityManager:

```java
EntityManager em = emf.createEntityManager();
```

Um objeto do tipo EntityManager interagirá com o banco de dados por meio dos métodos que já vimos anteriormente.

3. Escrevendo um dado na tabela

O dado na tabela é escrito a partir do objeto do tipo EntityManager. Analise o método save responsável por salvar um objeto do tipo Livro:

```java
  public void save(Livro livro) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.persist(livro);
    em.getTransaction().commit();

    em.close();
  }
```

Vamos entender cada linha:

```java
em.getTransaction().begin();
```

getTransaction() - Esse método retorna o objeto EntityTransaction no nível do recurso, isto é, a transação com o banco de dados.

begin() - Já esse método é usado para iniciar a transação com o recurso (o banco de dados).

```java
em.persist(livro);
```

persist() - É usado para tornar uma instância gerenciada e persistente. Uma instância de entidade é passada como parâmetro (lembre-se de que Livro está anotado como @Entity).

```java
em.getTransaction().commit();
```

commit() - É o método que, de fato, escreve as alterações feitas no banco de dados.

```java
em.close();
```

close() - Libera os recursos da fábrica, ou seja, fecha a transação atual com o banco de dados.
