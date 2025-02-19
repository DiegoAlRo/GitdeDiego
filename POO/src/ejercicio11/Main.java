package ejercicio11;

public class Main {
	public static void main(String[] args) {

		// Aquí probaremos los métodos de la clase Triangulo
		Triangulo t1 = new Triangulo(3, 3, 3);
		Triangulo t2 = new Triangulo(3, 3, 3);
		Triangulo t3 = new Triangulo(4, 4, 4);
		Triangulo t4 = new Triangulo(3, 4, 5);
		Triangulo[] v = { t1, t2, t3, t4 };

		System.out.println("t1 y t2 son iguales: " + t1.compareTo_Triangulos(t1, t2));
		System.out.println("Todos los triángulos en v son iguales: " + t1.compareTo_VTriangulos(v));
		System.out.println("Tipo de t1: " + t1.tipo_Triangulo());
		System.out.println("Tipo de t4: " + t4.tipo_Triangulo());

	}
}
