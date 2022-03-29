public class TiposPrimitivos {
  
  public static void main(String[] args) { 
    byte c = 9; 
    short num = 300;
    short formatadaComUnderscore = 20_000; // variável  
    
    int numeroInteiro = 10;
    int a = 10, b = 20, soma; // inicialização de variáveis inline
    soma = a + b; // atribuição da soma da variável a + b para a variável soma
    
    long numA = 102040;
    long numB = 102030405060L; // adicionado L no final para indicar que estamos inserindo um valor do tipo long

    float numC = -101.23f;
    float numD = 2.356f;

    double varDouble = 2.356; // double inicializado naturalmente 
    double doubleRecebendoFloat = 1.409F; // double aceitando número float 
    double doubleRecebendoLong = 12930L; // double aceitando número long 
    
    boolean isBoolean = true;
    boolean ehNumero = false;
    
    char letraA = 'a';
    char letraAMaiuscula = 'A';

    System.out.println(c);
    System.out.println(num);
    System.out.println(formatadaComUnderscore); // 20000

    System.out.println(numeroInteiro); // 10 
    System.out.println(soma); // 30 

    System.out.println(numA); 
    System.out.println(numB);

    System.out.println(numC + numD);
    
    System.out.println(varDouble);
    System.out.println(doubleRecebendoFloat); // 1.409000039100647 
    System.out.println(doubleRecebendoLong); // 12930.0

    System.out.println(isBoolean);
    System.out.println(ehNumero);

    System.out.println(letraA); // a 
    System.out.println(letraAMaiuscula); // A 
  } 

}
