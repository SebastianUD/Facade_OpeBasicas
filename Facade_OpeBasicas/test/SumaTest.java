import org.junit.Test;
import static org.junit.Assert.*;

public class SumaTest {

    @Test
    public void pruebaSuma() {
        Suma suma = new Suma();
        double resultado = suma.calcular(5, 3);
        assertEquals(8.0, resultado, 0); // El tercer parámetro es la tolerancia
    }
    
    @Test
    public void pruebaSuma2() {
        Suma suma = new Suma();
        double resultado = suma.calcular(0, 0);
        assertEquals(0.0, resultado, 0);
    }
    
    @Test
    public void pruebaSuma3() {
        Suma suma = new Suma();
        double resultado = suma.calcular(-5, 8);
        assertEquals(3.0, resultado, 0);
    }
}
