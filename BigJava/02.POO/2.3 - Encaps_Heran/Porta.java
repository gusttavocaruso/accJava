public class Porta {

  private int tamanho; 
  private String material; 
 
  protected boolean estaAberta;
  // O modificador protected permite visibilidade, dos seus atributos e métodos, para todas suas subclasses, desde que as mesmas estejam dentro do mesmo pacote da superclasse.
 
  public Porta() { 
    this.estaAberta = false; 
  } 
 
  public int getTamanho() { 
    return this.tamanho; 
  } 
 
  public void setTamanho(int tamanho) { 
    this.tamanho = tamanho; 
  } 
 
  public String getMaterial() { 
    return this.material; 
  } 
 
  public void setMaterial(String material) { 
    this.material = material; 
  } 
 
  public void abrir() { 
    if (estaAberta) { 
      System.out.println("Porta já estava aberta"); 
    } else { 
      estaAberta = true; 
      System.out.println("Porta foi aberta"); 
    } 
  } 
 
  public void fechar() { 
    if (!estaAberta) { 
      System.out.println("Porta já estava fechada"); 
    } else { 
      estaAberta = false; 
      System.out.println("Porta foi fechada"); 
    } 
  }

}
