import java.time.LocalDateTime;
import java.time.Duration;

public class IdadeEmDias {

  public long calcularIdadeEmDias(String nascimento) {

    LocalDateTime hoje = LocalDateTime.now();
    LocalDateTime diaNascimento = LocalDateTime.parse(nascimento);
    
    Duration duracao = Duration.between(diaNascimento, hoje);
    long quantidadeDias = duracao.toDays();

    return quantidadeDias;
  }

  public static void main(String[] args) {

    IdadeEmDias idade = new IdadeEmDias();
    System.out.println("A quantidade de dias desde o seu nascimento é: " + idade.calcularIdadeEmDias("2000-03-08T12:45:00"));

  }

}

/**
 * Com o uso da classe Duration, somos capazes de usar seu método .between() para calcular quantos dias se passaram desde o nascimento da pessoa usuária, exatamente como foi demandado no projeto. Note que o tipo de retorno do método .toDays() é o long. Por conta disso, na chamada da nossa classe, informamos que o retorno é do tipo long
 */
