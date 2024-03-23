package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelTexto extends JPanel{

	private JTextArea resultados;
	
	public PanelTexto() {
		setBackground(new Color(99, 239, 173));
		setLayout(null);
		setBorder(null);
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		resultados = new JTextArea();
		
		resultados.setEditable(false);
		JScrollPane scroll = new JScrollPane(
				resultados,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED		
				);
		scroll.setBounds(5, 5, 215, 310);

		add(scroll);
		
	}

	public JTextArea getResultados() {
		return resultados;
	}

	public void setResultados(JTextArea resultados) {
		this.resultados = resultados;
	}
	
	
	
	
}
