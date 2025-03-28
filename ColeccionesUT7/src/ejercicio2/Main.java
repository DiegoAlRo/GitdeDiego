package ejercicio2;

import java.util.Scanner;

// creamos el main para que el usuario pueda interactuar con los métodos.
public class Main {
	public static void main(String[] args) {

		// Creamos un torneo.
		Torneo torneo = new Torneo();

		// Importamos el escaner.
		Scanner sc = new Scanner(System.in);

		// Crearemos un booleano para poder hacer que el menú se repita.
		boolean parar = false;

		// Creamos el menú en el bucle while usando el boolean anterior.
		while (!parar) {

			// Le mostramos las opciones al usuario.
			System.out.println("--Menú de Torneo--");
			System.out.println("Escoge la opción que desees:");
			System.out.println("1 - Agregar judador a torneo.");
			System.out.println("2 - Registrar puntos de jugador..");
			System.out.println("3 - Mostrar TOP 3 jugadores.");
			System.out.println("4 - Filtrar jugadores por puntos.");
			System.out.println("5 - Salir.");
			System.out.println();

			// Esta será la respuesta del usuario.
			int opcion = sc.nextInt();

			// Creamos un switch para responder a la elección del usuario.
			switch (opcion) {

			case 1:
				torneo.agregarJugadores(null);
				break;
			case 2:
				torneo.registrarPuntos();
				break;
			case 3:
				torneo.mostrarTop3();
				break;
			case 4:
				torneo.filtrarJugadoresPorPuntos();
				break;
			case 5:
				parar = true;
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Esa opción no es válida, pueba con otra.");
				break;

			}
		}

		// Cerramos el escaner.
		sc.close();
	}

	// Madre mía.
}
