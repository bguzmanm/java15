import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MensajesTest {

  @Test
  void bienvenida() {
    Mensajes mensajes = new Mensajes();
    assertEquals("Bienvenido!", mensajes.bienvenida());
  }

  @Test
  void despedida() {
    Mensajes mensajes = new Mensajes();
    assertEquals("Adios!", mensajes.despedida());
  }
}