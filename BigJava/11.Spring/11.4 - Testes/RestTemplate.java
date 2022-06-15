@SpringBootTest
public class EstudanteControllerTests {

  @Autowired
  private RestTemplate restTemplate;
  
  @Test
  void deve_RetornarListaVazia_Quando_NaoHouverEstudantes() {            
    var resposta = restTemplate.getForEntity("http://localhost:8080/estudantes", List.class); // 1

    assertThat(resposta.getStatusCode()).isEqualTo(HttpStatus.OK); //2

    assertThat(resposta.hasBody()).isTrue(); //3
    assertThat(resposta.getBody()).isEmpty();
  }
}

/**
 * No teste apresentado acima, temos:

  1 = Simulação de chamada ao endpoint existente na aplicação;
  2 = Retorno da aplicação, indicando que a chamada foi efetuada com sucesso (OK representa o status_code 200);
  3 = Indicação de que a função retornou um body válido, porém vazio, no caso, uma lista vazia.


 * Observação: A classe RestTemplate não é gerenciada pelo Spring, ou seja, não é considerada um Bean. Para efetuar esse teste, seria necessário instanciar o objeto na classe de teste, ou indicar ao spring que ela deveria ser reconhecida como um bean gerenciável.

  Para que a segunda abordagem seja bem-sucedida, é necessário o uso da seguinte configuração:
*/
@Bean
public RestTemplate restTemplate() {
  return new RestTemplate();
}


/**
 * Em casos em que a aplicação já se encontra rodando na porta 8080 e se faz necessário rodar a suite de testes, pode-se informar ao Spring que se deseja trocar a porta, evitando assim possíveis conflitos. Para isso, deve-se indicar o uso randômico da porta do servidor de teste:
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)


// E para ter acesso à porta selecionada, é necessário o uso da anotação LocalServerPort
@LocalServerPort
private int porta;

@Test
void deve_RetornarListaVazia_Quando_NaoHouverEstudantes() {            
  var resposta = restTemplate.getForEntity("http://localhost:"+ porta +"/estudantes", List.class);

  assertThat(resposta.getStatusCode()).isEqualTo(HttpStatus.OK);

  assertThat(resposta.hasBody()).isTrue();
  assertThat(resposta.getBody()).isEmpty();
}
