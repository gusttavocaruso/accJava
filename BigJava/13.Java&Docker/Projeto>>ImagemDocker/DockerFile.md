# Aqui estamos dizendo de onde ele deve fazer o download do Java 11 para construir essa imagem.
 FROM openjdk:11.0-jdk as build-image

# Nessas três linhas, é feita a criação do diretório em que será armazenada a fonte da aplicação de que será feita a imagem e indicado de onde será pego o código gerado.
 RUN mkdir -p /app/source
 COPY . /app/source
 WORKDIR /app/source

# Aqui estamos indicando que deverá ser executado o comando de empacotamento do maven para gerar o pacote dessa imagem.
 RUN ./mvnw clean package

# Estamos criando uma imagem nova apenas com JRE (Java Runtime Environment) a partir da imagem openjdk:11.0-jre e copiando o jar produzido no passo anterior, na imagem build-image, para a nova imagem limpa.
FROM openjdk:11.0-jre
COPY --from=build-image /app/source/target/*.jar /app/app.jar

# Nessas duas últimas linhas, indicamos em qual porta esse container irá subir e qual será o comando que ele executará quando for chamado.
EXPOSE 8888
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar"]
