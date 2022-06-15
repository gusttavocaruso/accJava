/**
 * Até então, o contexto completo da aplicação Spring está sendo iniciado — e na etapa anterior fizemos com que o servidor não fosse inicializado. A possibilidade de restrição de inicialização pode ir um pouco além, já que podemos restringir o contexto dos testes apenas à camada da web usando a anotação @WebMvcTest:
 */
@WebMvcTest(EstudanteController.class)
public class EstudanteControllerWebMvcTestTests {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private EstudanteService estudanteService;

  @Test
  void deve_RetornarListaVazia_Quando_NaoHouverEstudantes() throws Exception {
    doReturn(List.of()).when(estudanteService).listarEstudantes();

    final var resposta = mockMvc.perform(get("/estudantes"));

    resposta
      .andExpect(content().contentType(MediaType.APPLICATION_JSON))
      .andExpect(status().isOk())
      .andExpect(content().string(containsString("[]")));
  }

}

/**
 * Nesse cenário, estamos testando o verbo HTTP, o Content-Type da resposta, o Body da resposta, enfim, você pode testar o Request e Response. Perceba que o @Autowired do MockMvc constrói o seu Controller para ser usado no teste. Portanto, quando fazemos o get("/estudantes"), estamos fazendo uma requisição GET para a URL /estudantes.

 * Entenda que o MockMvc, como o próprio nome diz, é um mock, e simula apenas a camada do controller. As demais camadas (service, model, por exemplo) não são inicializadas e tampouco testadas. Nosso foco aqui é testar EXCLUSIVAMENTE o controller.

 * Assim validamos se o mapeamento da rota /estudantes está sendo efetuado como esperado pela nossa classe controller. Checamos se a resposta contém um StatusCode 200(OK) como esperado através da função andExpect(status().isOk()) e, como realizamos o mock da nossa classe de serviço, indicando que o resultado a ser retornado será uma lista vazia doReturn(List.of()), validamos se o Spring realizou o parseamento de forma esperada para um json que contém a lista vazia containsString("[]").

 * Isso implica que classes anotadas com @Component, @Service, @Configuration e @Bean não serão injetadas pelo spring. Como o endpoint utiliza uma classe service, é necessário realizar o mock através da anotação @MockBean, evitando assim o NullPointerException. Por fim, é preciso indicar o comportamento desejado para quando o método listarEstudantes for invocado, que no caso será retornar uma lista vazia, através do List.of().
 */
