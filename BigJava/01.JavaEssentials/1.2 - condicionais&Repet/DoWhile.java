// Vamos supor que uma escola entrará em contato com os inscritos aprovados para um curso e que o número máximo de tentativas de contato será até 3.

import java.util.Random;

public class DoWhile {

  public static void main(String[] args) { 

    int tentativas = 0;
    int atendeu = 0;
    String log;

    do {
        log = "Ligando para candidato selecionado ...\n";
        // O código abaixo nos dá um numero aleatório entre 0 e 2.
        atendeu = new Random().ints(0, 2).findFirst().getAsInt();
        tentativas += 1;
    } while (atendeu == 0 && tentativas < 3);

    log = "Candidato atendeu na tentativa: " + tentativas;
    System.out.println(log);

  }

}
