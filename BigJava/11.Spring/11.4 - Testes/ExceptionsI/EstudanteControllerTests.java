@SpringBootTest
@AutoConfigureMockMvc
public class EstudanteControllerTests {
  ...

  @Test
  public void deveRetornarNomeEMatriculaQuandoHouverEstudanteComMesmoNome() throws Exception {

    var estudante = new Estudante("1", "Formiga");

    mockMvc.perform(get("/estudantes/formiga"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.matricula").value(estudante.getMatricula()))
        .andExpect(jsonPath("$.nome").value(estudante.getNome()));
  }

  @Test
  public void deveRetornarNaoEncontradoQuandoNaoHouverEstudanteComMesmoNome() throws Exception {

    mockMvc.perform(get("/estudantes/teste"))
        .andExpect(status().isNotFound())
        .andExpect(content().string(is(emptyString())));

  }

}