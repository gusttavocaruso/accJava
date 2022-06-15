@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EstudanteNaoEncontradoException extends RuntimeException {

  public EstudanteNaoEncontradoException(String message) {
    super(message);
  }

}
