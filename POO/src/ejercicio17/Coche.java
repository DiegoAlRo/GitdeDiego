package ejercicio17;

public class Coche {

	private String matricula;
	private String marca;
	private String modelo;

	// Creamos su constructor.
	public Coche(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	// Importamos los getters y setters.
	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	// Creamos un método para mostrarle al usuario los atributos.
	public void mostrarAtributos() {
		System.out.println("Matrícula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo);

	}
}
