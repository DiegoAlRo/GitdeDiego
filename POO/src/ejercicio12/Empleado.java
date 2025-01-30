package ejercicio12;

public class Empleado {

	private String nombre;
	private int horasTrabajadas;
	private double tarifaPorHora;

	// Creamos el constructor para inicializar los atributos del empleado.
	public Empleado(String nombre, int horasTrabajadas, double tarifaPorHora) {

		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaPorHora = tarifaPorHora;
	}

	// Creamos un método para calcular el sueldo bruto del empleado.
	public double calcularSueldoBruto() {
		double sueldoBruto;
		if (horasTrabajadas <= 40) {
			sueldoBruto = horasTrabajadas * tarifaPorHora;
		} else {
			int horasExtra = horasTrabajadas - 40;
			sueldoBruto = (40 * tarifaPorHora) + (horasExtra * tarifaPorHora * 1.5);
		}

		// Devolvemos el sueldo.
		return sueldoBruto;
	}

	// Creamos un método para mostrar la información del empleado.
	public void mostrarInfo() {
		System.out.println(nombre + " trabajó " + horasTrabajadas + " horas, cobra " + tarifaPorHora
				+ " euros la hora por lo que le corresponde un sueldo de " + calcularSueldoBruto() + " euros.");
	}

}
