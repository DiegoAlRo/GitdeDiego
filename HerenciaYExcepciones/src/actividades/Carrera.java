package actividades;

import java.time.LocalDate;
import java.util.ArrayList;

// Creamos una clase carrera que hereda de evento deportivo.
public class Carrera extends EventoDeportivo {
	private double distancia;

	// Creamos el constructor e iniciamos los atributos.
	public Carrera(String nombre, LocalDate fecha, String lugar, double distancia) {
		super(nombre, fecha, lugar);
		this.distancia = distancia;
	}

	// Generamos los getters y setters.
	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	// Ceamos un override que devuleva el participante con menor tiempo registrado.
	@Override
	public Participante obtenerGanador() {
		Participante ganador = null;
		double menorTiempo = Double.MAX_VALUE;
		for (Participante p : getParticipantes()) {
			if (p.getTiempo() < menorTiempo) {
				menorTiempo = p.getTiempo();
				ganador = p;
			}
		}
		return ganador;
	}
}
