package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

	private PanelDatos pdatos;
	private PanelResultados presultados;
	
	public VentanaPrincipal() {
		setTitle("Mi primer calculadores GUI");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.red);
		getContentPane().setLayout(null);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		pdatos = new PanelDatos();
		pdatos.setBounds(20, 20, 545, 250);
		getContentPane().add(pdatos);
		
		presultados = new PanelResultados();
		presultados.setBounds(20, 285, 545, 160);
		getContentPane().add(presultados);
	}

	public PanelDatos getPdatos() {
		return pdatos;
	}

	public void setPdatos(PanelDatos pdatos) {
		this.pdatos = pdatos;
	}

	public PanelResultados getPresultados() {
		return presultados;
	}

	public void setPresultados(PanelResultados presultados) {
		this.presultados = presultados;
	}
	
}
