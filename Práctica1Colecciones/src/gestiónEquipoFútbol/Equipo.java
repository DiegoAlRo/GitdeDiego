package gestiónEquipoFútbol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Creamos el objeto equipo.
public class Equipo {

	private String Nombre;
	private List<Futbolista> listaFutbolistas;

	// Iniciamos sus atributos y generamos su constructor.
	public Equipo(String Nombre) {

		this.Nombre = Nombre;
		this.listaFutbolistas = new ArrayList<>();

	}

	// Creamos una excepción para controlar el número de posiciones de un equipo.
	public void agregarFutbolista(Futbolista futbolista) throws RegistroException {
		long count = listaFutbolistas.stream().filter(f -> f.getPosicion() == futbolista.getPosicion()).count();

		int limite = switch (futbolista.getPosicion()) {
		case Portero -> 2;
		case Defensa -> 5;
		case Centrocampista -> 5;
		case Delantero -> 4;
		};

		if (count >= limite) {
			throw new RegistroException("No se puede añadir ningún " + futbolista.getPosicion() + " más al equipo.");
		}

		// En caso de no haber llegado al límite, agrega el futbolista
		listaFutbolistas.add(futbolista);
	}

	// Creamos un método usando .sort para ordenar las posiciones según el orden
	// dado en la clase Posición.
	public void listarFormacionDelEquipo() {
		listaFutbolistas.sort((f1, f2) -> f1.getPosicion().compareTo(f2.getPosicion()));

		Iterator<Futbolista> iterator = listaFutbolistas.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
