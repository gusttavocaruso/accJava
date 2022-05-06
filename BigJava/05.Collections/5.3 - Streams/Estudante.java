public class Estudante {

  private String matricula;
  private String nome;
  private String curso;

  // public Estudante() { } ??

  public Estudante(String matricula, String nome, String curso) {
    this.matricula = matricula;
    this.nome = nome;
    this.curso = curso;
  }
  // GETs e SETs

}

public class CodeExamples {

  public static Collection<Estudante> obterEntrada() {

    return Set.of(
        new Estudante("2001", "Maria", "Computação"),
        new Estudante("2002", "João", "Computação"),
        new Estudante("2003", "José", "Pedagogia"),
        new Estudante("2004", "Ana", "Computação"),
        new Estudante("2005", "Bernardo", "Engenharia"),
        new Estudante("2006", "Antônia", "Computação"));

  }

  public static void main(String[] args) {

    Collection<Estudante> entrada = obterEntrada();

    List<String> matriculas = entrada.stream()
        .filter(e -> "Computação".equals(e.getCurso())) // filtrar
        .sorted(Comparator.comparing(Estudante::getNome)) // ordenar 
        .map(Estudante::getMatricula) // transformar
        .collect(Collectors.toList()); // tolist

    System.out.println(matriculas);

  }

}

/**
 * O método filter está recebendo uma função lambda com um predicado. Apenas os objetos Estudante cujo teste "Computação".equals(e.getCurso()) seja verdadeiro são incluídos no Stream de retorno desse passo.

O método sorted ordena o Stream. Ele recebe um objeto java.util.Comparator que indica como ordenar os elementos. Por sua vez, a interface java.util.Comparator tem um método estático chamado comparing que, recebendo um método como parâmetro, gera o objeto java.util.Comparator de que precisamos. Então lhe entregamos o método getNome para ser usado na comparação. Strings já são comparáveis (possuem o método compareTo), por isso essa abordagem foi suficiente.

O método map transforma o Stream em um outro Stream de mesmo tamanho, mas com outro conteúdo. É usada a função passada como parâmetro para aplicar a operação 1 a 1 nos elementos presentes. Nesse caso, tínhamos um Stream de Estudante e passamos a ter um Stream só com as matrículas.
 */
