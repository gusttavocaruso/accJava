import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ValorNaoPermitidoExceptionHandler implements ExceptionMapper<ValorNaoPermitidoException> {

  @Override
  public Response toResponse(ValorNaoPermitidoException exception) {
    var mensagemErro = exception.getMessage();
    var erro = new Error(mensagemErro);
    return Response.status(400).entity(erro).build();
  }

}

/*Aqui estamos herdando a classe ExceptionMapper, passando como parâmetro o tipo da exceção que queremos tratar. Dentro do método toResponse, podemos fazer o nosso tratamento de erro para retornar uma mensagem customizada para a pessoa usuária. */
