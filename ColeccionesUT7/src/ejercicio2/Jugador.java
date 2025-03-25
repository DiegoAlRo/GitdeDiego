package ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Creamos el objeto Jugador.
public class Jugador implements Competidor {

	private String nombre;
	private LocalDate fechaRegistro;
	private List<Integer> partidas;

	// Definimos su constructor e iniciamos sus atributos.
	public Jugador(String nombre, LocalDate fechaRegistro, List<Integer> partidas) {

		this.nombre = nombre;
		this.fechaRegistro = fechaRegistro;
		this.partidas = new ArrayList<>();

	}

	// Importamos los getters.
	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public List<Integer> getPartidas() {
		return partidas;
	}

	// Implementamos el método de la interfaz, mediante el que añadiremos puntos a
	// la lista de partidas.
	public void registrarResultado(int puntos) {

		System.out.println("Cuántos puntos gana por partida?");
		partidas.add(puntos);
		System.out.println("Se han guardado" + puntos + " puntos.");

	}

	public int obtenerPuntosTotales() {

		return partidas.stream().mapToInt(Integer::intValue).sum();

	}

	// Usamos un toString para mostrar la información sobre el jugador.
	public String toString() {
		return "Jugador{\" +\r\n" + "                \"nombre='\" + nombre + '\\'' +\r\n"
				+ "                \", fechaRegistro=\" + fechaRegistro +\r\n"
				+ "                \", puntos totales=\" + obtenerPuntosTotales() +\r\n" + "                '}'";
	}
}
