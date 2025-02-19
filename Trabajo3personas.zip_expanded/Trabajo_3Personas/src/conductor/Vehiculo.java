package conductor;

// Clase abstracta con un atributo protegido
public abstract class Vehiculo {

	protected String matricula;

	public Vehiculo(String matricula) {

		this.matricula = matricula;

	}

// Get a la matricula
	public String getMatricula() {
		return matricula;
	}

// Metodo abstracto para mostrar los detalles
	public abstract void mostrarDetalles();

}
