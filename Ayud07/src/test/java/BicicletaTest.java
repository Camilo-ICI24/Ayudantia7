import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BicicletaTest {

    @Test
    public void testBicicletaConstructorYGetters() {
        Bicicleta bicicleta = new Bicicleta("Trek", "Domane",
                2023, 1200, "De carretera");

        assertEquals("Trek", bicicleta.getMarca());
        assertEquals("Domane", bicicleta.getModelo());
        assertEquals(2023, bicicleta.getAño());
        assertEquals(1200, bicicleta.getPrecio());
        assertEquals("De carretera", bicicleta.getTipo());
    }

    @Test
    public void testSetTipo() {
        Bicicleta bicicleta = new Bicicleta("Specialized",
                "Allez", 2022, 1000, "De montaña");

        bicicleta.setTipo("De ruta");
        assertEquals("De ruta", bicicleta.getTipo());
    }

    @Test
    public void testMostrarDetalles() {
        Bicicleta bicicleta = new Bicicleta("Giant", "Defy",
                2021, 800, "Híbrida");

        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        bicicleta.mostrarDetalles();

        String expectedOutput = "Bicicleta: Giant Defy, Año: 2021, " +
                "Precio: $800, Tipo: Híbrida";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
