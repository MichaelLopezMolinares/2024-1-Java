package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelOpciones extends JPanel{
	
	private JButton bAgregar;
	private JButton bEliminar;
	private JButton bMostrar;
	private JButton bEncontrar;
	private JButton bModificar;
	private JLabel enunciado1;
	private JLabel enunciado2;

	public PanelOpciones() {
		setBackground(new Color(99, 239, 173));
		setLayout (null);
		setBorder(null);
	
		inicializarComponentes();
		
		setVisible(true);
	}

	public void inicializarComponentes() {
		enunciado1 = new JLabel("Bienvenido a la veterinaria!");
		enunciado1.setBounds(15, -160, 500, 380);
		enunciado1.setForeground(Color.BLACK);
		enunciado1.setFont(new Font("Arial", Font.PLAIN, 20));
		add(enunciado1);
		
		enunciado2 = new JLabel("Seleccione una opcion");
		enunciado2.setBounds(15, 20, 500, 65);
		enunciado2.setForeground(Color.BLACK);
		enunciado2.setFont(new Font("Arial", Font.PLAIN, 20));
		add(enunciado2);
		
		bAgregar = new JButton("Guardar");
		bAgregar.setBounds(15, 75, 100, 50);
		Color colorVerde = new Color (75, 245, 66);
		bAgregar.setBackground(colorVerde);
		bAgregar.setForeground(Color.white);
		bAgregar.setFont(new Font("Arial",Font.PLAIN, 15));
		bAgregar.setActionCommand("GUARDAR");
		add(bAgregar);

		
		bEliminar= new JButton("Eliminar");
		bEliminar.setBounds(120, 75, 100, 50);
		Color colorRojo = new Color (181, 27, 55);
		bEliminar.setBackground(colorRojo);
		bEliminar.setForeground(Color.white);
		bEliminar.setFont(new Font("Arial",Font.PLAIN, 15));
		bEliminar.setActionCommand("ELIMINAR");
		add(bEliminar);
		
		bMostrar = new JButton("Mostrar");
		bMostrar.setBounds(15, 130, 100, 50);
		bMostrar.setActionCommand("MOSTRAR");
		Color colorAzul = new Color (13, 70, 94);
		bMostrar.setBackground(colorAzul);
		bMostrar.setForeground(Color.white);
		bMostrar.setFont(new Font("Arial",Font.PLAIN, 15));
		add(bMostrar);
		
		bEncontrar = new JButton("Buscar");
		bEncontrar.setBounds(120, 130, 100, 50);
		bEncontrar.setActionCommand("BUSCAR");
		bEncontrar.setBackground(colorAzul);
		bEncontrar.setForeground(Color.white);
		bEncontrar.setFont(new Font("Arial",Font.PLAIN, 15));
		add(bEncontrar);

		bModificar = new JButton("Modificar");
		bModificar.setBounds(69, 185, 100, 50);
		bModificar.setActionCommand("MODIFICAR");
		bModificar.setBackground(colorAzul);
		bModificar.setForeground(Color.white);
		bModificar.setFont(new Font("Arial",Font.PLAIN, 15));
		add(bModificar);
	}
	
	public JButton getbAgregar() {
		return bAgregar;
	}
	public void setbAgregar(JButton bAgregar) {
		this.bAgregar = bAgregar;
	}
	public JButton getbEliminar() {
		return bEliminar;
	}
	public void setbEliminar(JButton bEliminar) {
		this.bEliminar = bEliminar;
	}
	public JButton getbMostrar() {
		return bMostrar;
	}
	public void setbMostrar(JButton bMostrar) {
		this.bMostrar = bMostrar;
	}
	public JButton getbEncontrar() {
		return bEncontrar;
	}
	public void setbEncontrar(JButton bEncontrar) {
		this.bEncontrar = bEncontrar;
	}

	public JButton getbModificar() {
		return bModificar;
	}
	public void setbModificar(JButton bModificar) {
		this.bModificar = bModificar;
	}
}