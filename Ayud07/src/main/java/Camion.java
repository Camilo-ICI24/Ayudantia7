public class Camion extends Vehiculo {
	private double capacidadCarga;

	public Camion(String marca, String modelo, int año, int precio, int capacidadCarga) {
		super(marca, modelo, año, precio);
		this.capacidadCarga = capacidadCarga;
	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Camion: " + getMarca() + " " + getModelo() + ", Año: " + getAño() + ", Precio: $" + getPrecio() + ", Carga: " + capacidadCarga + " tons");
	}
}