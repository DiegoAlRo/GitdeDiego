package actividades;

import java.time.LocalDate;
import java.util.ArrayList;

// Creamos una clase para el evento deportivo.
public abstract class EventoDeportivo implements Ganador {

	private String nombre;
	private LocalDate fecha;
	private String lugar;
	private ArrayList<Participante> participantes;

	// Creamos su constructor e iniciamos sus atributos.
	public EventoDeportivo(String nombre, LocalDate fecha, String lugar) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
		this.participantes = new ArrayList<>();
	}

	// Generamos sus getters y setters.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}

	public void inscribirParticipante(Participante participante) {
		participantes.add(participante);
	}

	public abstract Participante obtenerGanador();
}
