package co.edu.unbosque.controller;

import java.util.Random;

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
		 Veterinaria y = new Veterinaria(3);
		 
		 vista.mostrarInfo(x.verDatos());
		 //vista.mostrarInfo(y.verDatos());
		
		 capturarArreglo(x);
		 //capturarArreglo(y);
		 
		 vista.mostrarInfo(x.verDatos());
		 //vista.mostrarInfo(y.verDatos());
		 
		 
		 vista.mostrarInfo("La mascota mas vieja es  " + x.mascotaMayor());
		 //vista.mostrarInfo("El numero mayor de Y es " + y.numeroMayor());
		 
	}
	
	public void capturarArreglo(Veterinaria a) {
		for (int i = 0; i < a.getTam(); i++) {
			String n = vista.leerDatoTexto("Digite nombre de la POS ["+i+"]: ");
			int e = vista.leerDatoEntero("Digite edad de la POS ["+i+"]: ");
			String t = vista.leerDatoTexto("Digite tipo de la POS ["+i+"]: ");
			a.asignarValor(n, e, t, i);
		}
		 
	}

}
