package ejercicio12;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Importamos el escaner.
		Scanner sc = new Scanner(System.in);

		// Creamos un array que se encargará de almacenar los empleados.
		Empleado[] empleados = new Empleado[3];

		// Crearemos un bucle for que servirá para rellenar la información de cada
		// empleado.
		for (int i = 0; i < 3; i++) {
			System.out.println("Introduce el nombre del empleado " + (i + 1) + ":");
			String nombre = sc.nextLine();
			System.out.println("Introduce las horas trabajadas por " + nombre + ":");
			int horasTrabajadas = sc.nextInt();
			System.out.println("Introduce la tarifa por hora de " + nombre + ":");
			double tarifaPorHora = sc.nextDouble();
			sc.nextLine();

			empleados[i] = new Empleado(nombre, horasTrabajadas, tarifaPorHora);
		}

		// Mostraremos el sueldo bruto de cada empleado con un for each.
		for (Empleado empleado : empleados) {
			empleado.mostrarInfo();
		}

		// Cerramos el escaner.
		sc.close();
	}

}
