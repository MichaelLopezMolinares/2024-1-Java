package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class VistaVentanasEmergentes {
	
	public VistaVentanasEmergentes() {
		
	}
	public int leerDatoEntero(String mensaje) {
		int dato = 0;
		String aux = JOptionPane.showInputDialog(mensaje);
		dato = Integer.parseInt(aux);
		return dato;
		
	}
	public String leerDatoTexto(String mensaje) {
		String dato = "";
		dato = JOptionPane.showInputDialog(mensaje);
		return dato;
		
	}
	public void mostrarInfo(String mensaje) {
		 JOptionPane.showMessageDialog(null, mensaje);
	}

}
