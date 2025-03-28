package ejercicio3;

// Creamos la interfaz Prestable, que será implementada por la clase libro.
public interface Prestable {

	boolean prestar(String usuario);

	boolean devolver(String usuario);

}
