package ejercicio16;

//Lo escribimos así debido a que es una clase heredada de Personaje.
public class Guerrero extends Personaje {

	private String arma;

	// Creamos su constructor.
	public Guerrero(String nombre, String arma, int nivelEnergiaInicial) {
		super(nombre, nivelEnergiaInicial);
		this.arma = arma;
	}

	// Creamos un método que se encargará de restar la energía gastada de un ataque
	// al personaje.
	public String combatir(int energiaGastada) {
		setNivelEnergia(getNivelEnergia() - energiaGastada);
		return arma + " (" + energiaGastada + " energía)";
	}

}
