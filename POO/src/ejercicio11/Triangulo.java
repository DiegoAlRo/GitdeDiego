package ejercicio11;

public class Triangulo {
	private double longLado1;
	private double longLado2;
	private double longLado3;

	// Creamos el constructor e iniciamos los atributos.
	public Triangulo(double longlado1, double longlado2, double longlado3) {

		this.longLado1 = longlado1;
		this.longLado2 = longlado2;
		this.longLado3 = longlado3;

	}

	// Creamos un método que determinará si dos triángulos son o no iguales.
	public boolean compareTo_Triangulos(Triangulo a, Triangulo b) {
		return (a.longLado1 == b.longLado1 && a.longLado2 == b.longLado2 && a.longLado3 == b.longLado3);

	}

	// Creamos otro método que determinará si un conjunto de Triangulos son iguales.
	public boolean compareTo_VTriangulos(Triangulo[] v) {
		if (v.length == 0) {
			return true;
		}
		for (int i = 1; i < v.length; i++) {
			if (!compareTo_Triangulos(v[0], v[i])) {
				return false;
			}
		}
		return true;
	}

	// Volvemos a crear un método, que indica el tipo de triángulo (1: equilátero,
	// 2: isósceles, 3:
	// escaleno).
	public int tipo_Triangulo() {
		if (longLado1 == longLado2 && longLado2 == longLado3) {
			return 1; // Equilátero
		} else if (longLado1 == longLado2 || longLado2 == longLado3 || longLado1 == longLado3) {
			return 2; // Isósceles
		} else {
			return 3; // Escaleno
		}
	}

}
