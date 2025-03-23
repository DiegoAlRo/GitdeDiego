package gestiónEquipoFútbol;

// Creamos un enum para cada posición disponible de los jugadores.
public enum Posicion {

	// Declaramos las posiciones.
	Portero(2000, 3000), Defensa(2500, 3500), Centrocampista(3500, 4000), Delantero(4000, 5000);

	// Determinamos que es cada valor de estos.
	private final int salarioMinimo;
	private final int salarioMaximo;

	// Iniciamos los atributos.
	Posicion(int salarioMinimo, int salarioMaximo) {
		this.salarioMinimo = salarioMinimo;
		this.salarioMaximo = salarioMaximo;
	}

	// Generamos los getters y setters.
	public int getSalarioMinimo() {
		return salarioMinimo;
	}

	public int getSalarioMaximo() {
		return salarioMaximo;
	}

}
