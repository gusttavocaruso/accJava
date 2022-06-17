@RestController
public class DataController {

  private final DataService dataService;

  public DataController(DataService dataService) {
    this.dataService = dataService;
  }

  @GetMapping
  public Data retornaDataAtual() {
    return dataService.retornaDataAtual();
  }

}
