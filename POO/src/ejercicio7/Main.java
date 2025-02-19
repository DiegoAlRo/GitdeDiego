package ejercicio7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Importamos el escaner.
		Scanner sc = new Scanner(System.in);

		// Creamos una variable para poder utilizarla en un while.
		boolean repetir = true;

		// Creamos una asignaura.
		Asignatura asignatura1 = null;

		// Creamos un while que usará la variable anterior y nos servirá para que el
		// usuario pueda escoger las opciones que quiera.
		while (repetir) {

			// Le mostramos un menú de opciones.
			System.out.println("Escoge la opción que quiera:");
			System.out.println("1-Añadir asignatura y nota.");
			System.out.println("2-Modificar nota.");
			System.out.println("3-Ver nota.");
			System.out.println("4-Ver nombre de asignatura.");
			System.out.println("5-Ver resultado.");

			// Leemos su elección.
			int respuesta = sc.nextInt();

			// Creamos un switch para devolverele lo correspondiente según la opción que
			// elija.
			switch (respuesta) {

			// En este caso le preguntaremos los datos adecuados para crear una asignatura.
			case '1':
				System.out.print("Introduce el nombre de la asignatura: ");
				String nombre = sc.nextLine();
				System.out.print("Introduce la nota de la asignatura: ");
				double nota = sc.nextDouble();
				asignatura1 = new Asignatura(nombre, nota);
				System.out.println("Asignatura y nota añadidas.");
				break;

			// En el segundo caso, en el caso de que ya se haya introducido una nota, se le
			// dará al usuario la oportunidad de cambiarla.
			case 2:
				if (asignatura1 != null) {
					System.out.print("Introduce la nueva nota de la asignatura: ");
					double nuevaNota = sc.nextDouble();
					asignatura1.modNota(nuevaNota);
					System.out.println("Nota modificada.");
				} else {
					System.out.println("Primero debes añadir una asignatura.");
				}
				break;

			// Este sencilla opción devolverá un método que mostrará la nota de la
			// asignatura.
			case 3:
				if (asignatura1 != null) {
					asignatura1.mostrarNota();
				} else {
					System.out.println("Primero debes añadir una asignatura.");
				}
				break;

			// Esta opción mostrará el nombre de la asignatura.
			case 4:
				if (asignatura1 != null) {
					asignatura1.mostrarNombre();
				} else {
					System.out.println("Primero debes añadir una asignatura.");
				}
				break;

			// La 5º opción determinará si el usuario ha aprobado o no la asignatura.
			case 5:
				if (asignatura1 != null) {
					asignatura1.aprobado();
				} else {
					System.out.println("Primero debes añadir una asignatura.");
				}
				break;

			// Y la 6 servirá para salir del programa.
			case 6:
				repetir = false;
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida. Por favor, escoge una opción del 1 al 6.");
			}
		}

		// Cerramos el escaner.
		sc.close();
	}
}
