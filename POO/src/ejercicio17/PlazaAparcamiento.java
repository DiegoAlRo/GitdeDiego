package ejercicio17;

public class PlazaAparcamiento {

	private int numeroPlaza;
	private Coche coche;
	private boolean disponible;
	private int contadorCoches;

	// Creamos el constructor e iniciamos los atributos.
	public PlazaAparcamiento(int numeroPlaza) {
		this.numeroPlaza = numeroPlaza;
		this.coche = null;
		this.disponible = true;
		this.contadorCoches = 0;

	}

	// Importamos los getters y setters.
	public int getNumeroPlaza() {
		return numeroPlaza;
	}

	public Coche getCoche() {
		return coche;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public int getContadorCoches() {
		return contadorCoches;
	}

	// Creamos un método para aparcar el coche, usando un condicional que revise
	// antes si el coche está disponible o la plaza está ocupada..
	public void aparcarCoche(Coche coche) {
		if (disponible) {
			this.coche = coche;
			this.disponible = false;
			this.contadorCoches++;
			System.out.println("El coche ha sido aparcado.");
		} else {
			System.out.println("PLAZA YA OCUPADA POR OTRO COCHE.");
		}
	}

	// Creamos otro método para sacar el coche, al igual que en el anterior método
	// usando un condicional que compruebe si está aparcado o no..
	public void sacarCoche() {
		if (!disponible) {
			System.out.println("PLAZA LIBRE. EL COCHE " + coche.getMatricula() + " HA SALIDO DE LA PLAZA.");
			this.coche = null;
			this.disponible = true;
		} else {
			System.out.println("ERROR, NO HAY COCHE EN LA PLAZA DE APARCAMIENTO. LA PLAZA ESTÁ LIBRE.");
		}
	}

	// Crearemos un método para mostrar el estado del coche.
	public void mostrarCoche() {
		if (!disponible) {
			coche.mostrarAtributos();
		} else {
			System.out.println("LA PLAZA ESTÁ LIBRE.");
		}
	}

	// Creamos otro método para enseñar el estado de la plaza, si está libre u otras
	// situaciones.
	public void mostrarEstadoPlaza() {
		if (!disponible) {
			System.out.println("Número de Plaza: " + numeroPlaza + ", Coche aparcado: ");
			coche.mostrarAtributos();
		} else {
			System.out.println("Número de Plaza: " + numeroPlaza + " - Libre");
		}
		System.out.println("Total de coches aparcados en esta plaza: " + contadorCoches);
	}
}
