package actividades;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

		// Usamos el try and catch para comprobar las excepciones.
		try {
			// Aquí creamos los participantes.
			Participante participante1 = new Participante("Juan", "Pérez", 16, 360.0);
			Participante participante2 = new Participante("Ana", "García", 17, 350.0);

			// Aquí creamos los equipos.
			Equipo equipo1 = new Equipo("Los Ganadores");
			equipo1.añadirJugador(participante1);
			equipo1.añadirJugador(participante2);

			// Creamos los eventos deportivos.
			Carrera carrera = new Carrera("Maratón", LocalDate.now(), "Madrid", 42.195);
			carrera.inscribirParticipante(participante1);
			carrera.inscribirParticipante(participante2);

			TorneoDeFutbol torneo = new TorneoDeFutbol("Liga Regional", LocalDate.now(), "Sevilla");
			torneo.inscribirEquipo(equipo1);
			equipo1.setPuntos(10);

			// Aquí se mostrará la información junto a los ganadores.
			System.out.println("Participantes de la carrera:");
			for (Participante p : carrera.getParticipantes()) {
				System.out.println(p);
			}

			System.out.println("Equipos del torneo de fútbol:");
			for (Equipo e : torneo.getEquipos()) {
				System.out.println(e);
			}

			System.out.println("Ganador de la carrera: " + carrera.obtenerGanador());
			System.out.println("Ganador del torneo de fútbol: " + torneo.obtenerGanador());
		} catch (ParticipanteNoValidoException e) {
			System.err.println("Error: " + e.getMessage());

		}
	}
}
