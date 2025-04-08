package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer4 {

	// Creamos un método para eliminar ocurrencias.
	public static void eliminarOcurrencias(String rutaArchivo, String palabraClave) {

		// Creamos una ruta para el nuevo archivo.
		String nuevoArchivo = rutaArchivo.replace(".txt", "_2.txt");

		try (
				// Abrimos el flujo de lectura para el archivo original.
				BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));

				// Abrimos el flujo de escritura para el nuevo archivo.
				BufferedWriter escritor = new BufferedWriter(new FileWriter(nuevoArchivo))) {

			String linea;

			// Leemos línea por línea.
			while ((linea = lector.readLine()) != null) {

				// Reemplazamos todas las ocurrencias de la palabra clave por un espacio vacío.
				String nuevaLinea = linea.replace(palabraClave, "");

				// Escribimos la nueva línea en el archivo generado.
				escritor.write(nuevaLinea);

				escritor.newLine();
			}

			// Le mostramos al usuario donde está guardado el archivo.
			System.out.println("Archivo procesado y guardado en: " + nuevoArchivo);

			// Atrapamos la excepción.
		} catch (IOException e) {
			System.out.println("Error al procesar el archivo: " + e.getMessage());
		}
	}

	// Creamos el main.
	public static void main(String[] args) {

		// Ruta del archivo original y palabra a eliminar.
		String rutaArchivo = "C:/ruta/de/tu/fichero.txt";
		String palabraClave = "eliminar";

		// Llamamos al método para eliminar las ocurrencias.
		eliminarOcurrencias(rutaArchivo, palabraClave);
	}
}
