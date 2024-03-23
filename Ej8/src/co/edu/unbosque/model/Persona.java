package co.edu.unbosque.model;

public class Persona {
	
	protected String nombre;
	protected int edad;
	
	public Persona() {
		nombre = "";
		edad = 0;
	}

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
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
	
	public final int calcularGasto() {
		int dinero = (edad * 2000000)/24;
		return dinero;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", edad=" + edad;
	}

}
