package ejercicio2;

import java.util.Scanner;

public class VehiculoApp {
	public static void main(String[] args) {

		// Importamos el escaner.
		Scanner sc = new Scanner(System.in);

		// Le solicitamos el modelo del vehículo al dueño.
		System.out.println("Introduce el modelo del vehículo:");
		String modelo = sc.next();

		Vehiculo vehiculo = new Vehiculo(modelo);

		// Le pedimos la potencia del vehículo.
		System.out.println("Introduce la potencia del vehículo:");
		double potencia = sc.nextDouble();
		vehiculo.setPotencia(potencia);

		// Le preguntamos si el vehículo tiene tracción de cuatro ruedas.
		System.out.println("¿Tiene tracción de cuatro ruedas?");
		boolean traccion4ruedas = sc.nextBoolean();

		// Usamos un método para imprimir la información del vehículo.
		System.out.println(vehiculo.imprimir());

		// Cerramos el escaner.
		sc.close();
	}
}
