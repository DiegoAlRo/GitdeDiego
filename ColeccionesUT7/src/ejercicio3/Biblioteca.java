package ejercicio3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Biblioteca {
	private List<Libro> libros;

	public Biblioteca() {
		libros = new ArrayList<>();
	}

	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}

	public List<Libro> listarLibrosDisponibles() {
		return libros.stream().filter(libro -> !libro.estaPrestado()).toList();
	}

	public List<Libro> obtenerLibrosMasAntiguos() {
		return libros.stream().sorted(Comparator.comparing(Libro::getFechaPublicacion)).limit(3).toList();
	}

	public long contarLibrosPrestados() {
		return libros.stream().filter(Libro::estaPrestado).count();
	}

	public List<Libro> filtrarLibrosPorAutor(String autor) {
		return libros.stream().filter(libro -> libro.getAutor().equalsIgnoreCase(autor)).toList();
	}
}
