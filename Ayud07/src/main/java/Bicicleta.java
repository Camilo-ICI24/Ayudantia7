public class Bicicleta extends Vehiculo {
	private String tipo;

	public Bicicleta(String marca, String modelo, int año, int precio, String tipo) {
		super(marca, modelo, año, precio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Bicicleta: " + getMarca() + " " + getModelo() + ", Año: "
				+ getAño() + ", Precio: $" + getPrecio() + ", Tipo: " + tipo);
	}
}
