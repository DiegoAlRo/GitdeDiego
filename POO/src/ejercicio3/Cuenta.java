package ejercicio3;

// Creamos la clase Cuenta junto con sus atributos.
public class Cuenta {
	private long numeroCuenta;
	private long DNI;
	private double saldoActual;
	private double interesAnual;

	// Diseñamos el constructor e iniciamos los atributos de una versión estandar de
	// Cuenta.
	public Cuenta() {

		this.numeroCuenta = numeroCuenta++;
		this.DNI = 0;
		this.saldoActual = 0.0;
		this.interesAnual = 0.0;

	}

	// Diseñamos su constructor e iniciamos sus atributos.
	public Cuenta(long DNI, double saldoActual, double interesAnual) {

		this.numeroCuenta = numeroCuenta++;
		this.DNI = DNI;
		this.saldoActual = saldoActual;
		this.interesAnual = interesAnual;
	}

// Importamos los getters y setters.
	public long getDNI() {
		return DNI;
	}

	public void setDNI(long dNI) {
		DNI = dNI;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public double getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}

// Empezamos a crear métodos con uno que podrá cambiar el saldo a una versión actualizada.
	public void actualizarSaldo() {
		double interesDiario = interesAnual / 365;
		saldoActual += saldoActual * (interesDiario / 100);
	}

// Creamos otro método para ingresar más cantidad a la cuenta.
	public void ingresar(double cantidad) {
		saldoActual += cantidad;
	}

// Al contrario que antes, creamos un método para retirar cantidad de la cuenta.
	public void retirar(double resta) {
		if (saldoActual > 0) {
			saldoActual -= resta;
		}
	}

// Finalmente creamos un método que pueda mostrar la información de la cuenta.
	public void mostrar() {
		System.out.println("Número de cuenta " + numeroCuenta);
		System.out.println("DNI de cliente " + DNI);
		System.out.println("Saldo actual de la cuenta " + saldoActual);
		System.out.println("Interes anual de la cuenta " + interesAnual);
	}

}
