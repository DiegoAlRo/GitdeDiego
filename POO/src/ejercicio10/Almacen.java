package ejercicio10;

public class Almacen {

	private double kilosChoclos;
	private double kilosPapas;

	// Ahora crearemos el costructor e iniciaremos sus atributos.
	public Almacen(double kilosChoclos, double kilosPapas) {

		this.kilosChoclos = kilosChoclos;
		this.kilosPapas = kilosPapas;

	}

	// Llamaramos a los getters y setters.
	public double getKilosChoclos() {
		return kilosChoclos;
	}

	public void setKilosChoclos(double kilosChoclos) {
		this.kilosChoclos = kilosChoclos;
	}

	public double getKilosPapas() {
		return kilosPapas;
	}

	public void setKilosPapas(double kilosPapas) {
		this.kilosPapas = kilosPapas;
	}

	// Crearemos un método para añadir más choclos.
	public void masChoclos(int num) {
		this.kilosChoclos = num;

	}

	// Crearemos otro método para añadir más papas.
	public void masPapas(int num) {
		this.kilosPapas = num;

	}

	// También crearemos dos métodos, este para mostrar los kilos de choclo.
	public void mostrarChoclo() {
		System.out.println("Kilos de choclo: " + kilosChoclos);

	}

	// Este para mostrar los kilos de papas.
	public void mostrarPapas() {
		System.out.println("Kilos de patata: " + kilosPapas);

	}

	// Y por último crearemos un método para controlar cuantos comensales pueden ser
	// atendidos.
	public double getComensales() {
		double comensalChoclo = kilosChoclos * 2;
		double comensalPapas = kilosPapas * 3;
		return Math.min(comensalPapas, comensalChoclo);

	}

}
