package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
/**
* {@summary} La clase PanelIngresar sirve como un JPanel para alojar lo necesario para eliminar un equipo de la persistencia y el arreglo
* 
*/
public class PanelEliminar extends JPanel {
	
	private JTextField equipo;
	private JLabel instruccion;
	private JButton beliminar;
	private JButton blimpiar;
    /**
	* Este es un constructor sin parametros de la clase PanelEliminar. carga los elementos a usar dentro del JPanel
	* 
	*/
	 public PanelEliminar() {

			setLayout(null);
			
			Color colorverde = new Color (144, 245, 66);
			setBackground(colorverde);
			setLayout (null);

			inicializarComponentes();

			setBorder(new TitledBorder("Opción eliminar equipo:"));
		}
	 
	   /**
		* Inicializa los componentes y los anade
		* 
		*/
	 public void inicializarComponentes() {
			instruccion = new JLabel("Escriba el nombre del equipo: ");
			instruccion.setBounds(15, -148, 2000, 380);
			instruccion.setForeground(Color.BLACK);
			instruccion.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			add(instruccion);
			
			beliminar = new JButton("Eliminar");
			beliminar.setBounds(315, 30, 110, 60);
			Color colorVioleta = new Color (71, 37, 97);
			beliminar.setBackground(colorVioleta);
			beliminar.setForeground(Color.white);
			beliminar.setFont(new Font("Impact",Font.PLAIN, 20));
			beliminar.setActionCommand("BORRAR");
			add(beliminar);
			
			equipo = new JTextField();
			equipo.setBounds(25, 60, 280, 25);
			add(equipo);
			
			blimpiar = new JButton("Limpiar Campo");
			blimpiar.setBounds(315, 110, 110, 50);
			Color colorNaranja = new Color (252, 152, 3);
			blimpiar.setBackground(colorNaranja);
			blimpiar.setForeground(Color.white);
			blimpiar.setFont(new Font("Impact",Font.PLAIN, 12));
			blimpiar.setActionCommand("QUITAR");
			add(blimpiar);
				
	}

	public JTextField getEquipo() {
		return equipo;
	}

	public void setEquipo(JTextField equipo) {
		this.equipo = equipo;
	}

	public JLabel getInstruccion() {
		return instruccion;
	}

	public void setInstruccion(JLabel instruccion) {
		this.instruccion = instruccion;
	}

	public JButton getBeliminar() {
		return beliminar;
	}

	public void setBeliminar(JButton beliminar) {
		this.beliminar = beliminar;
	}

	public JButton getBlimpiar() {
		return blimpiar;
	}

	public void setBlimpiar(JButton blimpiar) {
		this.blimpiar = blimpiar;
	}
	
	
	 

}
