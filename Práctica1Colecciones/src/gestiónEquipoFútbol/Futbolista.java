package gestiónEquipoFútbol;

import java.util.List;

// Creamos el objeto Futbolista que representará a cada futbolista mientras usa la interfaz deportista.
public class Futbolista implements Deportista {

	private String Nombre;
	private int Edad;
	private Posicion Posicion;
	private int anyosProfesional;
	private List<String> listadoEquipos;
	private int totalTrofeos;

	// Aquí definiremos sus atributos.
	public Futbolista(String Nombre, int Edad, gestiónEquipoFútbol.Posicion Posicion,
			int anyosProfesional2, List<String> listadoEquipos2, int totalTrofeos2) {

		this.Nombre = Nombre;
		this.Edad = Edad;
		this.Posicion = Posicion;
		this.anyosProfesional = anyosProfesional;
		this.listadoEquipos = listadoEquipos;
		this.totalTrofeos = totalTrofeos;

	}

	// Generaremos los getters y setters.
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public Posicion getPosicion() {
		return Posicion;
	}

	public void setPosicion(Posicion posicion) {
		Posicion = posicion;
	}

	public int getAnyosProfesional() {
		return anyosProfesional;
	}

	public List<String> getListadoEquipos() {
		return listadoEquipos;
	}

	public int getTotalTrofeos() {
		return totalTrofeos;
	}

	// Usaremos el toString para poder mostrar toda la información sobre el
	// Futbolista.
	public String toString() {
		return "Nombre de futbolista: " + Nombre + "\nEdad: " + Edad + "\nPosición: " + Posicion + "\nSalario mínimo: "
				+ Posicion.getSalarioMinimo() + "\nSalario máximo: " + Posicion.getSalarioMaximo();
	}
}
