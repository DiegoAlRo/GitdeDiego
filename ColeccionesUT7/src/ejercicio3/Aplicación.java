package ejercicio3;

import java.time.LocalDate;

// Crearemos el main que simulará la aplicación de la biblioteca.
public class Aplicación {
	public static void main(String[] args) {

		// Crearemos una biblioteca.
		Biblioteca biblioteca = new Biblioteca();

		// Crearemos y agregaremos libros manualmente a continuación,
		Libro libro1 = new Libro("El Quijote", "Cervantes", LocalDate.of(1605, 1, 16));
		Libro libro2 = new Libro("Jurassic Park", "Michael Crichton", LocalDate.of(1990, 11, 20));
		Libro libro3 = new Libro("El Lazarillo de Tormes", "Anónimo", LocalDate.of(1554, 1, 28));

		// Agregaremos los libros a la biblioteca.
		biblioteca.agregarLibro(libro1);
		biblioteca.agregarLibro(libro2);
		biblioteca.agregarLibro(libro3);

		// Probaremos métodos de Biblioteca.
		System.out.println("Libros disponibles:");
		biblioteca.listarLibrosDisponibles().forEach(System.out::println);

		System.out.println("\nLibros más antiguos:");
		biblioteca.MasAntiguos().forEach(System.out::println);

		System.out.println("\nNúmero de libros prestados: " + biblioteca.Prestados());
	}
}
