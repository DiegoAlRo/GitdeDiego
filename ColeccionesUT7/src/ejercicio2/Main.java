package ejercicio2;

import java.util.Scanner;

// creamos el main para que el usuario pueda interactuar con los métodos.
public class Main {
	public static void main(String[] args) {

		// Creamos un torneo.
		Torneo torneo = new Torneo();

		// Importamos el escaner.
		Scanner sc = new Scanner(System.in);

		boolean parar = false;

		while (!parar) {

			System.out.println("--Menú de Torneo--");
			System.out.println("Escoge la opción que desees:");
			System.out.println("1 - Agregar judador a torneo.");
			System.out.println("2 - Registrar puntos de jugador..");
			System.out.println("3 - Mostrar TOP 3 jugadores.");
			System.out.println("4 - Filtrar jugadores por puntos.");
			System.out.println("5 - Salir.");
			System.out.println();

			int opcion = sc.nextInt();

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
