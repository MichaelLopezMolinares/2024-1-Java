package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
/**
* {@summary} La clase PanelIngresar sirve como un JPanel para alojar lo necesario para agregar un equipo a la persistencia y el arreglo
* 
*/
public class PanelIngresar extends JPanel   {
	
	private JTextField equipo;
    private JTextField estrellas;
    private JLabel instruccion;
    private JLabel partidos;
    private JButton bguardar;
    private JButton bborrar;
    /**
	* Este es un constructor sin parametros de la clase PanelIngresar. carga los elementos a usar dentro del JPanel
	* 
	*/
    public PanelIngresar() {

		setLayout(null);
		
		Color colorverde = new Color (144, 245, 66);
		setBackground(colorverde);
		setLayout (null);

		inicializarComponentes();

		setBorder(new TitledBorder("Opción guardar equipo:"));
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
		
		equipo = new JTextField();
		equipo.setBounds(25, 60, 280, 25);
		add(equipo);
		
		instruccion = new JLabel("Escriba cuantas estrellas tiene: ");
		instruccion.setBounds(15, -78, 2000, 380);
		instruccion.setForeground(Color.BLACK);
		instruccion.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		add(instruccion);
		
		estrellas = new JTextField();
		estrellas.setBounds(25, 130, 280, 25);
		add(estrellas);
		
		bguardar = new JButton("Guardar");
		bguardar.setBounds(315, 30, 110, 60);
		Color colorVioleta = new Color (71, 37, 97);
		bguardar.setBackground(colorVioleta);
		bguardar.setForeground(Color.white);
		bguardar.setFont(new Font("Impact",Font.PLAIN, 20));
		bguardar.setActionCommand("INGRESADO");
		add(bguardar);
		
		bborrar = new JButton("Limpiar Rta");
		bborrar.setBounds(315, 110, 110, 50);
		Color colorNaranja = new Color (252, 152, 3);
		bborrar.setBackground(colorNaranja);
		bborrar.setForeground(Color.white);
		bborrar.setFont(new Font("Impact",Font.PLAIN, 17));
		bborrar.setActionCommand("LIMPIAR");
		add(bborrar);
		
	}

	public JTextField getEquipo() {
		return equipo;
	}

	public void setEquipo(JTextField equipo) {
		this.equipo = equipo;
	}

	public JTextField getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(JTextField estrellas) {
		this.estrellas = estrellas;
	}

	public JLabel getInstruccion() {
		return instruccion;
	}

	public void setInstruccion(JLabel instruccion) {
		this.instruccion = instruccion;
	}

	public JLabel getPartidos() {
		return partidos;
	}

	public void setPartidos(JLabel partidos) {
		this.partidos = partidos;
	}

	public JButton getBguardar() {
		return bguardar;
	}

	public void setBguardar(JButton bguardar) {
		this.bguardar = bguardar;
	}

	public JButton getBborrar() {
		return bborrar;
	}

	public void setBborrar(JButton bborrar) {
		this.bborrar = bborrar;
	}
	
	
	
	
}
