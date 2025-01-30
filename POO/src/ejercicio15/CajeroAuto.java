package ejercicio15;

import java.util.Scanner;

public class CajeroAuto {

	private static Cuenta cuenta;

	public static void main(String[] args) {

		// Importamos el escaner.
		Scanner scanner = new Scanner(System.in);
		int opcion;

		// Le mostramos el menú de opciones al usuario.
		do {
			System.out.print("Seleccione una opción: ");
			System.out.println("1- Crear cuenta vacía.");
			System.out.println("2- Crear cuenta con saldo inicial.");
			System.out.println("3- Ingresar dinero.");
			System.out.println("4- Sacar dinero.");
			System.out.println("5- Ver saldo.");
			System.out.println("6- Salir.");
			opcion = scanner.nextInt();

			// Creamos un switch para devolverle al usuario lo que solicite.
			switch (opcion) {
			case 1:
				cuenta = new Cuenta(0);
				System.out.println("Cuenta creada con saldo 0.");
				break;
			case 2:
				System.out.print("Ingrese el saldo inicial: ");
				float saldoInicial = scanner.nextFloat();
				cuenta = new Cuenta(saldoInicial);
				System.out.println("Cuenta creada con saldo inicial.");
				break;
			case 3:
				if (cuenta != null) {
					System.out.print("Ingrese la cantidad a depositar: ");
					float cantidadIngreso = scanner.nextFloat();
					cuenta.ingresar(cantidadIngreso);
					System.out.println("Cantidad ingresada correctamente.");
				} else {
					System.out.println("Debe crear una cuenta primero.");
				}
				break;
			case 4:
				if (cuenta != null) {
					System.out.print("Ingrese la cantidad a extraer: ");
					float cantidadExtraccion = scanner.nextFloat();
					cuenta.extraer(cantidadExtraccion);
					System.out.println("Cantidad extraída correctamente.");
				} else {
					System.out.println("Debe crear una cuenta primero.");
				}
				break;
			case 5:
				if (cuenta != null) {
					System.out.println("Saldo actual: " + cuenta.getSaldo());
				} else {
					System.out.println("Debe crear una cuenta primero.");
				}
				break;
			case 6:
				System.out.println("Gracias por usar el cajero automático.");
				break;
			default:
				System.out.println("Opción no válida.");
			}
		} while (opcion != 6);

		// Cerramos el escaner.
		scanner.close();
	}
}
