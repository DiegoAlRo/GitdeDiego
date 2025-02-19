package conductor;

// Creamos la clase conductor e iniciamos sus atributos en el constructor.
public class Conductor {

	private String nombre;

	// Crear constructor
	public Conductor(String nombre) {

		this.nombre = nombre;

	}

	// Creamos un método para devolver nombre.
	public String getNombre() {

		return nombre;

	}

	// Metodo para mostrar todo
	public void conducir(Coche coche) {

		System.out.println("El conductor: " + nombre + " esta conduciendo el coche: " + coche.getMarca()
				+ " con matricula: " + coche.getMatricula());

	}

	public static void main(String[] args) {

		// Creamos un coche y un conductor.
		Coche coche = new Coche("1234ABC", "Toyota");

		Conductor conductor = new Conductor("Fran");

		coche.mostrarDetalles();
		conductor.conducir(coche);

	}

}
