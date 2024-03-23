package co.edu.unbosque.model;
/** 
 * {@summary} La clase Comision es heredera de la clase Personal. Tiene un salario base unico que puede variar dependiendo de su desempeño, por lo que no se incluye dentro de SalarioFijo
 */
public class Comision extends Personal{
private int clientesCaptados;
private int montoCliente;

/**
 * Este es un constructor con parametros para la clase Comision. Usa el constructor de su clase base y define un salario base
 * @param cedula Cedula del empleado
 * @param nombres Nombres del empleado
 * @param apellidos Apellidos del empleado
 * @param genero Genero del empleado. Debe ser expresado en los caracteres M o F
 * @param fechaNacimiento Fecha de nacimiento del empleado
 * @param telefono Telefono laboral del empleado
 * @param correo Correo laboral del empleado
 * @param direccion Direccion domiciliaria del empleado
 * @param añoIngreso Año en el que el empleado ingresa a la empresa
 * @param clientesCaptados Cantidad de clientes que un empleado ha tenido 
 * @param montoCliente Valor recibido por cada Cliente
 */
public Comision (int cedula, String nombres, String apellidos, char genero, String fechaNacimiento,  long telefono, String correo, String direccion, int añoIngreso, int clientesCaptados, int montoCliente) {
	super(cedula, nombres, apellidos, genero, fechaNacimiento, telefono, correo, direccion, añoIngreso);
	super.salario = 1200000;
	this.clientesCaptados = clientesCaptados;
	this.montoCliente = montoCliente;
}
/**
 * Multiplica los clientes captados por el monto del cliente. Si el resultado es menor a su salario base se añade a su sueldo, de lo contrario solo ganara su sueldo base
 */
public void calcularSalario () {
	int resultado = clientesCaptados*montoCliente;
	if (resultado < salario) {
		salario = resultado + 1200000;
	}
}
}
