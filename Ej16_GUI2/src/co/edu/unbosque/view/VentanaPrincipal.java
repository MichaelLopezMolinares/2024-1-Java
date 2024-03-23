package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

	private PanelDatos pdatos;
	private PanelResultados presultados;
	
	public VentanaPrincipal() {
		setTitle("Mi segunda calculadora GUI");
		setSize(600, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.blue);
		getContentPane().setLayout(new BorderLayout(10, 10));
		
		inicializarComponentes();
		
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		pdatos = new PanelDatos();
		getContentPane().add(pdatos, BorderLayout.WEST);
		
		presultados = new PanelResultados();
		getContentPane().add(presultados, BorderLayout.CENTER);
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
