package ejercicio1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

// Creamos el objeto evento.
public class Evento implements Reservable {

	private String Nombre;
	private LocalDate Fecha;
	private int Capacidad;
	private Map<String, Integer> Reservas;

	// Definimos su constructor e iniciamos sus atributos.
	public Evento(String Nombre, LocalDate Fecha, int Capacidad) {
		this.Nombre = Nombre;
		this.Fecha = Fecha;
		this.Capacidad = Capacidad;
		this.Reservas = new HashMap<>();

	}

	// Generamos los getters.
	public String getNombre() {
		return Nombre;
	}

	public LocalDate getFecha() {
		return Fecha;
	}

	public int getCapacidad() {
		return Capacidad;
	}

	public Map<String, Integer> getReservas() {
		return Reservas;
	}

	// Creamos el método de la interfaz.
	public boolean reservar(String usuario, int cantidad) {

		// le imponemos una condición para que no se puedan añadir 0 o menos.
		if (cantidad <= 0) {
			throw new EventoException("La cantidad debe ser mayor a 0.");
		}

		// En caso de haber suficientes plazas disponibles, se añadirán usuarios.
		if (plazasDisponibles() >= cantidad) {
			Reservas.put(usuario, Reservas.getOrDefault(usuario, 0) + cantidad);
			return true;
		}

		// De no haber se lanzará una excepción.
		throw new EventoException("No hay suficientes plazas disponibles.");

	}

	// Creamos otro método de la interfaz para cancelar reservas.
	public boolean cancelarReserva(String usuario) {

		if (Reservas.containsKey(usuario)) {
			Reservas.remove(usuario);
			return true;
		}

		// Si no hay una reserva para un usuario, se lanzará una excepción.
		throw new EventoException("No existe reserva para el usuario: " + usuario);

	}

	// Creamos otro método de la interfaz.
	public int plazasDisponibles() {
		return Capacidad - Reservas.values().stream().mapToInt(Integer::intValue).sum();
	}
}
