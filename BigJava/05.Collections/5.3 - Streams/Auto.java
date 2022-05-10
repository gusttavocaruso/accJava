/**
 * “Precisamos cadastrar no banco de dados os números de chassi de todos os automóveis ‘Modelo A’, fabricados entre 2015 e 2017, como pendentes de recall“.
 */

public class Auto {

  Collection<Automovel> automoveis = obterAutomoveis();
  List<String> paraRecall = automoveis.stream()
          .filter(e ->  "Modelo A".equals(e.getModelo()))
          .filter(e ->  e.getAnoFabricacao() >= 2015 && e.getAnoFabricacao() <= 2017)
          .map(auto -> auto.getChassi())
          .collect(Collectors.toList());
}
