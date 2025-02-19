package ejercicio9;

// Creamos la clase y sus atributos.
public class Direccion {

	public String calle;
	public int num;
	public int piso;
	public String ciudad;

	// Creamos su constructor e iniciamos sus argumentos.
	public Direccion(String calle, int num, int piso, String ciudad) {

		this.calle = calle;
		this.num = num;
		this.piso = piso;
		this.ciudad = ciudad;

	}

	// Importamos los getters y setters.
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

}
