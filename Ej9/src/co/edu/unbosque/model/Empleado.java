package co.edu.unbosque.model;

public class Empleado {
	
	protected String nombre;
	protected int edad;
	protected String cedula;
	protected long salario;
	
	public Empleado() {
		nombre = "";
		edad = 0;
		cedula = "";
		salario = 0;
	}

	public Empleado(String nombre, int edad, String cedula, long salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.cedula = cedula;
		this.salario = salario;
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public long getSalario() {
		return salario;
	}

	public void setSalario(long salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", Edad=" + edad + ", Cedula=" + cedula + ", Salario=" + salario ;
	}

}
