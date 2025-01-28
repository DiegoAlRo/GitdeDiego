package ejercicio6;

import java.util.Scanner;

public class Persona {

	private String nombre;
	private int edad;

	// Luego crearemos su constructor e iniciaremoss los atributos.
	public Persona(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;
	}

	// Importaremos los getters y setters.
	public String getNombre() {
		return nombre;

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public int getEdad() {
		return edad;

	}

	public void setEdad(int edad) {
		this.edad = edad;

	}

	// Crearemos un método para poder recibir y almacenar los datos expuestos por el
	// usuario.
	public void recojerDatos(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;
	}

	// Y crearemos otro metodo para mostrarle los datos al usuario.
	public void imprimirDatos() {

		System.out.println("Nombre: " + nombre + ", Edad: " + edad);

	}
}

// A partir de Persona, se heredara una clase llamada Empleado, por lo que la crearemos aquí.
class Empleado extends Persona {

	// Con esta crearemos también un nuevo atributo.
	private double sueldo;

	// Entonces montaremos su constructor, en el cuál escribiremos el super, lo que
	// iniciará la superclase antes de empezar con la subclase, esta.
	public Empleado(String nombre, int edad, double sueldo) {

		super(nombre, edad);
		this.sueldo = sueldo;
	}

	// Volveremos a crear un método para almacenar cuánto sueldo gana el uusario.
	public void cargarSueldo(double sueldo) {

		this.sueldo = sueldo;
	}

	// Y otro para mostrarlo.
	public void imprimirSueldo() {

		System.out.println("Sueldo: " + sueldo);
	}
}
