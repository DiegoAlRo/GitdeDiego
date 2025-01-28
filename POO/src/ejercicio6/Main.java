package ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Importamos el escaner.
		Scanner sc = new Scanner(System.in);

		// Le pediremos los datos al usuario, su nombre y edad.
		System.out.println("Hola, introduce tu nombre:");
		String nombre = sc.next();

		System.out.println("Introduce tu edad:");
		int edad = sc.nextInt();

		// De esta forma almacenaremos los valores introducidos por el usuario, en una
		// persona.
		Persona persona1 = new Persona(nombre, edad);

		// Luego los imprimiremos.
		persona1.imprimirDatos();
		System.out.println();

		// Volveremos a solicitar datos, pero esta vez al empleado.
		System.out.println("Hola, introduce tu nombre:");
		String nombreEmp = sc.next();

		System.out.println("Introduce tu edad:");
		int edadEmp = sc.nextInt();

		System.out.println("Introduce tu sueldo:");
		int sueldo = sc.nextInt();

		// Los almacenaremos en un empleado.
		Empleado empleado1 = new Empleado(nombreEmp, edadEmp, sueldo);

		// Y luego imprimiremos estos datos.
		empleado1.imprimirDatos();

		// Además, mostraremos su sueldo.
		empleado1.imprimirSueldo();
	}
}
