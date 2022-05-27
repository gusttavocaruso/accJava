Vamos criar um projeto do zero, usando Maven e um archetype pronto para webapps.

```
mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-webapp -DarchetypeVersion=1.4
```

Depois de alguns logs, o terminal se tornará interativo:

```
Define value for property 'groupId': com.trybe
Define value for property 'artifactId': trybe-webapp
Define value for property 'version' 1.0-SNAPSHOT: :
Define value for property 'package' com.trybe: :
```

Ao final da execução, teremos um projeto pronto para importar na IDE de sua preferência. Vamos conferir o pom.xml, note a seguir que o packaging já está como WAR.

```xml
  <groupId>com.trybe</groupId>
  <artifactId>trybe-webapp</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>war</packaging>
```

Vamos adicionar as seguintes dependências:

```xml
  <dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>5.3.15</version>
  </dependency>

  <dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>3.0.1</version>
    <scope>provided</scope>
  </dependency>
```

Depois de importar o projeto na sua IDE, abra o terminal no diretório do projeto e execute:

```
mvn install
```

Um diretório target será criado no seu projeto.


**Projetos usando Spring Boot** costumam ser um pouco diferentes pela estrutura apresentada. Muito é feito por baixo dos panos, desde que você use a estrutura proposta por eles (no caso, um <parent>), que já traz algumas configurações previamente feitas.

```xml
  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.6.2</version>
    <relativePath/>
  </parent>
```
