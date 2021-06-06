import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    /*private static Main vista;
    @BeforeAll
    static void beforeAll() {
        vista = new Main();
    }*/

    @Test
    void hacerDiv() {
        double a = 5, b = 0;
        Main.setA(a);
        Main.setB(b);
        String esperado = "Error: b no puede ser 0", real = Main.hacerDiv();
        assertEquals(esperado,real);
    }
}