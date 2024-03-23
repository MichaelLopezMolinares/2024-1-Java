package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	
	private PanelOpciones panelOpciones;
	private PanelAccion panelAccion;
	private PanelTexto panelTexto;
	
	public VentanaPrincipal() {
		setTitle("Veterinaria");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setSize(500,440);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.white);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);

	}
	
	public void inicializarComponentes () {
		panelOpciones = new PanelOpciones();
		panelOpciones.setBounds(0, 0, 260, 240);
		getContentPane().add(panelOpciones);
		
		panelAccion = new PanelAccion();
		panelAccion.setBounds(0, 230, 260, 175);
		getContentPane().add(panelAccion);
		
		panelTexto = new PanelTexto();
		panelTexto.setBounds(260, 0, 240, 401);
		getContentPane().add(panelTexto);
	}

	public PanelOpciones getPanelOpciones() {
		return panelOpciones;
	}

	public void setPanelOpciones(PanelOpciones panelOpciones) {
		this.panelOpciones = panelOpciones;
	}

	public PanelAccion getPanelAccion() {
		return panelAccion;
	}

	public void setPanelAccion(PanelAccion panelAccion) {
		this.panelAccion = panelAccion;
	}

	public PanelTexto getPanelTexto() {
		return panelTexto;
	}

	public void setPanelTexto(PanelTexto panelTexto) {
		this.panelTexto = panelTexto;
	}
	
	
}