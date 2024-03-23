package co.edu.unbosque.controller;

import co.edu.unbosque.model.mascota;
import co.edu.unbosque.view.VistaConsola;
import co.edu.unbosque.view.VistaVentanasEmergentes;

public class Controller {
	private mascota x;
	//private VistaConsola vista;
	private VistaVentanasEmergentes vista;
	public Controller() {
		//vista = new VistaConsola();
		vista = new VistaVentanasEmergentes();
		funcionar();
		
	}
	public void funcionar() {
		x = new mascota("Max", "Perro", 4);
		vista.mostrarInfo(x.toString());
		String aux1 = vista.leerDatoTexto("Ingrese nombre mascota: ");
		String aux2 = vista.leerDatoTexto("Ingrese tipo mascota: ");
		int aux3 = vista.leerDatoEntero("Ingrese edad mascota: ");
		
		x = new mascota(aux1,aux2,aux3);
		vista.mostrarInfo(x.toString());
	}

}
