import java.util.ArrayList;
import java.util.List;

public class Automotora {

	private List<Vehiculo> vehiculos;
	private GestorDeDatos gestorDeDatos;

	public Automotora() {
		this.vehiculos = new ArrayList<>();
		this.gestorDeDatos = new GestorDeDatos();
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public GestorDeDatos getGestorDeDatos() {
		return gestorDeDatos;
	}

	public void setGestorDeDatos(GestorDeDatos gestorDeDatos) {
		this.gestorDeDatos = gestorDeDatos;
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}

	public void listarVehiculos() {
		for (Vehiculo vehiculo : vehiculos) {
			vehiculo.mostrarDetalles();
		}
	}

	public void cargarVehiculos(String archivo) {
		this.vehiculos = gestorDeDatos.leerVehiculos(archivo);
	}

	public void guardarVehiculos(String archivo) {
		gestorDeDatos.guardarVehiculos(archivo, vehiculos);
	}
}