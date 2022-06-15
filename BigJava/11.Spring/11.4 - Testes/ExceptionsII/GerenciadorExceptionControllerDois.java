// O código a seguir apresenta um exemplo da estruturação de cada uma das exceções citadas:

@ControllerAdvice
public class GerenciadorExceptionController {

  @ExceptionHandler(EstudanteNaoEncontradoException.class)
  public ResponseEntity<String> handleRecursoNaoEncontradoException(EstudanteNaoEncontradoException exception) {
    return ResponseEntity
        .status(HttpStatus.NOT_FOUND)
        .body(exception.getMessage());
  }

  @ExceptionHandler(RuntimeException.class)
  public ResponseEntity<String> handleRuntimeException(RuntimeException exception) {
    return ResponseEntity
        .status(HttpStatus.BAD_REQUEST)
        .body(exception.getMessage());
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<String> handleException(Exception exception) {
    return ResponseEntity
        .status(HttpStatus.INTERNAL_SERVER_ERROR)
        .body(exception.getMessage());
  }

  @ExceptionHandler(Throwable.class)
  public ResponseEntity<String> handleThrowable(Throwable exception) {
    return ResponseEntity
        .status(HttpStatus.BAD_GATEWAY)
        .body(exception.getMessage());
  }

}
