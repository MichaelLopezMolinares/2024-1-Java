package co.edu.unbosque.model;
/**
 * {@summary} Esta clase es heredera de la clase SalarioFijo. 
 */
public class IngenieroJunior extends SalarioFijo {
private int nivel;
/**
 * 
* Este es un constructor con parametros para la clase IngenieroJunior. 
 * @param cedula Cedula del empleado
 * @param nombres Nombres del empleado
 * @param apellidos Apellidos del empleado
 * @param genero Genero del empleado. Debe ser expresado en los caracteres M o F
 * @param fechaNacimiento Fecha de nacimiento del empleado
 * @param telefono Telefono laboral del empleado
 * @param correo Correo laboral del empleado
 * @param direccion Direccion domiciliaria del empleado
 * @param añoIngreso Año en el que el empleado ingresa a la empresa
 * @param nivel Nivel de experiencia de un Ingeniero junior. este se expresa con un valor del 1 al 3
 */
public IngenieroJunior (int cedula, String nombres, String apellidos, char genero, String fechaNacimiento,  long telefono, String correo, String direccion, int añoIngreso, int nivel) {
	super(cedula, nombres, apellidos, genero, fechaNacimiento, telefono, correo, direccion, añoIngreso);
	this.nivel = nivel;
}

/**
 * Calcula el bono añadido al sueldo base de un Ingeniero junior usando como base sus años laborando y su nivel. 
 * Hay un bono independiente para los años laborando y otro para su nivel.
 * Años Laborando: 
 * 		2 a 3: bono adicional de 3% de su sueldo base
 * 		4 a 7: bono adicional de 6% de su sueldo base
 * 		8 a 15: bono adicional de 9% de su sueldo base
 * 		Mas de 15: bono adicional de 15% de su sueldo base
 * 
 * Nivel:
 * 		Nivel 1: no recibe ningun bono
 * 		Nivel 2: bono adicional de 6% de su sueldo base
 * 		Nivel 3: bono adicional de 9% de su sueldo base
 */
public void calcularSalario() {
	int añosLaborando = super.calcularAñosLaborando();
	double bono = 0;
	if (2 <= añosLaborando && añosLaborando <= 3) {
		bono = (salario * 3) /100;
	} else if (4 <= añosLaborando && añosLaborando <= 7) {
		bono = (salario * 6) /100;
	} else if (8 <= añosLaborando && añosLaborando <= 15) {
		bono = (salario * 9) /100;
	} else if (añosLaborando > 15) {
		bono = (salario * 15) /100;
	}
	System.out.println("Años: " + añosLaborando);
	System.out.println("Bono1: " + bono);
	switch (nivel) {
	case 2:
		bono = bono + ((salario * 6) /100);
		break;
	case 3:
		bono = bono + ((salario * 9) /100);
		break;
	}
	System.out.println("nivel: " + nivel);
	System.out.println("Bono2: "+ bono);
	salario += bono;
}
}
