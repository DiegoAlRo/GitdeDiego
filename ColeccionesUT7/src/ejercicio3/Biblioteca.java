package ejercicio3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Crearemos la clase biblioteca.
public class Biblioteca {
	private List<Libro> libros;

	// Definiremos su constructor.
	public Biblioteca() {
		libros = new ArrayList<>();
	}

	// Crearemos un métodos para añadir libros a la lista.
	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}

	// También un método para mostrar los libros.
	public List<Libro> listarLibrosDisponibles() {
		return libros.stream().filter(libro -> !libro.estaPrestado()).toList();
	}

	// Este método dvolverá los libros más antiguos.
	public List<Libro> MasAntiguos() {
		return libros.stream().sorted(Comparator.comparing(Libro::getFechaPublicacion)).limit(3).toList();
	}

	// Este otro contará los prestados.
	public long Prestados() {
		return libros.stream().filter(Libro::estaPrestado).count();
	}

	// En este caso servirá como filtro para los libros, por autor.
	public List<Libro> filtrarPorAutor(String autor) {
		return libros.stream().filter(libro -> libro.getAutor().equalsIgnoreCase(autor)).toList();
	}
}
