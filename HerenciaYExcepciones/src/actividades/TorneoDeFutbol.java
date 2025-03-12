package actividades;

import java.time.LocalDate;
import java.util.ArrayList;

// Creamos la clase torneo que extiende a evento deportivo.
public class TorneoDeFutbol extends EventoDeportivo {
	private ArrayList<Equipo> equipos;

	public TorneoDeFutbol(String nombre, LocalDate fecha, String lugar) {
		super(nombre, fecha, lugar);
		this.equipos = new ArrayList<>();
	}

	// Generamos los getters y setters.
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	// Creamos un método para añadir más equipos.
	public void inscribirEquipo(Equipo equipo) {
		equipos.add(equipo);
	}

	// Creamos un método para devolver el jugador con más puntos acumulados del
	// equipo.
	@Override
	public Participante obtenerGanador() {
		Equipo ganador = null;
		int maxPuntos = 0;

		for (Equipo equipo : equipos) {
			if (equipo.getPuntos() > maxPuntos) {
				maxPuntos = equipo.getPuntos();
				ganador = equipo;
			}
		}

		return ganador != null ? ganador.getJugadores().get(0) : null;
	}
}
