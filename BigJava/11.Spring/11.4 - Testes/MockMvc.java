import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
public class EstudanteControllerMockMVCTests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void deve_RetornarListaVazia_Quando_NaoHouverEstudantes() throws Exception {

    final var resposta = mockMvc.perform(get("/estudantes"));

    resposta
      .andExpect(content().contentType(MediaType.APPLICATION_JSON))
      .andExpect(status().isOk())
      .andExpect(content().string(containsString("[]")));
  }

}