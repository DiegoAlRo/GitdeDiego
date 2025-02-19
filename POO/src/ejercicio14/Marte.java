package ejercicio14;

public class Marte {
	public static void main(String[] args) {

		// Crearemos 3 marcianos.
		Marciano et1 = new Marciano("ET");
		Marciano et2 = new Marciano("Predator");
		Marciano et3 = new Marciano("Marcianito");

		// Mataremos al segundo marciano.
		et2.muere();

		// Crearemos un nuevo marciano.
		Marciano et4 = new Marciano("Xenomorpho");

		// Probaremos a matar al marciano et2 otra vez, lo que nos dará error ya que ya
		// está muerto.
		et2.muere();

		// Mostraremos el estado final de todos los marcianos.
		System.out.println("\nEstado final:");
		mostrarEstado(et1);
		mostrarEstado(et2);
		mostrarEstado(et3);
		mostrarEstado(et4);

		// Mostraremos por mensaje todos los marcianos que estén vivos.
		System.out.println("Total marcianos vivos: " + Marciano.cuentaMarcianos());
	}

// Crearemos un método para enseñar el estado del marciano.
	private static void mostrarEstado(Marciano m) {
		System.out.println(
				m.estaVivo() ? "El marciano " + m.getNombre() + " está vivo" : "El marciano " + m.getNombre() + " está muerto");
	}
}
