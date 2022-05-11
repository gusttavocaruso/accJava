import java.time.LocalTime;

public class PontoEletronico {

  public void marcarHoraExtra() {

    LocalTime horaAtual = LocalTime.now();
    LocalTime fimExpendiente = LocalTime.parse("17:00:00");

    if (horaAtual.isAfter(fimExpendiente)) {
      System.out.println("Pessoa funcionária está fazendo hora extra");
    } else {
      System.out.println("Pessoa funcionária está dentro do expediente de trabalho");
    }

  }

  public static void main(String[] args) {

    PontoEletronico ponto = new PontoEletronico();
    ponto.marcarHoraExtra();

  }

}

/**
 * Neste pequeno exemplo, podemos observar o uso de 3 métodos interessantes:

  .now(): retorna a hora atual local da pessoa usuária;
  .parse(): retorna um objeto LocalTime de uma String representando horas;
  .isAfter(): uma manipulação interessante, responsável por verificar se a hora do objeto que chama esse método é depois da hora de um objeto passado como argumento.
 */
