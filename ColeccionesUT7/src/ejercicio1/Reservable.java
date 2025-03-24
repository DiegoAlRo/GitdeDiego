package ejercicio1;

// Creamos una interfaz que será implementada por el objeto Evento.
public interface Reservable {

	boolean reservar(String usuario, int cantidad);

	boolean cancelarReserva(String usuario);

	int plazasDisponibles();
}
