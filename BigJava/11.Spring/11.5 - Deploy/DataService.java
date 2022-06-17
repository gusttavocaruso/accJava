@Service
public class DataService {

  public Data retornaDataAtual() {
    return new Data(LocalDateTime.now(ZoneId.of("UTC")));
  }

}
