public class ObjetosString {
  public static void main(String[] args) {

    String phrase = "Estou aprendendo Java!"; 
    String numeros = "09890"; 
    String caractere = "a"; 

    StringBuilder stringBuilder = new StringBuilder(); 
    String eu = "Eu"; 
    String ja = " já"; 
    String sei = " sei"; 
    String usar = " usar"; 
    String strings = " Strings"; 
    String em = " em"; 
    String java = " Java"; 

    String frase = stringBuilder.append(eu) 
            .append(ja) 
            .append(sei) 
            .append(usar) 
            .append(strings) 
            .append(em) 
            .append(java) 
            .toString(); 

    System.out.println(frase);
    System.out.println(phrase);
    System.out.println(numeros);
    System.out.println(caractere);
  }
}
