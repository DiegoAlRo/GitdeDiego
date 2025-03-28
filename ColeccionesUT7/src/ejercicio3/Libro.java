package ejercicio3;

import java.time.LocalDate;
import java.util.Optional;

// Creamos el objeto libro, el cuál implementará la interfaz Prestable.
public class Libro implements Prestable {

	private String titulo;
	private String autor;
	private LocalDate fechaPublicacion;
	private Optional<String> usuarioPrestamo = Optional.empty();

	public Libro(String titulo, String autor, LocalDate fechaPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.fechaPublicacion = fechaPublicacion;

	}

	// Importamos los getters.
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	// Implementamos uno de los métodos de la interfaz, que se encargará de prestar
	// un libro en caso de estar disponible.
	public boolean prestar(String usuario) {
		if (usuarioPrestamo.isEmpty()) {
			usuarioPrestamo = Optional.of(usuario);
			return true;
		}
		return false;

	}

	// Implementamos el segundo método de la interfaz, el cuál se encargará de
	// devolver un libro.
	public boolean devolver(String usuario) {
		if (usuarioPrestamo.isPresent() && usuarioPrestamo.get().equals(usuario)) {
			usuarioPrestamo = Optional.empty();
			return true;
		}
		return false;
	}

	// Este string podrá mostrar la información sobre libro.
	public String toString() {
		return "Libro{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + ", fechaPublicacion="
				+ fechaPublicacion + ", usuarioPrestamo="
				+ (usuarioPrestamo.isPresent() ? usuarioPrestamo.get() : "Ninguno") + '}';
	}

	public boolean estaPrestado() {
		return usuarioPrestamo.isPresent();
	}
}
