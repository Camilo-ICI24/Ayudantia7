public abstract class Vehiculo {
	private String marca;
	private String modelo;
	private int año;
	private int precio;

	public Vehiculo(String marca, String modelo, int año, int precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAño() {
		return año;
	}

	public int getPrecio() {
		return precio;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public abstract void mostrarDetalles();
}
