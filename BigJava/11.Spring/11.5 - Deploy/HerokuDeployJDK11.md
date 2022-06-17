⚠️ Atenção: antes de realizarmos o deploy, devemos indicar ao Heroku que nossa aplicação deverá ser executada em uma JDK na versão 11, pois por padrão o Heroku executa aplicações Java na versão 8. Para isso, deve ser adicionado um arquivo com o nome `system.properties` na raiz do projeto, conforme mostram os códigos a seguir:

`java.runtime.version=11`
