package ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	static ArrayList<Object> direcciones = new ArrayList<>();

	// Importamos el escaner.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Rellenamos los datos del usuario.
		Direccion dir1 = new Direccion("Calle A", 932, 1, "Ciudad Caballo");
		Direccion dir2 = new Direccion("Calle B", 410, 2, "Ciudad X");
		Direccion dir3 = new Direccion("Calle C", 423, 3, "Ciudad Algo");

		Empleado emp1 = new Empleado("Juan", 2000, dir1);
		Empleado emp2 = new Empleado("María", 2500, dir2);
		Empleado emp3 = new Empleado("Pedro", 3000, dir3);

		// Llamamos a los datos para mostrar los datos.
		emp1.mostrarDatos();
		emp2.mostrarDatos();
		emp3.mostrarDatos();

		// Cerramos el escaner.(Lo importé porque tenía pensado crear un menú con
		// distintas opciones las cuáles nos llevarían a los mismos resultados, pero se
		// me acabó complicando mucho y perdí mucho tiempo.)
		sc.close();
	}
}
