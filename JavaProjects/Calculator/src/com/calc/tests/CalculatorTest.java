package com.calc.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.calc.Calculator;

@DisplayName("Classe para testes da calculadora Calculator")
class CalculatorTest {

  @Test
  @DisplayName("Testando o método somar:")
  public void testeSomar() {
    Calculator cal = new Calculator();
    assertEquals(34, cal.somar(32, 2));
  }

  @Test
  @DisplayName("Testando o método subtrair:")
  public void testeSubtrair() {
    Calculator cal = new Calculator();
    assertEquals(1, cal.subtrair(3, 2));
  }

  @Test
  @DisplayName("testando o método dividir...")
  public void testeDividir() {
    Calculator cal = new Calculator();
    assertEquals(3, cal.dividir(6, 2));
  }

  @Test
  @DisplayName("testando o método verificar dividendo...")
  public void testeVerificarDividendo() {
    Calculator cal = new Calculator();
    assertTrue(cal.verificarDividendo(5));
  }

}
