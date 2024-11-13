import java.util.ArrayList;
import java.util.List;

public class Automotora {
	private List<Vehiculo> vehiculos;
	private GestorDeDatos gestorDeDatos;

	public Automotora() {
		this.vehiculos = new ArrayList<>();
		this.gestorDeDatos = new GestorDeDatos();
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}

	public void listarVehiculos() {
		for (Vehiculo vehiculo : vehiculos) {
			vehiculo.mostrarDetalles();
		}
	}

	public void cargarVehiculosDesdeJSON(String archivo) {
		this.vehiculos = gestorDeDatos.leerVehiculos(archivo);
	}

	public void guardarVehiculosEnJSON(String archivo) {
		gestorDeDatos.guardarVehiculos(archivo, vehiculos);
	}
}