package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
/**
* {@summary} La clase PanelOpciones sirve como un JPanel para alojar los botones para las operaciones posibles dentro del programa
* 
*/
public class PanelOpciones extends JPanel{
	
	private JButton bguardar;
	private JButton beliminar;
	private JButton bmostrar;
	private JLabel instruccion;
	/**
	* Este es un constructor sin parametros de la clase PanelOpciones. carga los elementos a usar dentro del JPanel
	* 
	*/
	public PanelOpciones() {
		Color colorcian = new Color (156, 218, 219);
		setBackground(colorcian);
		setLayout (null);
		
		inicializarComponentes();
		
		setBorder(BorderFactory.createTitledBorder(""));
		
	}
	/**
	* Inicializa los componentes y los anade
	* 
	*/
	public void inicializarComponentes() {
		instruccion = new JLabel("Oprima la opción a realizar con el equipo:");
		instruccion.setBounds(15, -160, 2000, 380);
		instruccion.setForeground(Color.BLACK);
		instruccion.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		add(instruccion);
		
		bguardar = new JButton("Guardar");
		bguardar.setBounds(35, 65, 120, 70);
		Color colorVerde = new Color (75, 245, 66);
		bguardar.setBackground(colorVerde);
		bguardar.setForeground(Color.white);
		bguardar.setFont(new Font("Impact",Font.PLAIN, 25));
		bguardar.setActionCommand("GUARDAR");
		add(bguardar);

		
		beliminar= new JButton("Eliminar");
		beliminar.setBounds(168, 65, 120, 70);
		Color colorRojo = new Color (181, 27, 55);
		beliminar.setBackground(colorRojo);
		beliminar.setForeground(Color.white);
		beliminar.setFont(new Font("Impact",Font.PLAIN, 25));
		beliminar.setActionCommand("ELIMINAR");
		add(beliminar);
		
		bmostrar = new JButton("Mostrar");
		bmostrar.setBounds(300, 65, 120, 70);
		bmostrar.setActionCommand("MOSTRAR");
		Color colorAzul = new Color (13, 70, 94);
		bmostrar.setBackground(colorAzul);
		bmostrar.setForeground(Color.white);
		bmostrar.setFont(new Font("Impact",Font.PLAIN, 25));
		add(bmostrar);
	}

	public JButton getBguardar() {
		return bguardar;
	}

	public void setBguardar(JButton bguardar) {
		this.bguardar = bguardar;
	}

	public JButton getBeliminar() {
		return beliminar;
	}

	public void setBeliminar(JButton beliminar) {
		this.beliminar = beliminar;
	}

	public JButton getBmostrar() {
		return bmostrar;
	}

	public void setBmostrar(JButton bmostrar) {
		this.bmostrar = bmostrar;
	}
	
	
}
