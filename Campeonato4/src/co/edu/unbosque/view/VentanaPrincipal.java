package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
* {@summary} La clase VentanaPrincipal sirve como un JFrame para alojar los demas elementos de la vista
* 
*/
public class VentanaPrincipal extends JFrame{
	
	private PanelOpciones panel_opciones;
	private PanelIngresar panel_guardar;
	private PanelEliminar panel_eliminar;
	private PanelResultado panel_resultado;
	private PanelMostrar panel_mostrar;
	private JLabel imagen;
	private JLabel titulo;
	private JButton bsalir;
	/**
	* Este es un constructor sin parametros de la clase VentanaPrincipal. carga los elementos a usar dentro del frame
	* 
	*/
	public VentanaPrincipal() {
		setTitle("Campeonato");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setSize(600,800);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.white);
		
		imagen = new JLabel();
		imagen.setBounds(0, 0, 600, 800);
		
		Image img = new ImageIcon("src/co/edu/unbosque/view/Estadio.jpg").getImage();
		ImageIcon img2 = new ImageIcon(img.getScaledInstance(600,800,Image.SCALE_SMOOTH));
		imagen.setIcon(img2); 
		
		titulo = new JLabel("Campeonato Futbol");
		titulo.setBounds(60, -40, 2000, 200);
		Color colorMorado = new Color(87, 18, 148);
		titulo.setForeground(colorMorado);
		titulo.setFont(new Font("Impact", Font.PLAIN, 60));
		add(titulo);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	/**
	* Inicializa los componentes y los anade
	* 
	*/
	private void inicializarComponentes() {
		panel_opciones = new PanelOpciones();
		panel_opciones.setBounds(80, 110, 435, 170);
		getContentPane().add(panel_opciones);
		
		panel_guardar = new PanelIngresar();
		panel_guardar.setBounds(80, 300, 435, 170);
		getContentPane().add(panel_guardar);
		
		panel_eliminar = new PanelEliminar();
		panel_eliminar.setBounds(80, 300, 435, 170);
		getContentPane().add(panel_eliminar);
		
		panel_resultado = new PanelResultado();
		panel_resultado.setBounds(80, 490, 435, 170);
		getContentPane().add(panel_resultado);
		
		panel_mostrar = new PanelMostrar();
		panel_mostrar.setBounds(80, 300, 435, 350);
		getContentPane().add(panel_mostrar);
		
		bsalir = new JButton("Salir");
		bsalir.setBounds(350, 680, 200, 60);
		Color colorRojo= new Color (252, 3, 19);
		bsalir.setBackground(colorRojo);
		bsalir.setForeground(Color.white);
		bsalir.setFont(new Font("Impact",Font.PLAIN, 25));
		bsalir.setActionCommand("SALIR");
		add(bsalir);
		
		add(imagen);
		
		
	}
	public PanelOpciones getPanel_opciones() {
		return panel_opciones;
	}

	public void setPanel_opciones(PanelOpciones panel_opciones) {
		this.panel_opciones = panel_opciones;
	}

	public PanelIngresar getPanel_guardar() {
		return panel_guardar;
	}

	public void setPanel_guardar(PanelIngresar panel_guardar) {
		this.panel_guardar = panel_guardar;
	}

	public PanelEliminar getPanel_eliminar() {
		return panel_eliminar;
	}

	public void setPanel_eliminar(PanelEliminar panel_eliminar) {
		this.panel_eliminar = panel_eliminar;
	}

	public PanelResultado getPanel_resultado() {
		return panel_resultado;
	}

	public void setPanel_resultado(PanelResultado panel_resultado) {
		this.panel_resultado = panel_resultado;
	}
	
	public PanelMostrar getPanel_mostrar() {
		return panel_mostrar;
	}

	public void setPanel_mostrar(PanelMostrar panel_mostrar) {
		this.panel_mostrar = panel_mostrar;
	}
	

	public JButton getBsalir() {
		return bsalir;
	}

	public void setBsalir(JButton bsalir) {
		this.bsalir = bsalir;
	}

	public JLabel getImagen() {
		return imagen;
	}

	public void setImagen(JLabel imagen) {
		this.imagen = imagen;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}
	
}
