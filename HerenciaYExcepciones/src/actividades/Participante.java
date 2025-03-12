package actividades;

// Creamos este objeto que representará a un representante.
public class Participante {
	private String nombre;
	private String apellido;
	private int edad;
	private double tiempo;

	// Creamos el constructor e iniciamos los atributos, además de usar una
	// excepción sobre la validez del nombre del participante.
	public Participante(String nombre, String apellido, int edad, double tiempo) throws ParticipanteNoValidoException {
		if (nombre == null || apellido == null || edad < 14) {
			throw new ParticipanteNoValidoException(
					"Participante no válido: nombre y apellido no pueden ser nulos y la edad no puede ser menor a 14 años.");
		}

		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.tiempo = tiempo;
	}

	// Generamos los getters y setters.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	// Creamos un toString que muestre la información del participante.
	@Override
	public String toString() {
		return nombre + " " + apellido + ", edad: " + edad + ", tiempo: " + tiempo + " segundos";
	}
}