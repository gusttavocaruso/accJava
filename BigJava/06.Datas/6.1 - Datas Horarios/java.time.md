Clock: responsável por prover acesso ao instante, hora e data atuais, apresentando os detalhes do fuso horário;

  - .systemDefaultZone(): esse método estático retorna um objeto da classe Clock, que representa o instante atual em relação ao fuso horário do computador que está executando o programa.

  - .instant(): esse método retorna o instante atual, com data e hora, mas levando em consideração o fuso horário UTC.


LocalDateTime: combina o acesso à data e à hora local, sem apresentar detalhes do fuso horário.

  - se queremos pegar o horário atual, podemos chamar o método .now()

  - se quisermos criar uma data específica de uma String, o método .parse() deve ser usado.


se temos interesse em armazenar o dia de hoje em uma variável, só precisamos chamar a instrução LocalDate dataLocal = LocalDate.now()