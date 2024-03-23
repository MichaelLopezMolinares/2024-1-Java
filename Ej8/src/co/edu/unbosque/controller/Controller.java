package co.edu.unbosque.controller;

import co.edu.unbosque.model.Estudiante;
import co.edu.unbosque.model.Persona;
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
		Persona x = new Persona("Luis", 21);
		vista.mostrarInfo(x.toString());
		vista.mostrarInfo("Gasto = "+x.calcularGasto());
		vista.mostrarInfo("------------------------");
		Estudiante y = new Estudiante("Ana", "Economia" , 23);
		vista.mostrarInfo(y.toString());
		vista.mostrarInfo("Gasto = "+y.calcularGasto());
	}
		 

}
