package ejercicio2;

import java.util.Scanner;

public class VehiculoApp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce el modelo del vehículo:");
	String modelo =sc.next();
	Vehiculo  vehiculo = new Vehiculo(modelo);
	
	System.out.println("Introduce la potencia del vehículo:");
	double potencia = sc.nextDouble();
	vehiculo.setPotencia(potencia);
	
	System.out.println("¿Tiene tracción de cuatro ruedas?");
	boolean traccion4ruedas = sc.nextBoolean();
	
	System.out.println(vehiculo.imprimir());
	
	sc.close();
}
}
