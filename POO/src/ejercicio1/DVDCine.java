package ejercicio1;

public class DVDCine {

	// Creamos el constructor del objeto y definimos sus atributos.
	private String titulo;
	private String director;
	private String actores;
	private String genero;
	private int duracion;
	private String resumen;

	public DVDCine(String titulo, String director, String actores, String genero, int duracion, String resumen) {

		this.titulo = titulo;
		this.director = director;
		this.actores = actores;
		this.genero = genero;
		this.duracion = duracion;
		this.resumen = resumen;
	}

	// Creamos un método que devuelva la información de la película introducida por
	// el susuario.
	public String muestraDVDCine() {
		return titulo + " (" + genero.toUpperCase() + ") De: " + director + "\n" + "Con: " + actores + "\n" + genero
				+ " - " + duracion + " min.\n" + "Resumen: " + resumen + "\n";
	}

	// Creamos una función que determine si la película es thriller.
	public boolean esThriller() {
		return genero.equalsIgnoreCase("thriller");

	}

	// Creamos otro método para comprobar si la película posee o no resumen.
	public boolean tieneResumen() {
		return resumen != null && !resumen.isEmpty();
	}

	// Y por último creamos otro método qaue devuelva la duración de la película.
	public String muestraDuracion() {
		return duracion + " min.";
	}
}