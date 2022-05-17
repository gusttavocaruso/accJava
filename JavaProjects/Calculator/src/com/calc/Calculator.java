package com.calc;

public class Calculator {

  public int somar(int x, int y) {
    return x + y;
  }

  public int subtrair(int x, int y) {
    return x - y;
  }

  public int dividir(int x, int y) {

    if (verificarDividendo(y)) {
      return x / y;
    } else {
      return 0;
    }

  }

  public boolean verificarDividendo(int y) {
    if (y == 0) {
      return false;
    } else {
      return true;
    }
  }

}
