@ControllerAdvice
public class GerenciadorExceptionController {

  @ExceptionHandler({
    EstudanteNaoEncontradoException.class,
    NomeNaoEncontradoException.class,
    MatriculaNaoEncontradaException.class
  })

  public ResponseEntity<String> handleRecursoNaoEncontradoException(
    RuntimeException exception) {
      return ResponseEntity
          .status(HttpStatus.NOT_FOUND)
          .body(exception.getMessage());
  }

}

/**
 * A anotação utilizada faz com que o Spring a trate como um @Component. Sendo assim, não será necessário instanciar um objeto dessa classe em outro local. O Spring terá a atribuição de efetuar a injeção de dependência.

Após criada, a responsabilidade pelo tratamento de erros que antes existiam apenas na classe EstudanteController passa a fazer parte dessa nova classe


 * Essas alterações são suficientes para que, através de um controlador centralizado, as exceções lançadas pela aplicação sejam mapeadas para seu devido status. Caso queira que o controlador seja especifico de um pacote, é possível utilizar a especificação da anotação para indicar seu escopo @ControllerAdvice("com.trybe.aceleracaojava.aulaspringboot.controller"). Assim, apenas as classes de controller dentro do pacote serão atendidas por esse ControllerAdvice.

Não é comum o uso de múltiplos ControllerAdvice. Com o aumento de classes responsáveis por efetuar esse gerenciamento, aumenta também a complexidade para mantê-los. */
