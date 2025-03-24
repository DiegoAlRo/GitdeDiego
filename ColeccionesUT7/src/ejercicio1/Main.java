package ejercicio1;

import java.time.LocalDate;

// Creamos la clase main que implementará los métodos de otras clases.
public class Main {
	public static void main(String[] args) {

		// Crearemos un evento y lo rellenaremos con sus datos.
		Evento evento = new Evento("Concierto", LocalDate.of(2025, 3, 25), 100);

		// Usaremos el try and catch para provar las excepciones.
		try {
			// Reservaremos un evento para Juan.
			evento.reservar("Juan", 50);

			// Le indicaremos que la reserva ha tenido exito.
			System.out.println("Reserva exitosa.");

			// En caso de capturar la excepción, mostrará lo siguiente.
		} catch (EventoException e) {
			System.out.println("Error al reservar: " + e.getMessage());
		}

		try {

			// Cancelaremos un evento de Pedro.
			evento.cancelarReserva("Pedro");
		} catch (EventoException e) {
			System.out.println("Error al cancelar la reserva: " + e.getMessage());
		}

		System.out.println("Plazas disponibles: " + evento.plazasDisponibles());
	}
}
