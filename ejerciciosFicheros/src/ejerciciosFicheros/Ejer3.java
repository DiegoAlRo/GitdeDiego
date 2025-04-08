package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejer3 {

	// Creamos un método para buscar una palabra en el archivo.
	public static int buscarPalabraEnArchivo(String rutaArchivo, String palabraClave) {

		// Creamos una variable para contar ocurrencias
		int contador = 0;

		try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {

			// Leemos línea por línea.
			String linea;

			while ((linea = lector.readLine()) != null) {

				// Dividimos la línea en palabras y buscar coincidencias.
				String[] palabras = linea.split("\\s+");
				for (String palabra : palabras) {
					if (palabra.equalsIgnoreCase(palabraClave)) {
						contador++;
					}
				}
			}

			// Atrapamos la excepción.
		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
		return contador;
	}

	// Creamos el main.
	public static void main(String[] args) {

		// Ponemos la ruta del archivo y palabra a buscar.
		String rutaArchivo = "C:/ruta/de/tu/archivo.txt";
		String palabraClave = "ejemplo";

		// Llamamos al método y mostramos el resultado.
		int ocurrencias = buscarPalabraEnArchivo(rutaArchivo, palabraClave);
		System.out.println("La palabra '" + palabraClave + "' aparece " + ocurrencias + " veces en el archivo.");
	}
}
