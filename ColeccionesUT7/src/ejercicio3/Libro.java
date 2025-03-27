package ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Libro implements Prestable {

	private String titulo;
	private String autor;
	private LocalDate fechaPublicacion;
	private List<String> Optimal;
	private Optional<String> usuarioPrestamo;

	public Libro(String titulo, String autor, LocalDate fechaPublicacion, List<String> Optimal) {

		this.titulo = titulo;
		this.autor = autor;
		this.fechaPublicacion = fechaPublicacion;
		this.Optimal = new ArrayList<>();
		this.usuarioPrestamo = Optional.empty();

	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public List<String> getOptimal() {
		return Optimal;
	}

	public boolean prestar(String usuario) {
		if (usuarioPrestamo.isEmpty()) {
			usuarioPrestamo = Optional.of(usuario);
			return true;
		}
		return false;

	}

	public boolean devolver(String usuario) {
		if (usuarioPrestamo.isPresent() && usuarioPrestamo.get().equals(usuario)) {
			usuarioPrestamo = Optional.empty();
			return true;
		}
		return false;
	}

	public String toString() {
		return String.format("Libro: %s, Autor: %s, Publicado: %s, Prestado: %s", titulo, autor, fechaPublicacion,
				usuarioPrestamo.orElse("No"));
	}

	public boolean estaPrestado() {
		return usuarioPrestamo.isPresent();
	}
}
