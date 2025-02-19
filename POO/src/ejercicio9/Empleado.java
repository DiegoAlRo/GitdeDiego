package ejercicio9;

// Creamos la clase.
public class Empleado {

	private String nombre;
	private int salario;
	private Direccion direccion;

	// Diseñamos su constructor e iniciamos sus atributos.
	public Empleado(String nombre, int salario, Direccion direccion) {

		this.nombre = nombre;
		this.salario = salario;
		this.direccion = direccion;

	}

	// Importamos los getters y setters.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	// Creamos un método que se encargará de mostrar los datos.
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Salario: " + salario);
		System.out.println("Dirección:");
		System.out.println("    Calle: " + direccion.getCalle());
		System.out.println("    Número: " + direccion.getNum());
		System.out.println("    Piso: " + direccion.getPiso());
		System.out.println("    Ciudad: " + direccion.getCiudad());
	}
}
