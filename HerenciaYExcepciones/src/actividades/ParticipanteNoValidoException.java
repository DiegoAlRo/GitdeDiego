package actividades;

//Creamos una escepción para el caso en el que un participante no sea válido.
public class ParticipanteNoValidoException extends Exception {
	public ParticipanteNoValidoException(String message) {
		super(message);
	}
}
