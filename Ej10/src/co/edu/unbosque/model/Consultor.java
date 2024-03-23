package co.edu.unbosque.model;

public class Consultor extends Empleado{

	private int experiencia;
	private int lider;
	
	public Consultor() {
		super();
		salario = 3000000;
		experiencia = 0;
		lider = 0;
	}

	public Consultor(String nombre, int edad, String cedula, int experiencia, int lider) {
		super(nombre, edad, cedula);
		this.salario = 3000000;
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

	@Override
	public long calcularBonificacion() {
		long bonificacion = 0; 
		if(lider > 5 && lider <= 10) {
			bonificacion = (salario * 25) / 100;
		}else if(lider > 10) {
			bonificacion = (salario * 50) / 100;
		}
		return bonificacion;
	}

}
