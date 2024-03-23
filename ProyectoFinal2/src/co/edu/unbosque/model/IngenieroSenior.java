package co.edu.unbosque.model;
/**
 * {@summary} Esta clase es heredera de la clase SalarioFijo. 
 */
public class IngenieroSenior extends SalarioFijo {
	private int ventasRealizadas;
	
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
	 * @param ventasRealizadas Cantidad de ventas que ha realizado un Ingeniero senior desde su entrada a la empresa
	 */
	public IngenieroSenior (int cedula, String nombres, String apellidos,char genero, String fechaNacimiento,  long telefono, String correo, String direccion, int añoIngreso, int ventasRealizadas) {
		super(cedula, nombres, apellidos, genero, fechaNacimiento, telefono, correo, direccion, añoIngreso);
		this.ventasRealizadas = ventasRealizadas;
	}

	/**
	 * Calcula el bono añadido al sueldo base de un Ingeniero senior usando como base sus años laborando y sus ventas realizadas. 
	 * Hay un bono independiente para los años laborando y otro para sus ventas realizadas.
	 * Años Laborando: 
	 * 		2 a 3: bono adicional de 3% de su sueldo base
	 * 		4 a 7: bono adicional de 6% de su sueldo base
	 * 		8 a 15: bono adicional de 9% de su sueldo base
	 * 		Mas de 15: bono adicional de 15% de su sueldo base
	 * 
	 * Ventas realizadas:
	 * 		1 a 4: bono adicional de 10% de su sueldo base
	 * 		5 a 8: bono adicional de 15% de su sueldo base
	 * 		9 a 12: bono adicional de 20% de su sueldo base
	 * 		Mas de 12: bono adicional de 25% de su sueldo base
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
		
		if (1<= ventasRealizadas && ventasRealizadas <= 4) {
			bono = bono + ((salario * 10) /100);
		} else if (5<= ventasRealizadas && ventasRealizadas <= 8) {
			bono = bono + ((salario * 15) /100);
		} else if (9 <= ventasRealizadas && ventasRealizadas <= 12) {
			bono = bono + ((salario * 20) /100);
		} else if (ventasRealizadas > 12) {
			bono = bono + ((salario * 25) /100);
		}
		System.out.println("ventas: " + ventasRealizadas);
		System.out.println("Bono2: "+ bono);
		salario += bono;
	}

}
