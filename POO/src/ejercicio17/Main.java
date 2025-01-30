package ejercicio17;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Crearemos una plaza de aparcamiento.
		PlazaAparcamiento plaza = new PlazaAparcamiento(1);

		// Importamos el escaner.
		Scanner sc = new Scanner(System.in);

		// Declararemos la variable que almacenará la opción escogida por el usuario.
		int opcion;

		// Le mostraremos un menú de opciones al usuario.
		do {
			System.out.print("Elige una opción: ");
			System.out.println("PLAZA APARCAMIENTO");
			System.out.println("1. Aparcar coche");
			System.out.println("2. Sacar coche");
			System.out.println("3. Ver coche aparcado");
			System.out.println("4. Salir aplicación");
			opcion = sc.nextInt();

			// Creamos un switch para devolverle al usuario lo que pide saber.
			switch (opcion) {
			case 1:
				if (plaza.isDisponible()) {
					System.out.print("Ingrese la matrícula: ");
					String matricula = sc.next();
					System.out.print("Ingrese la marca: ");
					String marca = sc.next();
					System.out.print("Ingrese el modelo: ");
					String modelo = sc.next();
					Coche coche = new Coche(matricula, marca, modelo);
					plaza.aparcarCoche(coche);
				} else {
					System.out.println("PLAZA YA OCUPADA POR OTRO COCHE.");
				}
				break;
			case 2:
				plaza.sacarCoche();
				break;
			case 3:
				plaza.mostrarCoche();
				break;
			case 4:
				plaza.mostrarEstadoPlaza();
				System.out.println("Gracias por utilizar la aplicación de gestión de plazas de aparcamiento.");
				break;
			default:
				System.out.println("Opción no válida.");
			}
		} while (opcion != 4);

		// Cerramos el escaner.
		sc.close();
	}
}
