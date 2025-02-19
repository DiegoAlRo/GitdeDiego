package ejercicio16;

// Lo escribimos así debido a que es una clase heredada de Personaje.
public class Mago extends Personaje {

	private String poder;

	// Creamos su constructor e iniciamos sus métodos.
	public Mago(String nombre, String poder) {
		super(nombre, 100);
		this.poder = poder;
	}

	// Creamos un método que le restará energía al mago por encantamiento.
	public String encantar() {
		setNivelEnergia(getNivelEnergia() - 2);
		return poder;
	}
}
