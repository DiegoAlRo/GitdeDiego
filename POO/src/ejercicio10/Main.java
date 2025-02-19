package ejercicio10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Almacen almacen1 = new Almacen(20, 20);

		// Importamos el escaner.
		Scanner sc = new Scanner(System.in);

		// Creamos una variable boolean para poder repetir el menú de opciones.
		boolean repetir = true;

		// Creamos un while usando la variable anterior y le damos a escoger una opción
		// al usuario.
		while (repetir) {
			System.out.println("Escoge una opción:");
			System.out.println("1-Añadir kilos de Choclo.");
			System.out.println("2-Añadir kilos de Patata.");
			System.out.println("3-Ver kilos de Choclo.");
			System.out.println("4-Ver kilos de Patata.");
			System.out.println("5-Ver cuántos comensales pueden ser atendidos.");
			System.out.println("6-Salir.");

			// Aquí leemos su respuesta.
			int respuesta = sc.nextInt();

			// Creamos un switch para devolverle lo solicitado dependiendo de su respuesta.
			switch (respuesta) {

			case '1':
				System.out.println("¿Cuantos kilos desea añadir?:");
				almacen1.masChoclos(sc.nextInt());
				break;
			case '2':
				System.out.println("¿Cuantos kilos desea añadir?:");
				almacen1.masPapas(sc.nextInt());
				break;
			case '3':
				almacen1.mostrarChoclo();
				break;
			case '4':
				almacen1.mostrarPapas();
				break;
			case '5':
				System.out.println("Los comensales que se pueden atender son: " + almacen1.getComensales());
				break;
			case '6':
				System.out.println("Saliendo...");
				repetir = false;
				break;
			default:
				System.out.println("Esa opción no es válida, prueba denuevo:");
				break;
			}
		}
	}

}
