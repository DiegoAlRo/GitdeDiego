package conductor;

// Iniciamos la clase coche hereda a vehiculo con su atributo.
public class Coche extends Vehiculo {

	private String marca;

	public Coche(String matricula, String marca) {
		super(matricula);
		this.marca = marca;
	}

// Get a la marca del vehiculo.
	public String getMarca() {
		return marca;
	}

	// creamos un método para mostrar todo.
	public void mostrarDetalles() {
		System.out.println("Coche: " + marca + ", Matrícula: " + matricula);
	}

}
