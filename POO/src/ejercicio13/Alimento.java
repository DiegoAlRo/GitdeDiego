package ejercicio13;

public class Alimento {

	private String nombre;
	private double contenidoLipidos;
	private double contenidoCarbohidratos;
	private double contenidoProteinas;
	private boolean origenAnimal;
	private char contenidoVitaminas;
	private char contenidoMinerales;

	// Este será el constructor que solo recibirá el nombre del alimento.
	public Alimento(String nombre) {
		this.nombre = nombre;

	}

	// Y este constructor recibe todos los atributos.
	public Alimento(String nombre, double contenidoLipidos, double contenidoCarbohidratos, double contenidoProteinas,
			boolean origenAnimal, char contenidoVitaminas, char contenidoMinerales) {

		this.nombre = nombre;
		this.contenidoLipidos = contenidoLipidos;
		this.contenidoCarbohidratos = contenidoCarbohidratos;
		this.contenidoProteinas = contenidoProteinas;
		this.origenAnimal = origenAnimal;
		this.contenidoVitaminas = contenidoVitaminas;
		this.contenidoMinerales = contenidoMinerales;
	}

	// Crearemos un método que determinará si el alimento es dietético.
	public boolean esDietetico() {
		return contenidoLipidos < 20 && contenidoVitaminas != 'B';
	}

	// Y este método mostrará la descripción del alimento.
	public String muestraAlimento() {
		return "Nombre: " + nombre + "\n" + "Contenido en lípidos: " + contenidoLipidos + "%\n"
				+ "Contenido en carbohidratos: " + contenidoCarbohidratos + "%\n" + "Contenido en proteínas: "
				+ contenidoProteinas + "%\n" + "Origen animal: " + (origenAnimal ? "Sí" : "No") + "\n"
				+ "Contenido en vitaminas: " + contenidoVitaminas + "\n" + "Contenido en minerales: "
				+ contenidoMinerales + "\n";
	}

}
