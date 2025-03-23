package gestiónEquipoFútbol;

import java.util.List;
import java.util.Scanner;

// Creamos la clase main Aplicación para poder realizar todos los métodos creados.
public class Aplicacion {
	public static void main(String[] args) {

		Equipo equipo = new Equipo("Los Jugadores");
		// Importamos el escaner.
		Scanner sc = new Scanner(System.in);

		// Creamos un boolean para repetir el menú.
		boolean parar = false;

		// Usamos el while mientras parar sea false.
		while (!parar) {

			// Le mostramos las opciones al usuario.
			System.out.println("-- Menú de Gestión de Equipo --");
			System.out.println("1. Agregar futbolista al equipo");
			System.out.println("2. Listar formación del equipo");
			System.out.println("3. Salir");
			System.out.print("Elige una opción: ");
			int opcion = sc.nextInt();
			sc.nextLine();

			// Creamos un switch a según de lo que elija el usuario.
			switch (opcion) {
			case 1:
				agregarFutbolista(equipo, sc);
				break;
			case 2:
				listarFormacionDelEquipo(equipo);
				break;
			case 3:
				System.out.println("Saliendo...");
				parar = true;
				break;
			default:
				System.out.println("Esta opción no es válida, intentalo de nuevo.");
			}
		}
	}

	// Usamos el método para agregar futbolista, mientras es supervisado por la
	// excepción que limita las posiciones.
	private static void agregarFutbolista(Equipo equipo, Scanner sc) {
		try {
			System.out.print("Nombre del futbolista: ");

			String nombre = sc.nextLine();

			System.out.print("Edad del futbolista: ");

			int edad = sc.nextInt();
			sc.nextLine();

			System.out.println("Posición del futbolista: ");

			System.out.println("1. PORTERO\n2. DEFENSA\n3. CENTROCAMPISTA\n4. DELANTERO");

			System.out.print("Elige una opción: ");

			int posicionElegida = sc.nextInt();

			sc.nextLine();

			Posicion posicion = switch (posicionElegida) {
			case 1 -> Posicion.Portero;
			case 2 -> Posicion.Defensa;
			case 3 -> Posicion.Centrocampista;
			case 4 -> Posicion.Delantero;
			default -> throw new IllegalArgumentException("Posición no válida");
			};

			System.out.print("Años como profesional: ");

			int anyosProfesional = sc.nextInt();
			sc.nextLine();

			System.out.println("Escribe los nombres de los equipos separados por comas:");

			String equiposString = sc.nextLine();

			List<String> listadoEquipos = List.of(equiposString.split(","));

			System.out.print("Total de trofeos conseguidos: ");

			int totalTrofeos = sc.nextInt();
			sc.nextLine();

			Futbolista futbolista = new Futbolista(nombre, edad, posicion, anyosProfesional, listadoEquipos,
					totalTrofeos);

			equipo.agregarFutbolista(futbolista);

			System.out.println("Futbolista agregado con éxito");

		} catch (RegistroException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error inesperado.");
		}
	}

	// Llamamos al método de listar, el cuál se encargará de mostrarla de forma
	// ordenada.
	private static void listarFormacionDelEquipo(Equipo equipo) {
		System.out.println("\n--- Formación del Equipo ---");
		equipo.listarFormacionDelEquipo();

	}
}
