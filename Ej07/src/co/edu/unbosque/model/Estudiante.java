package co.edu.unbosque.model;

public class Estudiante {

	private String nombre;
	private int edad;
	private String carrera;
	
	public Estudiante() {
		nombre = "";
		carrera = "";
		edad = 0;
	}

	public Estudiante(String nombre, String carrera, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.carrera = carrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera ;
	}
	
	
}
