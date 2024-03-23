package co.edu.unbosque.controller;

import co.edu.unbosque.model.Arreglo;
import co.edu.unbosque.view.VistaConsola;

public class Controller {

	private VistaConsola vista;
	
	public Controller() {
		vista = new VistaConsola();
	}
	
	public void run() {
		Arreglo x = new Arreglo();
		vista.mostrarMensaje(x.verDatos());
		
		x.actualizarNumero("num4", 100);
		x.cargarDatos();
		vista.mostrarMensaje(x.verDatos());
	}
}
