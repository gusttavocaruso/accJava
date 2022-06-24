Site: `https://code.quarkus.io/`

Extensão: `RESTEasy Jackson`

Download zip

Para subir: `mvn compile quarkus:dev`


ou no terminal:

```
mvn io.quarkus.platform:quarkus-maven-plugin:2.6.3.Final:create \
    -DprojectGroupId=com.betrybe \
    -DprojectArtifactId=quarkus-request-filter \
    -DclassName="com.betrybe.LivroController" \
    -Dpath="/livro" \
    -Dextensions="resteasy-jackson"
```
