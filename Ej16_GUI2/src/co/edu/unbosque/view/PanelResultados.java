package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{

	private JTextArea resultados;
	
	public PanelResultados() {
		setBackground(new Color(99, 239, 173));
		setLayout(new BorderLayout());
		setBorder(new TitledBorder("Panel de resultados"));
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		resultados = new JTextArea();
		resultados.setEditable(false);
		
		JScrollPane pScroll = new JScrollPane(
				resultados,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED				
				);
		
		add(pScroll, BorderLayout.CENTER);
	}

	public JTextArea getResultados() {
		return resultados;
	}

	public void setResultados(JTextArea resultados) {
		this.resultados = resultados;
	}

	
	
	
}
