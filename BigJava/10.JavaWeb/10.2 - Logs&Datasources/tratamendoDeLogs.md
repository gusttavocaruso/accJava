Os logs são muitos importantes em nosso dia a dia, já que, por meio deles, conseguimos corrigir bugs e verificar informações, por exemplo. Você vai ver que existem diferentes maneiras de registrar mensagens em ordem de severidade. Vejamos alguns exemplos:


TRACE — Utilizado somente quando você estiver “rastreando” o código para encontrar uma parte de um código especificamente.

DEBUG — Informações que são úteis para pessoas desenvolvedoras e não desenvolvedoras (TI, administradoras de sistemas, etc.).

INFO — Geralmente úteis para registrar (início / parada do serviço, suposições de configuração, variáveis que são imputadas). São informações que devem sempre estar disponíveis, mas normalmente não são requeridas em circunstâncias comuns. Este é o nível de configuração pronto para uso.

WARN — Qualquer coisa que possa causar estranhezas no aplicativo, mas está sendo recuperanda automaticamente.

ERROR — Algum erro que seja fatal para a operação, mas não para o serviço ou aplicativo (como quando não é possível abrir um arquivo ou há dados ausentes). Esses erros forçarão a intervenção da pessoa usuária (administradora ou usuária direta).

FATAL — Qualquer erro que está forçando o desligamento do serviço ou aplicativo para evitar a perda de dados. Reservo-os apenas para os erros e situações mais hediondas em que há garantia de corrupção ou perda de dados.

```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trybe-log")
@CrossOrigin(origins = "*")
public class RuleController {

  Logger logger = LoggerFactory.getLogger(RuleController.class);

  @RequestMapping("/")
  public String index() {
    logger.trace("A TRACE Trybe Message");
    logger.debug("A DEBUG Trybe Message");
    logger.info("An INFO Trybe Message");
    logger.warn("A WARN Trybe Message");
    logger.error("An ERROR  TrybeMessage");

    return "Olá Mundo";
  }

}
```

Ao executar, no seu console vai aparecer:
```
TRACE  br.com.trybe.LogExemploController - A TRACE Trybe Message
DEBUG br.com.trybe.LogExemploController - A TRACE Trybe Message
INFO     br.com.trybe.LogExemploController - An INFO Trybe Message
WARN  br.com.trybe.LogExemploController - A WARN Trybe Message
ERROR br.com.trybe.LogExemploController - An ERROR  TrybeMessage
```


Você deve estar se perguntando por que o tipo FATAL não está no exemplo acima. O SLF4J não possui o tipo FATAL, pois se o erro é fatal, sinal de que a aplicação Java caiu e com isso não o código Java não está mais funcional. Porém, se um determinado erro requer atenção além daquela para erros comuns, é necessário criar um marcador. Vamos criar um marcador FATAL, por exemplo:

```java
public class RuleController {

  Marker fatal = MarkerFactory.getMarker("FATAL");
  Logger logger = LoggerFactory.getLogger(RuleController.class);

  @RequestMapping("/")
  public String index() {
    logger.error(fatal, "Failed to obtain JDBC connection", e);
    return "Olá Mundo";
  }

}
```
