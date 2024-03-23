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
		Programador p1 = new Programador("Hugo", 25, "111", "Java", 2500);
		vista.mostrarInfo(p1.toString());
		vista.mostrarInfo("Salario= " + p1.getSalario());
		vista.mostrarInfo("Bonificacion= " + p1.calcularBonificacion());
		vista.mostrarInfo("____________________________________________________________");
		vista.mostrarInfo("Programador");
		Programador p2 = new Programador("Paco", 29, "999", "C#", 1200);
		vista.mostrarInfo(p2.toString());
		vista.mostrarInfo("Salario= " + p2.getSalario());
		vista.mostrarInfo("Bonificacion= " + p2.calcularBonificacion());
		vista.mostrarInfo("____________________________________________________________");
		vista.mostrarInfo("Programador");
		Programador p3 = new Programador("Luis", 21, "555", "Python", 800);
		vista.mostrarInfo(p3.toString());
		vista.mostrarInfo("Salario= " + p3.getSalario());
		vista.mostrarInfo("Bonificacion= " + p3.calcularBonificacion());
		vista.mostrarInfo("____________________________________________________________");
		/*
		vista.mostrarInfo("Consultor");
		Consultor c1 = new Consultor();
		vista.mostrarInfo(c1.toString());
		aumentarSalario(c1);
		vista.mostrarInfo(c1.toString());
		vista.mostrarInfo("____________________________________________________________");
		vista.mostrarInfo("Directivo");
		Directivo d1 = new Directivo();
		vista.mostrarInfo(d1.toString());
		aumentarSalario(d1);
		vista.mostrarInfo(d1.toString());
		*/
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
