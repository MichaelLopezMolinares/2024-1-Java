package co.edu.unbosque.view;

import java.util.Scanner;

public class VistaConsola {

	private Scanner sc;
	
	public VistaConsola() {
		sc = new Scanner(System.in);
	}
	
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	public int leerDatosEntero(String mensaje) {
		int dato = 0;
		System.out.println(mensaje);
		dato = sc.nextInt();
		sc.nextLine();
		return dato;
	}
}
