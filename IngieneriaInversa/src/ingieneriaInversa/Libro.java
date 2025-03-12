package ingieneriaInversa;

/**
 * La clase Libo hace alusión a un libro que posee un título, autor y
 * disponibilidad.
 */
public class Libro {

	private String titulo;
	private String autor;
	private boolean disponible;

	/**
	 * Creamos un constructor de libro con título y autor como atributos.
	 * 
	 * @param titulo
	 * @param autor
	 */
	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.disponible = true;
	}

	/**
	 * Se generan los getters y setters.
	 * 
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}

/**
 * La clase Usuario representa un usuario de la biblioteca con nombre y DNI.
 */
class Usuario {
	private String nombre;
	private String dni;

	/**
	 * Creamos un constructor de Usuario con nombre y DNI.
	 * 
	 * @param nombre
	 * @param dni
	 */
	public Usuario(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	/**
	 * Generamos los getters y setters.
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}
}

/**
 * Esta clase Prestamos representa un préstamo de un libro a un usuario.
 */
class Prestamo {
	private Libro libro;
	private Usuario usuario;

	/**
	 * Crea una instancia de Prestamo con libro y usuario.
	 * 
	 * @param libro
	 * @param usuario
	 */
	public Prestamo(Libro libro, Usuario usuario) {
		this.libro = libro;
		this.usuario = usuario;
		libro.setDisponible(false);
	}

	/**
	 * Este método devuelve el libro prestado.
	 */
	public void devolver() {
		libro.setDisponible(true);
	}
}

/**
 * /** La clase Biblioteca se trata del punto de entrada principal al sistema de
 * la biblioteca.
 */
class Biblioteca {
	public static void main(String[] args) {
		Libro libro = new Libro("1984", "George Orwell");
		Usuario usuario = new Usuario("Ana Pérez", "12345678A");
		Prestamo prestamo = new Prestamo(libro, usuario);
		prestamo.devolver();
	}
}
