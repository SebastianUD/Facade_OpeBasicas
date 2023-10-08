import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicacionTest {
    
    @Test
    public void pruebaMultiplicacion1() {
        Multiplicacion multiplicacion = new Multiplicacion();
        double resultado = multiplicacion.calcular(6, 7);
        assertEquals(42.0, resultado, 0);
    }

    @Test
    public void pruebaMultiplicacion2() {
        Multiplicacion multiplicacion = new Multiplicacion();
        double resultado = multiplicacion.calcular(0, 5);
        assertEquals(0.0, resultado, 0);
    }

    @Test
    public void pruebaMultiplicacion3() {
        Multiplicacion multiplicacion = new Multiplicacion();
        double resultado = multiplicacion.calcular(-3, -4);
        assertEquals(12.0, resultado, 0);
    }
    
}
