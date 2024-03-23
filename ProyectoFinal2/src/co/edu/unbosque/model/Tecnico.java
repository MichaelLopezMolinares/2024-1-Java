package co.edu.unbosque.model;
/**
 * {@summary} Esta clase es heredera de la clase SalarioFijo. 
 */
public class Tecnico extends SalarioFijo {
	private int edad;
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
	 * @param edad Edad que tiene un Tecnico de la empresa
	 */
	public Tecnico (int cedula, String nombres, String apellidos,char genero, String fechaNacimiento,  long telefono, String correo, String direccion, int añoIngreso, int edad) {
		super(cedula, nombres, apellidos, genero, fechaNacimiento, telefono, correo, direccion, añoIngreso);
		this.edad = edad;
	}

	/**
	 * Calcula el bono añadido al sueldo base de un Tecnico usando como base sus años laborando y su edad. 
	 * Hay un bono independiente para los años laborando y otro para su edad.
	 * Años Laborando: 
	 * 		2 a 3: bono adicional de 3% de su sueldo base
	 * 		4 a 7: bono adicional de 6% de su sueldo base
	 * 		8 a 15: bono adicional de 9% de su sueldo base
	 * 		Mas de 15: bono adicional de 15% de su sueldo base
	 * 
	 * edad:
	 * 		Menos o igual a 40: bono adicional de 2% de su sueldo base
	 * 		Mas de 40: bono adicional de 4% de su sueldo base
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
		
		if (edad > 40) {
			bono = bono + ((salario * 4) /100);
		} else {
			bono = bono + ((salario * 2) /100);
		}
		salario += bono;
	}

}
