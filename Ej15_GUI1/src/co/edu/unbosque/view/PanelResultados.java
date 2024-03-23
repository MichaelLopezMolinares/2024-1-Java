package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{

	private JLabel rta;
	
	public PanelResultados() {
		setBackground(Color.CYAN);
		setLayout(null);
		setBorder(new TitledBorder("Panel de resultados"));
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		rta = new JLabel();
		rta.setBounds(125, 75, 300, 20);
		add(rta);
	}

	public JLabel getRta() {
		return rta;
	}

	public void setRta(JLabel rta) {
		this.rta = rta;
	}
	
}
