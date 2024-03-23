package co.edu.unbosque.model;

public class Directivo extends Empleado{

	private String area;
	private int experiencia;
	
	public Directivo() {
		super();
		salario = 5000000;
		area = "";
		experiencia = 0;
	}

	public Directivo(String nombre, int edad, String cedula, String area, int experiencia) {
		super(nombre, edad, cedula);
		this.salario = 5000000;
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

	@Override
	public long calcularBonificacion() {
		long bonificacion = 0; 
		if(experiencia >= 8 && experiencia <= 12) {
			bonificacion = (salario * 30) / 100;
		}else if(experiencia > 12) {
			bonificacion = (salario * 50) / 100;
		}
		return bonificacion;
	}
	
	
	
	
}
