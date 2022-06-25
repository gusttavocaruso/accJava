Rodando o DockerFile 
`docker build . -t aceleracao-java-multi-stage-build:v1`

Verificando imagens existentes e se foi criada
`docker images`

Roda aplicação a partir da imagem criada
`docker run aceleracao-java-multi-stage-build:v1 -p 8888:8888`
