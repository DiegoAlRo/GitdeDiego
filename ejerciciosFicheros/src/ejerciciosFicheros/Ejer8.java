package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejer8 {

	// Creamos un método sobrecargado para combinar palabras desde una lista de
	// archivos.
	public static void combinarArchivos(List<String> listaArchivos) {
		String archivoCombinado = "archivo_combinado_multiples.txt"; // Nombre del archivo resultante

		try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoCombinado))) {
			for (String rutaArchivo : listaArchivos) {
				try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {

					// Extraemos las palabras del archivo actual y escribirlas en el archivo
					// combinado.
					List<String> palabras = extraerPalabras(lector);
					for (String palabra : palabras) {

						// Escribimos cada palabra separada por un espacio.
						escritor.write(palabra + " ");
					}
					escritor.newLine();

					// Atrapamos la excepción.
				} catch (IOException e) {
					System.out.println("Error al leer el archivo: " + rutaArchivo);
				}
			}

			// Le confirmamos al usuario la creación del archivo.
			System.out.println("Archivo combinado creado: " + archivoCombinado);

			// Atrapamos la excepción.
		} catch (IOException e) {
			System.out.println("Error al escribir el archivo combinado: " + e.getMessage());
		}
	}

	// Creamos un método para extraer palabras de un archivo.
	private static List<String> extraerPalabras(BufferedReader lector) throws IOException {
		List<String> palabras = new ArrayList<>();
		String linea;
		while ((linea = lector.readLine()) != null) {
			String[] split = linea.split("\\s+");
			palabras.addAll(Arrays.asList(split));
		}
		return palabras;
	}

	// Creamos el main.
	public static void main(String[] args) {

		// Creamos una lista de rutas de archivos.
		List<String> listaArchivos = Arrays.asList("C:", "C:",

				// Añade más rutas según si es necesario.
				"C:");

		// Llamamos al método sobrecargado para combinar los archivos.
		combinarArchivos(listaArchivos);
	}

}
