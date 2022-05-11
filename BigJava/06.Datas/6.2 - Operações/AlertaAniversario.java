import java.time.LocalDate;

public class AlertaAniversario {

  public void checarAniversario() {

    LocalDate dataHoje = LocalDate.now();
    LocalDate nascimento = LocalDate.parse("2000-12-21");

    if (dataHoje.getMonth() == nascimento.getMonth()) {

      if (dataHoje.getDayOfMonth() == nascimento.getDayOfMonth()) {
        System.out.println("Hoje é seu aniversário!");

      } else if (dataHoje.getDayOfMonth() < nascimento.getDayOfMonth()) {
        System.out.println("Seu aniversário está próximo!");

      } else {
        System.out.println("Seu aniversário já passou!");
      }

    } else {
      System.out.println("Não é seu aniversário.");

    }

  }

  public static void main(String[] args) {

    AlertaAniversario alerta = new AlertaAniversario();
    alerta.checarAniversario();

  }

}

/**
 * Perceba que aqui usamos quatro métodos interessantes da classe LocalDate:

  .now(): retorna a data de hoje;
  .parse(): cria um objeto LocalDate a partir de uma String;
  .getMonth(): retorna o mês do objeto LocalDate;
  .getDayOfMonth(): retorna o dia do mês do objeto LocalDate;

 */
