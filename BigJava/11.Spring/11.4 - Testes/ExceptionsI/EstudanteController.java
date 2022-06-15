@RestController
public class EstudanteController { 
  ...
  
  @GetMapping("/estudantes/{nome}")
  public Estudante buscarEstudantePeloNome(@PathVariable String nome){
    return estudanteService.buscarEstudantePeloNome(nome);
  }

}
