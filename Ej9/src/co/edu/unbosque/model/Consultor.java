package co.edu.unbosque.model;

public class Consultor extends Empleado{

	private int experiencia;
	private int lider;
	
	public Consultor() {
		super();
		experiencia = 0;
		lider = 0;
	}

	public Consultor(String nombre, int edad, String cedula, long salario, int experiencia, int lider) {
		super(nombre, edad, cedula, salario);
		this.experiencia = experiencia;
		this.lider = lider;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public int getLider() {
		return lider;
	}

	public void setLider(int lider) {
		this.lider = lider;
	}

	@Override
	public String toString() {
		return super.toString() + ", Experiencia=" + experiencia + ", Lider=" + lider + "]";
	}

}
