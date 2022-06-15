@Service
public class EstudanteService {
  ...

  public Estudante buscarEstudantePeloNome(String nome) {
    return estudanteRepository.findByNome(nome)
        .orElseThrow(() -> new EstudanteNaoEncontradoException("Estudante não encontrado"));
  }

}