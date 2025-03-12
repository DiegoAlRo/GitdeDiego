package actividades;

// Creamos una escepción para el caso en el que no se encuentre a un jugador.
public class JugadorNoEncontradoException extends Exception {
	public JugadorNoEncontradoException(String message) {
		super(message);
	}
}
