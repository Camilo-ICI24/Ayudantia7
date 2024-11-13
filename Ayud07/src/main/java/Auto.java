public class Auto extends Vehiculo {
	private int numPuertas;

	public Auto(String marca, String modelo, int año, int precio, int numPuertas) {
		super(marca, modelo, año, precio);
		this.numPuertas = numPuertas;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Auto: " + getMarca() + " " + getModelo() + ", Año: "
				+ getAño() + ", Precio: $" + getPrecio() + ", Puertas: " + numPuertas);
	}
}

