package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer6 {

	// Creamos uun método para capitalizar un archivo.
	public static void capitalizarArchivo(String rutaArchivo) {

		// Creamos la ruta del archivo modificado.
		String archivoModificado = rutaArchivo.replace(".txt", "_modificado.txt");

		try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
				BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoModificado))) {
			String linea;

			// Creamos un bucle para ir línea por línea.
			while ((linea = lector.readLine()) != null) {

				// Capitalizamos cada palabra en la línea.
				String nuevaLinea = capitalizarLinea(linea);

				// Escribimos la línea modificada en el archivo nuevo.
				escritor.write(nuevaLinea);
				escritor.newLine();
			}

			// Le indicamos al usuario donde se ha guardado el archivo modificado.
			System.out.println("Archivo modificado guardado en: " + archivoModificado);

			// Atrapamos la excepción.
		} catch (IOException e) {
			System.out.println("Error al procesar el archivo: " + e.getMessage());
		}
	}

	// Creamos un método que capitaliza cada palabra de una línea de texto.
	private static String capitalizarLinea(String linea) {
		StringBuilder resultado = new StringBuilder();

		// Dividimos la línea en palabras.
		String[] palabras = linea.split("\\s+");
		for (String palabra : palabras) {
			if (!palabra.isEmpty()) {

				// Convertimos la primera letra en mayúscula y el resto en minúscula.
				resultado.append(Character.toUpperCase(palabra.charAt(0))).append(palabra.substring(1).toLowerCase())
						.append(" ");
			}
		}

		// Nos aseguramos de quitar espacios adicionales.
		return resultado.toString().trim();
	}

	// Creamos el main.
	public static void main(String[] args) {
		String rutaArchivo = "C:/ruta/de/tu/fichero.txt";

		// Llamamos al método para capitalizar el contenido del archivo.
		capitalizarArchivo(rutaArchivo);
	}

}
