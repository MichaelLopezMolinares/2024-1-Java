package co.edu.unbosque.controller;

import co.edu.unbosque.model.Consultor;
import co.edu.unbosque.model.Directivo;
import co.edu.unbosque.model.Empleado;
import co.edu.unbosque.model.Programador;
import co.edu.unbosque.view.VistaConsola;
import co.edu.unbosque.view.VistaVentanasEmergentes;

public class Controller {

	private VistaConsola vista;
	//private VistaVentanasEmergentes vista;
	
	public Controller() {
		vista = new VistaConsola();
		//vista = new VistaVentanasEmergentes();
		run();
	}
	
	public void run() {
		vista.mostrarInfo("____________________________________________________________");
		vista.mostrarInfo("Programador");
		Programador p1 = new Programador();
		p1.setSalario(100);
		vista.mostrarInfo(p1.toString());
		aumentarSalario(p1);
		vista.mostrarInfo(p1.toString());
		vista.mostrarInfo("____________________________________________________________");
		vista.mostrarInfo("Consultor");
		Consultor c1 = new Consultor();
		c1.setSalario(100);
		vista.mostrarInfo(c1.toString());
		aumentarSalario(c1);
		vista.mostrarInfo(c1.toString());
		vista.mostrarInfo("____________________________________________________________");
		vista.mostrarInfo("Directivo");
		Directivo d1 = new Directivo();
		d1.setSalario(100);
		vista.mostrarInfo(d1.toString());
		aumentarSalario(d1);
		vista.mostrarInfo(d1.toString());
		
	}
	
	public void aumentarSalario(Empleado x) {
		long nvoSalario = 0;
		if(x instanceof Programador) {
			nvoSalario = x.getSalario() + (x.getSalario() * 25)/100;
			x.setSalario(nvoSalario);
		}else if(x instanceof Consultor) {
			nvoSalario = x.getSalario() + (x.getSalario() * 30)/100;
			x.setSalario(nvoSalario);
		}else if(x instanceof Directivo) {
			nvoSalario = x.getSalario() + (x.getSalario() * 35)/100;
			x.setSalario(nvoSalario);
		}
	}
	
		 

}
