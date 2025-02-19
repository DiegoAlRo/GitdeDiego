package ejercicio7;

public class Asignatura {

	private String nombre;
	private double nota;

	// Luego su contructor, además de que iniciaremos sus atrinutos.
	public Asignatura(String nombre, double nota) {

		this.nombre = nombre;
		this.nota = nota;
	}

	// Llamaremos a los getters y setters.
	public String getNombre() {
		return nombre;

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public double getNota() {
		return nota;

	}

	public void setNota(double nota) {
		this.nota = nota;

	}

	// Crearemos un método para recibir los datos del usuario para la asginatura.
	public void obtenerDatos() {

		this.nombre = nombre;
		this.nota = nota;

	}

	// Este método servirá para modificar la nota de la asignatura.
	public void modNota(double nota) {
		this.nota = nota;

	}

	// Este servirá para mostrar la nota.
	public void mostrarNota() {
		System.out.println("Nota: " + nota);

	}

	// Al igual que el anterior, este método es para mostrar, en este caso, el
	// nombre de la asignatura.
	public void mostrarNombre() {

		System.out.println("Nombre de la asginatura: " + nombre);

	}

	// Y por último crearemos un método para determinar si la asignatura está o no
	// aprobada.
	public void aprobado() {
		if (nota < 5) {
			System.out.println("La asignatura está suspensa.");
		} else {
			System.out.println("La asignatura está aprovada.");
		}
	}
}
