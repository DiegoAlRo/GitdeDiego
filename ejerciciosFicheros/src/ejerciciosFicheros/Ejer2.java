package ejerciciosFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer2 {

	// Creamos un método para crear archivos.
	public static void crearArchivos(int num, String carpeta) {

		// Creamos un objeto File para la carpeta.
		File folder = new File(carpeta);

		// Creamos un condicional para que en el caso de que la carpeta no exista,
		// crearla.
		if (!folder.exists()) {
			if (folder.mkdirs()) {
				System.out.println("Carpeta creada en: " + carpeta);
			} else {
				System.out.println("No se pudo crear la carpeta.");
				return;
			}
		}

		// Creamos archivos.
		for (int i = 1; i <= num; i++) {
			String nombreArchivo = "nombre(" + i + ").txt";
			File archivo = new File(folder, nombreArchivo);
			try (FileWriter escritor = new FileWriter(archivo)) {

				// Escribimos la frase en el archivo.
				escritor.write("Este es el fichero " + nombreArchivo);
				System.out.println("Archivo creado: " + archivo.getAbsolutePath());
			} catch (IOException e) {
				System.out.println("Error al crear el archivo: " + nombreArchivo);
				e.printStackTrace();
			}
		}
	}

	// Creamos el main.
	public static void main(String[] args) {

		// Importamos el escaner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario el número de archivos.
		System.out.print("Introduce el número de archivos a crear: ");
		int n = sc.nextInt();
		sc.nextLine();

		// Solicitamos al usuario la ruta de la carpeta.
		System.out.print("Introduce la ruta de la carpeta: ");
		String carpeta = sc.nextLine();

		// Llamamos al método para crear los archivos.
		crearArchivos(n, carpeta);

		// Cerramos el escaner.
		sc.close();
	}
}
