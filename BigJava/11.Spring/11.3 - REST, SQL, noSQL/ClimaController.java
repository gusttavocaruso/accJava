@RestController
@RequestMapping(value = "/clima")
public class ClimaController {

  @Autowired
  private CidadeRepository repo;

  @GetMapping("/cidade/{nome}")
  public Cidade cidade(@PathVariable String nome) {
    return repo.findByName(nome);
  }

}

/**
 * @RestController - Informa ao Spring que esta classe não é uma classe convencional e sim um controller, que, como o próprio nome sugere, controla as rotas e o fluxo das informações em cada endpoint.

 * @RequestMapping - Mapeia as requisições para o Spring, passando os dados referentes à requisição que vier de http://localhost/clima/. Esse caminho é indicado pelo parâmetro value do código e indica que os endpoints declarados neste controller podem ser executados sempre que uma chamada acontecer para essa URL da aplicação.

 * @AutoWired - Resumidamente, essa anotação faz a injeção de dependências (outras classes necessárias para a execução do nosso código), indicando ao Spring que ele fará o controle das instâncias dessas classes quando a classe Controller for carregada.

 * @GetMapping - De forma semelhante ao @RequestMapping, essa anotação mapeia a rota referente ao método. O endpoint que chega neste método é o http://localhost/clima/{nome}. O {nome} é um parâmetro que deve ser informado pelas pessoas clientes da aplicação no momento de fazer uma chamada do tipo GET para esse endpoint, sendo o nome utilizado para a busca. Esse parâmetro tem ligação direta com a próxima anotação.

 * @PathVariable - Indica que o método precisa receber como parâmetro uma String nome, que será o complemento da chamada a esse endpoint descrita na anotação @GetMapping vista acima.
 */
