package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
/**
* {@summary} La clase PanelMostrar sirve como un JPanel para alojar la lista de los equipos del campeonato
*/
public class PanelMostrar extends JPanel{
	
	private JTextArea mostrar;
	/**
	* Este es un constructor sin parametros de la clase PanelMostrar. carga los elementos a usar dentro del JPanel
	* 
	*/
	public PanelMostrar() {
		
		setLayout(null);
		
		inicializarComponentes();
		
		setBorder(new TitledBorder("Equipos guardados"));
	}
	/**
	* Inicializa los componentes y los anade
	* 
	*/
	public void inicializarComponentes() {
		mostrar = new JTextArea();
		mostrar.setEditable(false);
		mostrar.setBounds(-50, 25, 400, 300);
		JScrollPane panel = new JScrollPane(mostrar);
		panel.setBounds(20, 25, 400, 300);
		add(panel);
	}

	public JTextArea getMostrar() {
		return mostrar;
	}

	public void setMostrar(JTextArea mostrar) {
		this.mostrar = mostrar;
	}
	
}
