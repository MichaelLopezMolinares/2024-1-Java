package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Poema;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller  implements ActionListener{
		
	private VentanaPrincipal vista;
	private Poema poema;
	
	public Controller() {
		vista= new VentanaPrincipal();
		poema = new Poema();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		vista.getPanel_botones().getBoton_borrar().addActionListener(this);
		vista.getPanel_botones().getBoton_escribir().addActionListener(this);
		vista.getPanel_botones().getBoton_ver().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		
		if(comando.equals("VER")) {
			String texto = poema.leerPoema();
			vista.getPanel_archivo().getArea_texto().setText(texto);
		}else if(comando.equals("ESCRIBIR")) {
			String texto = "";
			String frase = vista.getPanel_botones().getCampo_frase().getText();
			if(poema.getTexto()!=null) {
				texto = poema.actualizarPoema(poema.getTexto()+ "\n" +frase);
			}else {
				texto = poema.actualizarPoema(frase);
			}
			vista.getPanel_archivo().getArea_texto().setText(texto);
		}else if (comando.equals("BORRAR")) {
			vista.getPanel_archivo().getArea_texto().setText("");
		}
	}
}
