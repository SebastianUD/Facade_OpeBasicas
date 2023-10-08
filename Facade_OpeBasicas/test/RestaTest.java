import org.junit.Test;
import static org.junit.Assert.*;

public class RestaTest {

    @Test
    public void pruebaResta1() {
        Resta resta = new Resta();
        double resultado = resta.calcular(10, 4);
        assertEquals(6.0, resultado, 0);
    }

    @Test
    public void pruebaResta2() {
        Resta resta = new Resta();
        double resultado = resta.calcular(0, 0);
        assertEquals(0.0, resultado, 0);
    }

    @Test
    public void pruebaResta3() {
        Resta resta = new Resta();
        double resultado = resta.calcular(5, 8);
        assertEquals(-3.0, resultado, 0);
    }
    
}
