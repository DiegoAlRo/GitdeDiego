package ejercicio15;

public class Cuenta {

	private float saldo;

	// Creamos el xonstructor para crear una cuenta con un saldo inicial.
	public Cuenta(float saldoInicial) {
		this.saldo = saldoInicial;
	}

	// Creamos un método para ingresar dinero.
	public void ingresar(float c) {
		saldo += c;
	}

	// Creamos otro método para extraer dinero.
	public void extraer(float c) {
		saldo -= c;
	}

	// Creamos un método para obtener el saldo actual.
	public float getSaldo() {
		return saldo;
	}
}
