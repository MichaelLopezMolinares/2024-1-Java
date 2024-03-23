package co.edu.unbosque.model;

public class Programador extends Empleado{

	private String lenguaje;
	private int numLineasCodigoHora;
	
	public Programador() {
		super();
		lenguaje = "";
		numLineasCodigoHora = 0;
	}

	public Programador(String nombre, int edad, String cedula, long salario, String lenguaje, int numLineasCodigoHora) {
		super(nombre, edad, cedula, salario);
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
	
	
	
	
}
