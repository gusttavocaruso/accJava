public class Replace {

  public String getNumeralConta(String contaFormatada) { 
    return contaFormatada.replace('X', '0'); 
  }

  String nomes = "Maria Magali, Magali da Silva, Magali Medeiros"; 
  String pessoa = "Laura"; 

  nomes = nomes.replace("Magali", pessoa); 

  System.out.println(nomes); // imprime: Maria Laura, Laura da Silva, Laura Medeiros

}
