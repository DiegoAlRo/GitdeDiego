package ejercicio13;

public class Main {
	public static void main(String[] args) {
		Alimento alimento = new Alimento("Manzana", 0.3, 14, 0.3, false, 'A', 'M');
		System.out.println(alimento.muestraAlimento());
		System.out.println("¿Es dietético? " + (alimento.esDietetico() ? "Sí" : "No"));

	}

}
