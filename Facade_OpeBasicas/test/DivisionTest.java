import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionTest {
    
    @Test
    public void pruebaDivision1() {
        Division division = new Division();
        double resultado = division.calcular(15, 3);
        assertEquals(5.0, resultado, 0);
    }

    @Test
    public void pruebaDivision2() {
        Division division = new Division();
        double resultado = division.calcular(10, 2);
        assertEquals(5.0, resultado, 0);
    }

    @Test
    public void pruebaDivision3() {
        Division division = new Division();
        double resultado = division.calcular(-12, 4);
        assertEquals(-3.0, resultado, 0);
    }

    @Test
    public void pruebaDivision4() {
        Division division = new Division();
        try {
            double resultado = division.calcular(10, 0);
            fail("Se esperaba ArithmeticException pero se obtuvo un resultado: " + resultado);
        } catch (ArithmeticException e) {
            // Se espera que se lance una excepción
            assertTrue(true);
        }
    }
}
