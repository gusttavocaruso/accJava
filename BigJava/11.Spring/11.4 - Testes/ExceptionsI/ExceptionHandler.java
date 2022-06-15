/**
 * Outra maneira de conseguir o mesmo resultado é por meio da anotação @ExceptionHandler. Com ela, conseguimos agrupar várias exceptions para o mesmo status code, não sendo necessária a explicitação do status diretamente na classe. Essa anotação ainda nos permite que cada controller possa retornar um status diferente para as mesmas exceções.

 * Vejamos a seguir como ficaria o uso da @ExceptionHandler na classe controller: */
@RestController
public class EstudanteController {

  @GetMapping("/estudantes/{nome}")
  public Estudante buscarEstudantePeloNome(@PathVariable String nome) {
    return estudanteService.buscarEstudantePeloNome(nome);
  }

  @ExceptionHandler
  public ResponseEntity<String> handleEstudanteNaoEncontradoException(EstudanteNaoEncontradoException exception) {
    return ResponseEntity
        .status(HttpStatus.NOT_FOUND)
        .body(exception.getMessage());
  }

}

/**
 * O método de tratamento de exceção recebe uma exceção ou uma lista de exceções como um argumento que deseja tratar no método definido. O método deve ser anotado com @ExceptionHandler. Nesse exemplo, utilizamos a classe ResponseEntity<String> para definir o tipo de retorno, mas teria o mesmo comportamento de retornar o tipo String, desde que a função fosse anotada também com o @ResponseStatus(HttpStatus.NOT_FOUND). Assim, a classe EstudanteController fica responsável por indicar que, caso algum de seus métodos emita a exceção EstudanteNaoEncontradoException, a requisição terá como retorno o status code 404, e o body será a mensagem de erro — que, no caso, é Estudante não encontrado.


Caso deseje que mais de uma exeção retorne o mesmo status code, é possível realizar o agrupamento de exceções, evitando assim a duplicidade de métodos de tratamento */
@ExceptionHandler({
  EstudanteNaoEncontradoException.class,
  NomeNaoEncontradoException.class,
  MatriculaNaoEncontradaException.class
})

public ResponseEntity<String> handleRecursoNaoEncontradoException(RuntimeException excp) {
  return ResponseEntity
      .status(HttpStatus.NOT_FOUND)
      .body(excp.getMessage());
}

/**
 * O que difere no uso do agrupamento é que o argumento da função deixa de ser a classe específica que deseja tratar e passa a ser a classe superior a todas as mapeadas. No caso, deixa de receber EstudanteNaoEncontradoException e passa a lidar diretamente com a RuntimeException.

 * Embora a anotação ExceptionHandler aparente ser prática, ela nos traz alguns problemas inerentes à sua praticidade. Um desses problemas é o reúso. Cada classe controller (@RestController) precisaria definir explicitamente suas possíveis exceções e qual o status de retorno que deveriam possuir, fazendo com que a quantidade de códigos repetidos se torne cada vez mais presente. */
