public class ReplaceAll {

  String nomes = "Maria Magali, Magali da Silva, Magali Medeiros"; 
  String pessoa = "Laura"; 
   
  nomes = nomes.replaceAll("Magali", pessoa); 
   
  System.out.println(nomes); // imprime: Maria Laura, Laura da Silva, Laura Medeiros

}
