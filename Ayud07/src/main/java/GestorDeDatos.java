import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorDeDatos {
	private ObjectMapper mapper = new ObjectMapper();

	public List<Vehiculo> leerVehiculos(String archivo) {
		try {
			return mapper.readValue(new File(archivo),
					mapper.getTypeFactory().constructCollectionType(List.class,
							Vehiculo.class));
		} catch (IOException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

	public void guardarVehiculos(String archivo, List<Vehiculo> vehiculos) {
		try {
			mapper.writeValue(new File(archivo), vehiculos);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
