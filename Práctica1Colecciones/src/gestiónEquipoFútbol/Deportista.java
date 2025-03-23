package gestiónEquipoFútbol;

import java.util.List;

// Creamos la interfaz Deportista.
public interface Deportista {
// Creamos un método para devolver los años profesionales.
	int getAnyosProfesional();

// Otro para obtener los nombres del equipo.
	List<String> getListadoEquipos();

// Y un último metodo para los trofeos.
	int getTotalTrofeos();
}
