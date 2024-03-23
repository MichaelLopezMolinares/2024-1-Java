package co.edu.unbosque.model;

public class Directivo extends Empleado{

	private String area;
	private int experiencia;
	
	public Directivo() {
		super();
		area = "";
		experiencia = 0;
	}

	public Directivo(String nombre, int edad, String cedula, long salario, String area, int experiencia) {
		super(nombre, edad, cedula, salario);
		this.area = area;
		this.experiencia = experiencia;
	}

	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return super.toString() + ", Area=" + area + ", Experiencia=" + experiencia;
	}
	
	
	
	
}
