package ejerciciosFicheros;

import java.io.File;

public class Ejer1 {

	// Creamos un método que lista archivos .txt en una carpeta.
	public static void listarArchivosTxt(String carpeta) {

		// Creamos una variable que apuntará a la carpeta donde cuardar las cosas.
		File folder = new File(carpeta);

		// Con este condicional nos aseguraremos de la existencia y disponibilidad de la
		// carpeta.
		if (folder.exists() && folder.isDirectory()) {

			// Listaremos los archivos que haya en la carpeta que terminen por .txt.
			File[] archivos = folder.listFiles((dir, name) -> name.endsWith(".txt"));
			System.out.println("Archivos .txt en la carpeta '" + carpeta + "':");
			if (archivos != null && archivos.length > 0) {

				// Con este foreach recorreremos e imprimiremos el nombre de los archivos de la
				// lista.
				for (File archivo : archivos) {
					System.out.println(archivo.getName());

					// Además, en caso de que no se encuentren, el sistema se lo comunicará al
					// usuario.
				}
			} else {
				System.out.println("No se encontraron archivos .txt.");
			}
		} else {
			System.out.println("La carpeta no existe o no es un directorio válido.");
		}
	}

	// Creamos otro método que lista archivos de una extensión específica.
	public static void listarArchivosPorTipo(String carpeta, String extension) {

		// Creamos un objeto File apuntando a la carpeta especificada.
		File folder = new File(carpeta);

		// Creamos un condicional que determina si se encuentra el objeto.
		if (folder.exists() && folder.isDirectory()) {
			File[] archivos = folder.listFiles((dir, name) -> name.endsWith("." + extension));
			System.out.println("Archivos con extensión ." + extension + " en la carpeta '" + carpeta + "':");

			// Comprueba si hay archivos de la extensión deseada y los muestra.
			if (archivos != null && archivos.length > 0) {
				for (File archivo : archivos) {
					System.out.println(archivo.getName());
				}
			} else {
				System.out.println("No se encontraron archivos con la extensión ." + extension + ".");
			}
		} else {
			System.out.println("La carpeta no existe o no es un directorio válido.");
		}
	}

	// Creamos el main.
	public static void main(String[] args) {

		// Llamamos a los métodos.
		listarArchivosTxt("C:/");
		listarArchivosPorTipo("C:/", "pdf");
	}
}
