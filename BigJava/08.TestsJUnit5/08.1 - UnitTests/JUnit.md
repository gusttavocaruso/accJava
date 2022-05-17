É importante ressaltar que falhas e erros não são a mesma coisa no JUnit! Vamos entender as diferenças:

Falhas (Failures): indicam que um resultado de teste é inválido, ou seja, não passou no teste. No nosso caso, uma falha ocorreria se nosso método retornasse um valor incorreto para soma ou para subtração.

Erros (Errors): indicam que alguma situação inesperada ocorreu, por exemplo, alguma exceção no nosso código.


## Asserts

AssertEquals(param1, param2);

  - param1: Resultado esperado;

  - param2: Ação para testar. Exemplo => testar método() do obj instanciado: param2 == obj.metodo();

AssertTrue(param1);

  -  param1: Ação para testar, esperando resultado true;

AssertThrows(param1, param2);

  - param1: exceção esperada. Exemplo => ArithmeticException.class;
  - param2: método para ser testado dentro de uma função lambda. Exemplo => () -> { cal.dividir(3, 0); };

  - Resumindo, usamos o método assertThrows() para verificar se quando algo inesperado ocorre no nosso código a exceção correta está sendo lançada, ou seja, se agora podemos testar se algum valor inesperado for inserido em nosso método, a exceção correta está sendo lançada!