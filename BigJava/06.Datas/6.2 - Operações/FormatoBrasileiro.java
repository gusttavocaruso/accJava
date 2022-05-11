public class FormatoBrasileiro {
  
  LocalDate hoje = LocalDate.now();
  String formatoData = "dd/MM/yyyy";

  DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern(formatoData);

}


// ===================================


public class FormatoBrasileiroTwo {

  String formatoData = "dd/MM/yyyy";
  DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern(formatoData);

  LocalDate natal = LocalDate.parse("25/12/2022", formatadorData);

}
