package co.edu.unbosque.model;
/**
 * {@summary} La clase personal es la clase padre para los empleados considerados dentro de este proyecto
 * 
 */
public abstract class Personal {
protected int cedula;
protected String nombres;
protected String apellidos;
protected char genero;
protected String fechaNacimiento;
protected long telefono;
protected String correo;
protected String direccion;
protected int añoIngreso;
protected long salario;

/**
 * Este es un constructor con parametros para la clase Personal. No establece un valor base para salario con el fin de que sus clases herederas lo hagan
 * @param cedula Cedula del empleado
 * @param nombres Nombres del empleado
 * @param apellidos Apellidos del empleado
 * @param genero Genero del empleado. Debe ser expresado en los caracteres M o F
 * @param fechaNacimiento Fecha de nacimiento del empleado
 * @param telefono Telefono laboral del empleado
 * @param correo Correo laboral del empleado
 * @param direccion Direccion domiciliaria del empleado
 * @param añoIngreso Año en el que el empleado ingresa a la empresa
 */
public Personal (int cedula, String nombres, String apellidos,char genero, String fechaNacimiento,  long telefono, String correo, String direccion, int añoIngreso){
	this.cedula = cedula;
	this.nombres = nombres;
	this.apellidos = apellidos;
	this.genero  = genero;
	this.fechaNacimiento =  fechaNacimiento;
	this.telefono = telefono;
	this.correo = correo;
	this.direccion = direccion;
	this.añoIngreso = añoIngreso;
}

/**
 * Expresa la informacion de un empleado textualmente 
 * @return String 
 */
public String toString() {
	return "Personal: " + "\n"
			+ "Cedula: " + cedula + "\n" +
			"Nombre: " + nombres + "\n" +
			"Apellido: " + apellidos + "\n" +
			"Género: "  + genero + "\n" +
			"Fecha de Nacimiento:" + fechaNacimiento + "\n" +
			"Telefono: " + telefono + "\n" +
			"Correo: " + correo + "\n" +
			"Direccion: " + direccion + "\n" +
			"Año de ingreso: " + añoIngreso + "\n" +
			"Salario: $" + salario;	
	}

/**
 * Este metodo se encarga de calcular el salario de un empleado teniendo en cuenta su rol y sus atributos. Es un metodo abstracto porque cada rol tiene condiciones distintas para determinar su bonificacion, ademas de que los empleados de comision tienen un salario base unico.
 */
public abstract void calcularSalario();

}

