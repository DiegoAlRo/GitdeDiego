package ejercicio1;

// Definimos la excepción para la creación de eventos.
public class EventoException extends RuntimeException {
	public EventoException(String mensaje) {
		super(mensaje);
	}
}
