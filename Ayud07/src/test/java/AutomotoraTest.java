import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

class AutomotoraTest {
    private Automotora automotora;

    @BeforeEach
    public void setUp() {
        automotora = new Automotora();
    }

    @Test
    public void testAgregarVehiculo() {
        Vehiculo auto = new Auto("Chevrolet", "Camaro",
                2022, 15000000, 2);
        automotora.agregarVehiculo(auto);

        assertEquals(1, automotora.getVehiculos().size());
        assertEquals("Chevrolet", automotora.getVehiculos().get(0).getMarca());
    }

    @Test
    public void testListarVehiculos() {
        Vehiculo auto = new Auto("Tesla", "Cybertruck", 2021,
                7500000, 2);
        Vehiculo camion = new Camion("Scania", "R470",
                2024, 23400000, 650);

        automotora.agregarVehiculo(auto);
        automotora.agregarVehiculo(camion);

        automotora.listarVehiculos();

        assertEquals(2, automotora.getVehiculos().size());
    }

    @Test
    public void testGuardarVehiculos() {
        String archivoTest = "vehiculos_prueba1.json";

        Vehiculo auto = new Auto("Toyota", "AE86", 1983,
                30000, 4);
        automotora.agregarVehiculo(auto);

        automotora.guardarVehiculos(archivoTest);

        assertTrue(new java.io.File(archivoTest).exists());
        new java.io.File(archivoTest).delete();
    }
}
