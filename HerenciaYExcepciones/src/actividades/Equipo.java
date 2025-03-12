package actividades;

import java.util.ArrayList;

// Creamos una clase equipo.
public class Equipo {
	private String nombre;
	private ArrayList<Participante> jugadores;
	private int puntos;

	// Creamos el constructor e iniciamos sus atributos.
	public Equipo(String nombre) {
		this.nombre = nombre;
		this.jugadores = new ArrayList<>();
		this.puntos = 0;
	}

	// Generamos los getters y setters.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Participante> getJugadores() {
		return jugadores;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	// Creamos un método para añadir otro jugador como participante.
	public void añadirJugador(Participante jugador) {
		jugadores.add(jugador);
	}

	// Este método se usará para eliminar un participante, además aprovechamos para
	// implementar una excepción.
	public void eliminarJugador(Participante jugador) throws JugadorNoEncontradoException {
		if (!jugadores.remove(jugador)) {
			throw new JugadorNoEncontradoException(
					"Jugador no encontrado: " + jugador.getNombre() + " " + jugador.getApellido());
		}
	}

	// Modificamos un toString para que muestre la información del equipo.
	@Override
	public String toString() {
		return "Equipo: " + nombre + ", Puntos: " + puntos + ", Jugadores: " + jugadores.toString();
	}
}
