package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejer7 {

	// Creamos un método para combinar archivos.
	public static void combinarArchivos(String rutaArchivo1, String rutaArchivo2) {
		// Le ponemos nombre del archivo resultante.
		String archivoCombinado = "archivo_combinado.txt";

		try (BufferedReader lector1 = new BufferedReader(new FileReader(rutaArchivo1));
				BufferedReader lector2 = new BufferedReader(new FileReader(rutaArchivo2));
				BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoCombinado))) {

			// Leemos y dividimos palabras de ambos archivos.
			List<String> palabras1 = extraerPalabras(lector1);
			List<String> palabras2 = extraerPalabras(lector2);

			// Alternamos palabras y escribir en el archivo combinado.
			int i = 0, j = 0;
			while (i < palabras1.size() && j < palabras2.size()) {
				escritor.write(palabras1.get(i++) + " ");
				escritor.write(palabras2.get(j++) + " ");
			}

			// Añadimsos las palabras restantes del archivo 1.
			while (i < palabras1.size()) {
				escritor.write(palabras1.get(i++) + " ");
			}

			// Añadimos las palabras restantes del archivo 2.
			while (j < palabras2.size()) {
				escritor.write(palabras2.get(j++) + " ");
			}

			// Le indicamos que hemos creado el archivo combinado al usuario y le mostramos
			// su nombre.
			System.out.println("Archivo combinado creado: " + archivoCombinado);

			// Capturamos la excepción.
		} catch (IOException e) {
			System.out.println("Error al procesar los archivos: " + e.getMessage());
		}
	}

	// Creamos un método para extraer palabras de un archivo.
	private static List<String> extraerPalabras(BufferedReader lector) throws IOException {

		// creamos una lista de palabras.
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

		// Estas son las rutas de los archivos a combinar.
		String rutaArchivo1 = "C:";
		String rutaArchivo2 = "C:";

		// Llamamos al método para combinar los archivos.
		combinarArchivos(rutaArchivo1, rutaArchivo2);
	}
}
