import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutoTest {

    @Test
    public void testAutoDetalles() {
        Auto auto = new Auto("Nissan", "Xtrail",
                2011, 7000000, 4);

        assertEquals("Nissan", auto.getMarca());
        assertEquals("Xtrail", auto.getModelo());
        assertEquals(2011, auto.getAño());
        assertEquals(7000000, auto.getPrecio());
        assertEquals(4, auto.getNumPuertas());
    }

    @Test
    public void testMostrarDetalles() {
        Auto auto = new Auto("Hyundai", "Accent", 2010,
                1500000, 4);
        auto.mostrarDetalles();
        assertEquals("Hyundai", auto.getMarca());
    }
}
