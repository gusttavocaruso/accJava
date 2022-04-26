 // arquivo Pessoa.java 
 public class Pessoa { 
   
  private String nome; 
   
  public Pessoa(String nome) { 
      this.nome = nome; 
  } 
   
  public String getNome() { 
      return this.nome; 
  }

} 

// arquivo App.java 
import java.util.Optional; 

public class App { 
  public static void main(String[] args) {

    Optional<Pessoa> optional = Optional.empty(); 
    if (optional.isPresent()) { 
      System.out.println("Pessoa existe"); 
    } else { 
      System.out.println("Pessoa não existe"); 
    }

    Pessoa pessoa = new Pessoa("Bob");
    Optional<Pessoa> optional = Optional.ofNullable(pessoa);
    if (optional.isPresent()) {
      System.out.println("Pessoa existe");
    } else {
      System.out.println("Pessoa não existe");
    }

  }

}

/**
 * Quando passamos uma instância de Pessoa para o Optional, conseguimos verificar se de fato existe algo ali dentro para podermos tomar uma ação. Desse jeito não há o risco de sermos surpreendidos por um NullPointerException, pois não estamos lidando diretamente com a classe pessoa, mas sim usando o Optional como intermediário.
 */
