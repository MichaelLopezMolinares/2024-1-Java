package co.edu.unbosque.model;

public class Programador extends Empleado{

	private String lenguaje;
	private int numLineasCodigoHora;
	
	public Programador() {
		super();
		salario = 1500000;
		lenguaje = "";
		numLineasCodigoHora = 0;
	}

	public Programador(String nombre, int edad, String cedula, String lenguaje, int numLineasCodigoHora) {
		super(nombre, edad, cedula);
		salario = 1500000;
		this.lenguaje = lenguaje;
		this.numLineasCodigoHora = numLineasCodigoHora;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public int getNumLineasCodigoHora() {
		return numLineasCodigoHora;
	}

	public void setNumLineasCodigoHora(int numLineasCodigoHora) {
		this.numLineasCodigoHora = numLineasCodigoHora;
	}

	@Override
	public String toString() {
		return super.toString() + ", Lenguaje=" + lenguaje + ", Num Lineas Codigo Hora=" + numLineasCodigoHora;
	}

	@Override
	public long calcularBonificacion() {
		long bonificacion = 0; 
		if(numLineasCodigoHora >= 1000 && numLineasCodigoHora < 2000) {
			bonificacion = (salario * 20) / 100;
		}else if(numLineasCodigoHora >= 2000) {
			bonificacion = (salario * 40) / 100;
		}
		return bonificacion;
	}
	
}
