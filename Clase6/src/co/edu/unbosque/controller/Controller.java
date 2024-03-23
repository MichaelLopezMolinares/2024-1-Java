package co.edu.unbosque.controller;

import co.edu.unbosque.model.Veterinaria;
import co.edu.unbosque.view.VistaConsola;
import co.edu.unbosque.view.VistaVentanasEmergentes;

public class Controller {

	private VistaConsola vista;
	//private VistaVentanasEmergentes vista;
	
	public Controller() {
		vista = new VistaConsola();
		//vista = new VistaVentanasEmergentes();
		funcionar();
	}
	
	public void funcionar() {
		 Veterinaria x = new Veterinaria();
		 
		 vista.mostrarInfo(x.verDatos());
		
		 capturarArreglo(x);

		 vista.mostrarInfo(x.verDatos());

		 vista.mostrarInfo("La mascota mas vieja es  " + x.mascotaMayor());

		 
	}
	
	public void capturarArreglo(Veterinaria a) {
		
		int cantidad = vista.leerDatoEntero("Digite cantidad a ingresar: ");
		for (int i = 0; i < cantidad; i++) {
			String n = vista.leerDatoTexto("Digite nombre de la POS ["+i+"]: ");
			int e = vista.leerDatoEntero("Digite edad de la POS ["+i+"]: ");
			String t = vista.leerDatoTexto("Digite tipo de la POS ["+i+"]: ");
			a.asignarValor(n, e, t, i);
		}
		 
	}

}
