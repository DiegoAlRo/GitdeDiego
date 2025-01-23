package ejercicio2;

// Definimos la clase Vehiculo y sus atributos.
public class Vehiculo {

	private String modelo;
	private double potencia;
	private boolean traccion4ruedas;

	// Creamos su constructor e iniciamos sus atributos.
	public Vehiculo(String modelo, double potencia, boolean traccion4ruedas) {

		this.modelo = modelo;
		this.potencia = potencia;
		this.traccion4ruedas = traccion4ruedas;

	}

	// Creamos un método para obtener la potencia del vehículo.
	public double getPotencia() {
		return potencia;
	}

	// Creamos otro para establecer su potencia.
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	// Volvemos a crear otro para comprobar si tiene o no tracción a 4 ruedas.
	public boolean isTraccion4ruedas() {
		return traccion4ruedas;
	}

	// Este método será para establecer si el vehículo tiene tracción a las 4 ruedas.
	public void setTraccion4ruedas(boolean traccion4ruedas) {
		this.traccion4ruedas = traccion4ruedas;
	}

	// Y por último uno para imprimir la información sobre el vehículo.
	public String imprimir() {
		return "Modelo: " + modelo + ", Potencia: " + potencia + ", Tracción a las cuatro ruedas: "
				+ (traccion4ruedas ? "Sí" : "No");
	}

}
