package co.edu.unbosque.model;

public class mascota {
	
	private String nombre;
	private String tipo;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public mascota(String nombre, String tipo, int edad) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "--------- " + "\n" 
				+ "Nombre=" + nombre + "\n" +
				"Tipo=" + tipo + "\n" +
				"Edad=" + edad + "\n" +
				"------------------\n";
	}
	

}
