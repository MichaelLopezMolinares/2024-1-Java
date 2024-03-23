package co.edu.unbosque.view;

import java.util.Scanner;

public class VistaConsola {
	
	private Scanner leer;
	
	public VistaConsola() {
		leer = new Scanner(System.in);
		
	}
	public int leerDatoEntero(String mensaje) {
		int dato = 0;
		System.out.println(mensaje);
		dato = leer.nextInt();
		leer.nextLine();
		return dato;
		
	}
	public String leerDatoTexto(String mensaje) {
		String dato = "";
		System.out.println(mensaje);
		dato = leer.nextLine();
		return dato;
		
	}
	public void mostrarInfo(String mensaje) {
		System.out.println(mensaje);
	}
}
