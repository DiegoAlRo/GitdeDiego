package ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// Creamos la clase Torneo, donde se almacenarán métodos y una lista de los jugadores.
public class Torneo {

	// Importaremos el escaner.
	Scanner sc = new Scanner(System.in);

	// Crearemos una lista para almacenar los jugadores.
	List<Jugador> jugadores = new ArrayList<>();

	// Crearemos un método para agregar jugadores al torneo.
	public void agregarJugadores(Jugador jugador) {

		// Primero le preguntaremos al usuario el nombre del jugador.
		System.out.println("¿Cuál es el nombre del jugador?");
		String nombre = sc.nextLine();
		System.out.println();

		// Luego la fecha de registro.
		System.out.println("¿En que fecha se ha registrado? Escíbelo así (dd-mm-yyyy");
		String fecha = sc.nextLine();
		LocalDate fechaRegistro;

		try {
			fechaRegistro = LocalDate.parse(fecha);
		} catch (Exception e) {
			System.out.println("Error: La fecha no posee el formato especificado.");
			return;
		}
		System.out.println();

		boolean existe = jugadores.stream().anyMatch(j -> j.getNombre().equalsIgnoreCase(nombre));
		if (existe) {
			System.out.println("Jugador ya fué añadido anteriormente.");
		} else {

			// Y cuando acabe crearemos el objeto Jugador y lo añadiremos a la lista.
			Jugador jugador1 = new Jugador(nombre, fechaRegistro, null);
			jugadores.add(jugador1);

			// Además, avisaremos al usuario.
			System.out.println("Jugador añadido correctamente.");
		}
	}

	public void registrarPuntos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuál es el nombre del jugador?");
		String nombre = sc.next();

		// Buscaremos al jugador por nombre.
		Jugador jugador = jugadores.stream().filter(j -> j.getNombre().equalsIgnoreCase(nombre)).findFirst()
				.orElse(null);

		if (jugador == null) {
			System.out.println("Jugador no encontrado.");
			return;
		}

		System.out.println("¿Cuántos puntos ha obtenido en esta partida?");
		int puntos = sc.nextInt();
		sc.nextLine();
		jugador.registrarResultado(puntos);

	}

	// Método para mostrar el top 3 de jugadores con más puntos
	public void mostrarTop3() {
		System.out.println("Top 3 jugadores con más puntos:");
		jugadores.stream().sorted(Comparator.comparingInt(Jugador::obtenerPuntosTotales).reversed()).limit(3)
				.forEach(System.out::println);
	}

	// Método para filtrar jugadores con más de X puntos
	public void filtrarJugadoresPorPuntos() {
		System.out.println("¿Cuál es el mínimo de puntos?");
		int puntosMinimos = sc.nextInt();
		sc.nextLine(); // Limpiar el buffer del scanner

		List<Jugador> filtrados = jugadores.stream().filter(j -> j.obtenerPuntosTotales() > puntosMinimos)
				.collect(Collectors.toList());

		// Con esta línea mostraremos los judadores con más puntos obtenidos.
		System.out.println("Jugadores con más de " + puntosMinimos + " puntos:");
		filtrados.forEach(System.out::println);
	}

}
