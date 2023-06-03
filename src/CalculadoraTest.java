import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

  @Test
  void sumar() {
    Calculadora calculadora = new Calculadora();
    assertEquals(9, calculadora.sumar(4,5));
    assertEquals(20, calculadora.sumar(12,8));
  }

  @Test
  void restar() {
    Calculadora calculadora = new Calculadora();
    int actual = calculadora.restar(10, 4);
    assertEquals(6, actual);
  }

  @Test
  void multiplicar() {
    Calculadora calculadora = new Calculadora();

    assertEquals(100, calculadora.multiplicar(10, 10));
  }

  @Test
  void dividir(){
    Calculadora calculadora = new Calculadora();
    assertEquals(2, calculadora.dividir(10, 5));
  }
}