package co.edu.unbosque.model;

public class Mascota {
	
	private String nombre;
	private String tipo;
	
	public Mascota(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	public Mascota(String nombre) {
		this.nombre = nombre;
	}
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

	@Override
	public String toString() {
		return "Nombre= " + nombre + "\nTipo= " + tipo ;
	}
	
}
