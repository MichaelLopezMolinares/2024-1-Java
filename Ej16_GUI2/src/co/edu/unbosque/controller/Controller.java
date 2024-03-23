package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{

	private VentanaPrincipal vista;
	
	public Controller() {
		vista = new VentanaPrincipal();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		vista.getPdatos().getBsumar().addActionListener(this);
		vista.getPdatos().getBrestar().addActionListener(this);
		vista.getPdatos().getBmultiplicar().addActionListener(this);
		vista.getPdatos().getBdividir().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		
		if (comando.equals("SUMAR")) {
			operacionSumar();
		}else if (comando.equals("RESTAR")) {
			operacionRestar();
		}
		
	}
	
	public void operacionSumar() {
		double aux = 0.0;
		Numero a = new Numero();
		Numero b = new Numero();
		
		String texto = "";
		
		texto = vista.getPdatos().getC_num1().getText();
		aux = Double.parseDouble(texto);
		a.setNum(aux);
		
		texto = vista.getPdatos().getC_num2().getText();
		aux = Double.parseDouble(texto);
		b.setNum(aux);
		
		vista.getPresultados().getResultados().setText(a.getNum() + " + "+ b.getNum() + " = " + a.sumar(b) );
	}
	
	public void operacionRestar() {
		double aux = 0.0;
		Numero a = new Numero();
		Numero b = new Numero();
		
		String texto = "";
		
		texto = vista.getPdatos().getC_num1().getText();
		aux = Double.parseDouble(texto);
		a.setNum(aux);
		
		texto = vista.getPdatos().getC_num2().getText();
		aux = Double.parseDouble(texto);
		b.setNum(aux);
		
		if(a.getNum() > b.getNum()) {
			vista.getPresultados().getResultados().setText(a.getNum() + " + "+ b.getNum() + " = " + a.sumar(b) );
		}else {
			vista.getPresultados().getResultados().setText(b.getNum() + " - "+ a.getNum() + " = " + a.sumar(b) );
		}
	}
		
}
