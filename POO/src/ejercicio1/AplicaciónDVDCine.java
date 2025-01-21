package ejercicio1;

import java.util.Scanner;

public class AplicaciónDVDCine {
	public static void main(String[] args) {

		// Importamos el escaner.
		Scanner sc = new Scanner(System.in);

		// Le solicitamos al usuario todos los datos de la película.
		System.out.println("Introduce el título de la película:");
		String titulo = sc.nextLine();
		System.out.println();

		System.out.println("Introduce el director de la película:");
		String director = sc.nextLine();
		System.out.println();

		System.out.println("Introduce los actores de la película:");
		String actores = sc.nextLine();
		System.out.println();

		System.out.println("Introduce el género de la película:");
		String genero = sc.nextLine();
		System.out.println();

		System.out.println("Introduce la duración de la película (en minutos):");
		int duracion = sc.nextInt();
		System.out.println();
		sc.nextLine();
		System.out.println();

		System.out.println("Introduce el resumen de la película:");
		String resumen = sc.nextLine();
		System.out.println();

		// Creamos un objeto nuevo donde se almacenará la información introducida por el
		// usuario.
		DVDCine dvd = new DVDCine(titulo, director, actores, genero, duracion, resumen);

		// Usamos el método para devolver la información de la película.
		System.out.println("Información de la película:");
		System.out.println(dvd.muestraDVDCine());
		System.out.println();

		// Usamos dos métodos, para determinar si es o no thriller, y si la película
		// posee un resumen.
		System.out.println("¿Es el género de la película thriller? " + dvd.esThriller());
		System.out.println("¿La película tiene un resumen? " + dvd.tieneResumen());
	}

}
