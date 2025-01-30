package ejercicio16;

public class Personaje {

	private String nombre;
	private int nivelEnergia;

	// Creamos su constructor e iniciamos sus atributos.
	public Personaje(String nombre, int nivelEnergia) {

		this.nombre = nombre;
		this.nivelEnergia = nivelEnergia;
	}

	// Importamos los getters y setters.
	public String getNombre() {
		return nombre;
	}

	public int getNivelEnergia() {
		return nivelEnergia;
	}

	public void setNivelEnergia(int nivelEnergia) {
		this.nivelEnergia = nivelEnergia;
	}

	// Creamos un método para otorgar energía al personaje.
	public void alimentarse(int cantidadEnergia) {
		this.nivelEnergia += cantidadEnergia;
	}
}
