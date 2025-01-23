package ejercicio4;

// Creamos la clase.
public class Cafetera {

	private int capacidadMaxima;
	private int cantidadActual;

	// Creamos el constructor e iniciamos sus atributos, para una clase
	// predeterminada.
	public Cafetera() {

		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}

	// Creamos el constructor e iniciamos sus atributos, para una clase máxima.
	public Cafetera(int capacidadMaxima) {

		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = capacidadMaxima;
	}

	// Creamos el constructor e iniciamos sus atributos.
	public Cafetera(int capacidadMaxima, int capacidadActual) {

		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = Math.min(capacidadMaxima, capacidadActual);

	}

	// Importamos los "Accedentes y mutadores", que se tratan de los getters y
	// setters.
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = Math.min(cantidadActual, capacidadMaxima);
	}

	// Creamos un método que iguale la capacidad actual con la máxima.
	public void llenarCafetera() {
		this.cantidadActual = capacidadMaxima;

	}

	// Creamos un método para igualar la cantidad con la actual.
	public void servirTaza(int cantidad) {
		if (cantidad > cantidadActual) {
			cantidad = cantidadActual;
		}
		cantidadActual -= cantidad;
	}

	// Creamos otro método para dejar la cantidad de cafe en 0.
	public void vaciarCafetera() {
		this.cantidadActual = 0;

	}

	// Por último creamos un método para agregar café.
	public void agregarCafe(int cantidad) {

		cantidadActual = Math.min(cantidadActual + cantidad, capacidadMaxima);
	}

}
