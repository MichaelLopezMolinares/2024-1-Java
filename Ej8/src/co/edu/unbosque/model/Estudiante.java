package co.edu.unbosque.model;

public class Estudiante extends Persona{

	private String carrera;
	
	public Estudiante() {
		super();
		edad = 0;
	}

	public Estudiante(String nombre, String carrera, int edad) {
		super(nombre, edad);
		this.carrera = carrera;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	@Override
	public String toString() {
		return "Los datos son : " + super.toString() + ", carrera=" + carrera ;
	}
	
}
