public class MenorDeIdadeException extends Exception { 
   
  public MenorDeIdadeException() { 
      super("Pessoa menor de 18 anos! Operação não permitida"); 
  }

}

public class App {

  public static void main(String[] args) { 
    System.out.println("Para finalizar essa compra, é necessário ser maior de idade. Informe seu ano de nascimento:"); 
    Scanner entrada = new Scanner(System.in); 
    int ano = entrada.nextInt(); 
      
    try { 
      ehMaiorDeIdade(ano); 
      System.out.println("Compra confirmada"); 
    } catch (MenorDeIdadeException e) { 
      System.out.println(e.getMessage()); 
    }finally { 
      entrada.close(); 
    } 
       
  } 

  private static boolean ehMaiorDeIdade(int ano) throws MenorDeIdadeException { 
    int idade = 2022 - ano; 
    if(idade < 18) { 
      throw new MenorDeIdadeException(); 
    }else { 
      return true; 
    } 
  }

}

/**
 * Dentro do bloco catch, estamos chamando o método getMessage() da nossa exceção customizada. Esse método retorna o valor da variável message que está dentro da superclasse Exception, e será o valor que passamos dentro do super() da classe MenorDeIdadeException.

Aqui introduzimos dois novos comandos: o throw new e o throws. Quando queremos indicar que um erro aconteceu e lançar uma exceção, utilizamos o throw new. Essa é a forma de instanciarmos um objeto do tipo Exception e indicar pro compilador que uma exceção precisa ser tratada. Com a palavra throws nós estamos indicando que aquele método pode lançar uma exçecão, entao quem chamá-lo precisará tratar o erro.


Por ser uma exceção do tipo checked, nosso código não vai compilar se não a tratarmos:

 Exception in thread "main" java.lang.Error: Unresolved compilation problem:  
      Unhandled exception type MenorDeIdadeException 
   
      at io.caused.App.main(App.java:10
 */
