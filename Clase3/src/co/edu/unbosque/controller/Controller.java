package co.edu.unbosque.controller;

import java.util.Random;

import co.edu.unbosque.model.Datos;
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
		 Datos x = new Datos();
		 Datos y = new Datos(5);
		 
		 vista.mostrarInfo(x.verDatos());
		 vista.mostrarInfo(y.verDatos());
		 
		 capturarArreglo(x);
		 capturarArreglo(y);
		 
		 vista.mostrarInfo(x.verDatos());
		 vista.mostrarInfo(y.verDatos());
		 
		 vista.mostrarInfo("El numero mayor de X es " + x.numeroMayor());
		 vista.mostrarInfo("El numero mayor de Y es " + y.numeroMayor());
	}
	
	public void capturarArreglo(Datos a) {
		 int opcion = vista.leerDatoEntero("Seleccionar la forma de llenar el arreglo:\n1. Manual\n2. Aleatoria\n\nDigite opcion: ");
		 if(opcion == 1) {
			 for (int i = 0; i < a.getTam(); i++) {
				int valor = vista.leerDatoEntero("Digite valor de la POS ["+i+"]: ");
				a.asignarValor(valor, i);
			}
		 }else if(opcion == 2) {
			 Random rnd = new Random();
			 for (int i = 0; i < a.getTam(); i++) {
					int valor = rnd.nextInt(100);
					a.asignarValor(valor, i);
				}
		 }
	}

}
