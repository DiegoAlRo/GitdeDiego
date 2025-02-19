package ejercicio16;

// En esta clase probaremos a los personajes.
public class Test {
	public static void main(String[] args) {

		// Crearemos dos guerreros junto con su energía.
		Guerrero guerrero = new Guerrero("Arthur", "Espada", 150);

		// También haremos lo mismo con un mago y su hechizo.
		Mago mago = new Mago("Merlín", "Hechizo de Fuego");

		// Aquí probaremos los métodos de Guerrero.
		System.out.println("Guerrero: " + guerrero.getNombre() + ", Energía: " + guerrero.getNivelEnergia());
		guerrero.alimentarse(20);
		System.out.println("Después de alimentarse, Energía: " + guerrero.getNivelEnergia());
		System.out.println("Combate: " + guerrero.combatir(30));
		System.out.println("Después de combatir, Energía: " + guerrero.getNivelEnergia());

		// Y aquí probaremos los métodos de Mago.
		System.out.println("Mago: " + mago.getNombre() + ", Energía: " + mago.getNivelEnergia());
		mago.alimentarse(10);
		System.out.println("Después de alimentarse, Energía: " + mago.getNivelEnergia());
		System.out.println("Encantar: " + mago.encantar());
		System.out.println("Después de encantar, Energía: " + mago.getNivelEnergia());

	}
}
