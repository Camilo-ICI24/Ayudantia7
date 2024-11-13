import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CamionTest {

    @Test
    public void testConstructorYGetters() {
        Camion camion = new Camion("JAC", "Urban Chasis",
                2014, 20000000, 650);

        assertEquals("JAC", camion.getMarca());
        assertEquals("Urban Chasis", camion.getModelo());
        assertEquals(2014, camion.getAño());
        assertEquals(20000000, camion.getPrecio());
        assertEquals(650, camion.getCapacidadCarga());
    }

    @Test
    public void testSetCapacidadCarga() {
        Camion camion = new Camion("Renault",
                "Truck T", 2019, 17600000, 500);

        camion.setCapacidadCarga(320);
        assertEquals(320, camion.getCapacidadCarga());
    }

    @Test
    public void testMostrarDetalles() {
        Camion camion = new Camion("Hino", "City 515",
                2022, 15000000, 750);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        camion.mostrarDetalles();

        String expectedOutput = "Camion: Hino City 515, Año: 2022, Precio: " +
                "$15000000, Carga: 750.0 tons" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
