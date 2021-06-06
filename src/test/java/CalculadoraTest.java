import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    private static Calculadora calc;

    @BeforeAll
    static void beforeAll(){
        calc = new Calculadora();
    }

    /*@BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }*/

    @Test
    void pruebaSumar1() {
        //caso de prueba suma: 3+7=10
        double a = 3, b = 7, esperado = 10;
        double real = calc.sumar(a,b);
        assertEquals(esperado,real);
    }

    @Test
    void pruebaSumar2() {
        double a = 9, b = -15, esperado = -6;
        double real = calc.sumar(a,b);
        assertEquals(esperado,real);
    }


    @Test
    void restar() {
    }

    @Test
    void multiplicar() {
    }

    @Test
    void dividir() {
    }
}