public class ValorNaoPermitidoException extends Exception{

  private static final long serialVersionUID = -8590604125147171026L;

  public ValorNaoPermitidoException() {
    super("Valor não permitido");
  }

}

/**
 * ⚠️ Atenção: Quando herdamos a classe Exception, o compilador irá sugerir que adicionemos um serialVersionUID, que serve como um identificador para quando a classe for convertida para JSON, e vice-versa. */
