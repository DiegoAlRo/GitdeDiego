package ejercicio5;

public class Empleado {

	private String NIF;
	private double sueldoBase;
	private double pagoHExtra;
	private int pagoHExtraMes;
	private double porcentajeIRPF;
	private boolean casado;
	private int numHijos;

	public Empleado(String NIF, double sueldoBase, double pagoHExtra, int pagoHExtraMes, double porcentajeIRPF,
			boolean casado, int numHijos) {

		this.NIF = NIF;
		this.sueldoBase = sueldoBase;
		this.pagoHExtra = pagoHExtra;
		this.pagoHExtraMes = pagoHExtraMes;
		this.porcentajeIRPF = porcentajeIRPF;
		this.casado = casado;
		this.numHijos = numHijos;

	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getPagoHExtra() {
		return pagoHExtra;
	}

	public void setPagoHExtra(double pagoHExtra) {
		this.pagoHExtra = pagoHExtra;
	}

	public int getPagoHExtraMes() {
		return pagoHExtraMes;
	}

	public void setPagoHExtraMes(int pagoHExtraMes) {
		this.pagoHExtraMes = pagoHExtraMes;
	}

	public double getPorcentajeIRPF() {
		return porcentajeIRPF;
	}

	public void setPorcentajeIRPF(double porcentajeIRPF) {
		this.porcentajeIRPF = porcentajeIRPF;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	public double calcularHorasExtra() {
		return pagoHExtra * pagoHExtraMes;

	}

	public double calcularSalarioBruto() {
		return sueldoBase + calcularHorasExtra();

	}

	public double calcularRetencionesIRPF() {
		double porcentaje = porcentajeIRPF;
		if (casado) {
			porcentaje -= 2;
		}
		porcentaje -= numHijos;
		if (porcentaje < 0) {
			porcentaje = 0;
		}
		return calcularSalarioBruto() * (porcentaje / 100);

	}

	public void println() {
		System.out.println("Empleado: " + NIF);
		System.out.println("Salario base: " + sueldoBase);
	}

	public void printAll() {
		System.out.println("Empleado: " + NIF);
		System.out.println("Salario base: " + sueldoBase);
		System.out.println("Complemento por horas extra: " + calcularHorasExtra());
		System.out.println("Salario bruto: " + calcularSalarioBruto());
		System.out.println("Retenciones IRPF: " + calcularRetencionesIRPF());
		System.out.println("Salario neto: " + (calcularSalarioBruto() - calcularRetencionesIRPF()));
	}

	public Empleado copia() {
		return new Empleado(NIF, sueldoBase, pagoHExtra, pagoHExtraMes, porcentajeIRPF, casado, numHijos);
	}
}
