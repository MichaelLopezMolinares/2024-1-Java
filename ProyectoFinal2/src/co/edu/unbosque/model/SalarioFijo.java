package co.edu.unbosque.model;
/**
 * {@summary} La clase SalarioFijo es heredera de la clase Personal y a la vez padres de las clases IngenieroJunior, IngenieroSenior y Tecnico. 
 */
public abstract class SalarioFijo extends Personal {
 
/**
 * 
 * Este es un constructor con parametros para la clase SalarioFijo. Usa el constructor de su clase base y define un salario base para sus herederos
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
public SalarioFijo(int cedula, String nombres, String apellidos,char genero, String fechaNacimiento,  long telefono, String correo, String direccion, int añoIngreso) {
	super(cedula, nombres, apellidos, genero, fechaNacimiento, telefono, correo, direccion, añoIngreso);
	super.salario =3000000;
}

/**
 * calcula la cantidad de años que lleva un empleado de salario fijo dentro de la empresa. Resta el año actual con su año de ingreso con  para obtener su resultado.
 * @return int 
 */
protected int calcularAñosLaborando() {
	int resultado = 2024 - añoIngreso;
	return resultado;
}
}

