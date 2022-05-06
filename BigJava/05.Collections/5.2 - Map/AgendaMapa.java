import java.util.HashMap;
import java.util.Map;

public class AgendaMapa {

  private Map<String, String> agenda = new HashMap<>();

  public void incluirContato(String nome, String telefone) {
    this.agenda.put(nome, telefone);
  }

  public void excluirContato(String nome) {
    this.agenda.remove(nome);
  }

  public boolean verificaContato(String nome) {
    return this.agenda.containsKey(nome);
  }

  public int tamanhoAgenda() {
    return this.agenda.size();
  }

  public String atualizarTelefone(String nome, String telefone) {
    return this.agenda.put(nome, telefone);
  }

  public String obterTelefone(String nome) {
    return this.agenda.get(nome);
  }

}
