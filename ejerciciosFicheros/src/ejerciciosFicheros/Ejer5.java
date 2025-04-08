package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer5 {

	// Creamos un método para cifrar el contenido de un archivo con el cifrado
	// César.
	public static void cifrarArchivo(String rutaArchivo, int desplazamiento) {

		// Llamamos al método.
		procesarArchivo(rutaArchivo, desplazamiento, true);
	}

	// Creamos un método para descifrar el contenido de un archivo con el cifrado
	// César.
	public static void descifrarArchivo(String rutaArchivo, int desplazamiento) {
		// Llamamos al método.
		procesarArchivo(rutaArchivo, desplazamiento, false);
	}

	// Creamos un método genérico para procesar el archivo (cifrar o descifrar).
	private static void procesarArchivo(String rutaArchivo, int desplazamiento, boolean cifrar) {
		String nuevoArchivo = rutaArchivo.replace(".txt", cifrar ? "_cifrado.txt" : "_descifrado.txt");

		try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
				BufferedWriter escritor = new BufferedWriter(new FileWriter(nuevoArchivo))) {
			String linea;
			while ((linea = lector.readLine()) != null) {

				String nuevaLinea = cifrarCesar(linea, cifrar ? desplazamiento : -desplazamiento);
				escritor.write(nuevaLinea);
				escritor.newLine();
			}
			System.out
					.println((cifrar ? "Cifrado" : "Descifrado") + " completado. Archivo guardado en: " + nuevoArchivo);
		} catch (IOException e) {
			System.out.println("Error al procesar el archivo: " + e.getMessage());
		}
	}

	// Creamos un método que aplica el cifrado César a una línea de texto.
	private static String cifrarCesar(String texto, int desplazamiento) {
		StringBuilder resultado = new StringBuilder();
		desplazamiento = desplazamiento % 26;
		for (char c : texto.toCharArray()) {
			if (Character.isLetter(c)) {
				char base = Character.isUpperCase(c) ? 'A' : 'a';
				c = (char) ((c - base + desplazamiento + 26) % 26 + base);
			}
			resultado.append(c);
		}
		return resultado.toString();
	}

	public static void main(String[] args) {
		String rutaArchivo = "C:/ruta/de/tu/fichero.txt";
		int desplazamiento = 3;

		cifrarArchivo(rutaArchivo, desplazamiento);
		descifrarArchivo(rutaArchivo.replace(".txt", "_cifrado.txt"), desplazamiento);
	}
}
