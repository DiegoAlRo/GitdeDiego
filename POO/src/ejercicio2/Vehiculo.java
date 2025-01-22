package ejercicio2;

public class Vehiculo {

	private String modelo;
	private double potencia;
	private boolean traccion4ruedas;

	public Vehiculo(String modelo, double potencia, boolean traccion4ruedas) {

		this.modelo = modelo;
		this.potencia = potencia;
		this.traccion4ruedas = traccion4ruedas;

	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public boolean isTraccion4ruedas() {
		return traccion4ruedas;
	}

	public void setTraccion4ruedas(boolean traccion4ruedas) {
		this.traccion4ruedas = traccion4ruedas;
	}

	public String imprimir() {
		return "Modelo: " + modelo + ", Potencia: " + potencia + ", Tracción a las cuatro ruedas: "
				+ (traccion4ruedas ? "Sí" : "No");
	}

}
