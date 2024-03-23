package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
/**
* {@summary} La clase PanelResultado sirve como un JPanel para alojar los retornos de las operaciones del programa
* 
*/

public class PanelResultado extends JPanel {
	
	private JTextArea resultados;
	/**
	* Este es un constructor sin parametros de la clase PanelResultados. carga los elementos a usar dentro del JPanel
	* 
	*/
	public PanelResultado() {
		
		setLayout(null);
	
		inicializarComponentes();
	
		setBorder(new TitledBorder("Rta"));	
	}
	
	/**
	* Inicializa los componentes y los anade
	* 
	*/
	public void inicializarComponentes() {
		resultados = new JTextArea();
		resultados.setEditable(false);
		resultados.setBounds(-50, 25, 400, 1330);
		JScrollPane panel = new JScrollPane(resultados);
		panel.setBounds(20, 25, 400, 130);
		add(panel);
	}
	public JTextArea getResultados() {
		return resultados;
	}
	public void setResultados(JTextArea resultados) {
		this.resultados = resultados;
	}
	
	
}
