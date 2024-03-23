package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAccion extends JPanel{
	
	private JLabel enunciado1;
	private JLabel enunciado2;
	private JLabel labelNombre;
	private JLabel labelTipo;
	private JLabel labelNombreNuevo;
	private JTextField nombreMascota;
	private JTextField tipoMascota;
	private JTextField nombreNuevo;
	private JButton bActivar;

	public PanelAccion () {
		setBackground (new Color(99, 239, 173));
		setLayout(null);
		setBorder(null);
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		enunciado1 = new JLabel("Que mascota");
		enunciado1.setBounds(15, -160, 500, 380);
		enunciado1.setFont(new Font("Arial", Font.PLAIN, 20));
		add(enunciado1);
	
		enunciado2 = new JLabel("Desea agregar");
		enunciado2.setBounds(15, 20, 500, 65);
		enunciado2.setFont(new Font("Arial", Font.PLAIN, 20));
		add(enunciado2);
		
		
		labelNombre = new JLabel("Nombre");
		labelNombre.setBounds(15, -100, 500, 380);
		labelNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		add(labelNombre);
		
		labelTipo = new JLabel("Tipo");
		labelTipo.setBounds(15, -60, 500, 380);
		labelTipo.setFont(new Font("Arial", Font.PLAIN, 12));
		add(labelTipo);

		labelNombreNuevo = new JLabel("Nombre nuevo");
		labelNombreNuevo.setBounds(15, -60, 500, 380);
		labelNombreNuevo.setFont(new Font("Arial", Font.PLAIN, 12));
		labelNombreNuevo.setVisible(false);
		add(labelNombreNuevo);
		
		nombreMascota = new JTextField();
		nombreMascota.setBounds(15, 95, 100, 25);
		add(nombreMascota);
		
		tipoMascota = new JTextField();
		tipoMascota.setBounds(15, 137, 100, 25);
		add(tipoMascota);

		nombreNuevo = new JTextField();
		nombreNuevo.setBounds(15, 137, 100, 25);
		nombreNuevo.setVisible(false);
		add(nombreNuevo);
		
		bActivar = new JButton("Agregar");
		bActivar.setBounds(120, 95, 100, 25);
		bActivar.setActionCommand("ACTIVAR");
		bActivar.setBackground(new Color (13, 70, 94));
		bActivar.setForeground(Color.white);
		bActivar.setFont(new Font("Arial",Font.PLAIN, 13));
		add(bActivar);
	}

	public JLabel getLabelNombreNuevo() {
		return labelNombreNuevo;
	}

	public void setLabelNombreNuevo(JLabel labelNombreNuevo) {
		this.labelNombreNuevo = labelNombreNuevo;
	}

	public JTextField getNombreNuevo() {
		return nombreNuevo;
	}

	public void setNombreNuevo(JTextField nombreNuevo) {
		this.nombreNuevo = nombreNuevo;
	}

	public JLabel getEnunciado1() {
		return enunciado1;
	}

	public void setEnunciado1(JLabel enunciado1) {
		this.enunciado1 = enunciado1;
	}

	public JLabel getEnunciado2() {
		return enunciado2;
	}

	public void setEnunciado2(JLabel enunciado2) {
		this.enunciado2 = enunciado2;
	}

	public JTextField getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(JTextField nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public JButton getbActivar() {
		return bActivar;
	}

	public void setbActivar(JButton bActivar) {
		this.bActivar = bActivar;
	}

	public JLabel getLabelNombre() {
		return labelNombre;
	}

	public void setLabelNombre(JLabel labelNombre) {
		this.labelNombre = labelNombre;
	}

	public JLabel getLabelTipo() {
		return labelTipo;
	}

	public void setLabelTipo(JLabel labelTipo) {
		this.labelTipo = labelTipo;
	}

	public JTextField getTipoMascota() {
		return tipoMascota;
	}

	public void setTipoMascota(JTextField tipoMascota) {
		this.tipoMascota = tipoMascota;
	}
	
	
	
}