package co.edu.unbosque.model;

public abstract class Empleado {
	
	protected String nombre;
	protected int edad;
	protected String cedula;
	protected long salario;
	
	public Empleado() {
		nombre = "";
		edad = 0;
		cedula = "";
	}

	public Empleado(String nombre, int edad, String cedula) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.cedula = cedula;
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
	
	public abstract long calcularBonificacion();

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", Edad=" + edad + ", Cedula=" + cedula + ", Salario=" + salario ;
	}

}
