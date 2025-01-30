package ejercicio14;

public class Marciano {

	private boolean vivo = false;
	private String nombre;
	private static int numMarcianos = 0;

	// Creamos el constructor e iniciamos los atributos.
	public Marciano(String nombre) {
		this.vivo = true;
		this.setNombre(nombre);
		numMarcianos++;
		this.nace();
	}

	// Creamos un método para hacer que un marciano nazca y salte el mensaje.
	private void nace() {
		System.out.println("Hola, he nacido y soy el marciano " + this.getNombre() + ". Marcianos vivos: " + numMarcianos);

	}

	// Creamos un método que matará al marciano en caso de que aún esté vivo.
	public void muere() {
		if (this.vivo) {
			this.vivo = false;
			numMarcianos--;
			System.out.println("El marciano " + this.getNombre() + " ha muerto");
		} else {
			System.out.println("El marciano " + this.getNombre() + " ya está muerto");
		}
	}

	// Creamos un boolean que determinará si el marciano está vivo o muerto.
	public boolean estaVivo() {
		return this.vivo;
	}

	// Y creamos un método para contar los marcianos.
	public static int cuentaMarcianos() {
		return numMarcianos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
