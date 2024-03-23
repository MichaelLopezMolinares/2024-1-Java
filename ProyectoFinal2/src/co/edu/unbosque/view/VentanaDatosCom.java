package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * {@summary} Esta clase se dedica a la ventana para ingresar los datos necesarios de un empleado de clase Comision
 */
public class VentanaDatosCom extends JFrame{
	
	
	private JLabel titulo;
	private JLabel ced;
	private JLabel nom;
	private JLabel ape;
	private JLabel gen;
	private JLabel fecha;
	private JLabel tel;
	private JLabel mail;
	private JLabel dir;
	private JLabel año;
	private JLabel cC;
	private JLabel mC;
	private JTextField cedula;
	private JTextField nombres;
	private JTextField apellido;
	private JTextField genero;
	private JTextField fechaNacimiento;
	private JTextField telefono;
	private JTextField correo;
	private JTextField direccion;
	private JTextField añoIngreso;
	private JTextField clienteCaptado;
	private JTextField montoCliente;
	private JButton siguiente;
	private JLabel imagen;

	/**
	 * Constructor para VentanaDatosComision. Inicializa los JLabels y JTextFields necesarios, crea el boton para calcular y añade los atributos
	 */
	public VentanaDatosCom () {
		setBounds (10, 10, 1200, 700);
		setTitle("Datos Comision");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		setBackground(Color.blue);
		
		imagen = new JLabel();
		imagen.setBounds(10, 10, 1200, 700);
		
		Image img = new ImageIcon("src/co/edu/unbosque/view/Fondo.jpg").getImage();
		ImageIcon img2 = new ImageIcon(img.getScaledInstance(1200,700,Image.SCALE_SMOOTH));
		imagen.setIcon(img2);
		
		
		titulo = new JLabel("Ingrese los datos");
		titulo.setBounds(40, -40, 1000, 200);
		Color colorMorado = new Color(91, 27, 130);
		titulo.setForeground(colorMorado);
		titulo.setFont(new Font("Mystical Woods Rough Script", Font.BOLD, 50));
		
		ced = new JLabel("Cedula:");
		ced.setBounds(80, 65, 350, 100);
		Color colorVerde = new Color (20, 94, 13);
		ced.setForeground(colorVerde);
		ced.setFont(new Font("TimesRoman",Font.LAYOUT_RIGHT_TO_LEFT, 35));
		
		cedula = new JTextField();
		cedula.setBounds(300, 103, 350, 30);
		cedula.setForeground(Color.gray);
		cedula.setFont(new Font("Arial", 0, 20));
		cedula.setEditable(true);
		cedula.setEnabled(true);
		
		nom = new JLabel("Nombres: ");
		nom.setBounds(80, 120, 350, 100);
		nom.setForeground(colorVerde);
		nom.setFont(new Font("TimesRoman",Font.LAYOUT_RIGHT_TO_LEFT, 35));
		
		nombres = new JTextField();
		nombres.setBounds(300, 160, 350, 30);
		nombres.setForeground(Color.gray);
		nombres.setFont(new Font("Arial", 0, 20));
		nombres.setEditable(true);
		nombres.setEnabled(true);
		
		ape = new JLabel("Apellidos:");
		ape.setBounds(80, 180, 350, 100);
		ape.setForeground(colorVerde);
		ape.setFont(new Font("TimesRoman",Font.LAYOUT_RIGHT_TO_LEFT, 35));
		
		apellido = new JTextField();
		apellido.setBounds(300, 220, 350, 30);
		apellido.setForeground(Color.gray);
		apellido.setFont(new Font("Arial", 0, 20));
		apellido.setEditable(true);
		apellido.setEnabled(true);
		
		gen = new JLabel("Género:");
		gen.setBounds(80, 235, 350, 100);
		gen.setForeground(colorVerde);
		gen.setFont(new Font("TimesRoman",Font.LAYOUT_RIGHT_TO_LEFT, 35));
		
		genero = new JTextField();
		genero.setBounds(300, 273, 350, 30);
		genero.setForeground(Color.gray);
		genero.setFont(new Font("Arial", 0, 20));
		genero.setEditable(true);
		genero.setEnabled(true);
		
		fecha = new JLabel("Fecha de Nacimiento:");
		fecha.setBounds(80, 280, 350, 100);
		fecha.setForeground(colorVerde);
		fecha.setFont(new Font("TimesRoman",Font.LAYOUT_RIGHT_TO_LEFT, 33));
		
		fechaNacimiento = new JTextField();
		fechaNacimiento.setBounds(450, 320, 350, 30);
		fechaNacimiento.setForeground(Color.gray);
		fechaNacimiento.setFont(new Font("Arial", 0, 20));
		fechaNacimiento.setEditable(true);
		fechaNacimiento.setEnabled(true);
		
		tel = new JLabel("Telefono:");
		tel.setBounds(80, 330, 350, 100);
		tel.setForeground(colorVerde);
		tel.setFont(new Font("TimesRoman",Font.LAYOUT_RIGHT_TO_LEFT, 35));
		
		telefono = new JTextField();
		telefono.setBounds(300, 370, 350, 30);
		telefono.setForeground(Color.gray);
		telefono.setFont(new Font("Arial", 0, 20));
		telefono.setEditable(true);
		telefono.setEnabled(true);
		
		mail = new JLabel("Correo Electronico:");
		mail.setBounds(80, 380, 350, 100);
		mail.setForeground(colorVerde);
		mail.setFont(new Font("TimesRoman",Font.LAYOUT_RIGHT_TO_LEFT, 33));
		
		correo = new JTextField();
		correo.setBounds(400, 420, 350, 30);
		correo.setForeground(Color.gray);
		correo.setFont(new Font("Arial", 0, 20));
		correo.setEditable(true);
		correo.setEnabled(true);
		
		dir = new JLabel("Direccion:");
		dir.setBounds(80, 430, 350, 100);
		dir.setForeground(colorVerde);
		dir.setFont(new Font("TimesRoman",Font.LAYOUT_RIGHT_TO_LEFT, 35));
		
		direccion = new JTextField();
		direccion.setBounds(300, 470, 350, 30);
		direccion.setForeground(Color.gray);
		direccion.setFont(new Font("Arial", 0, 20));
		direccion.setEditable(true);
		direccion.setEnabled(true);
		
		año = new JLabel("Año de Ingreso:");
		año.setBounds(80, 480, 380, 100);
		año.setForeground(colorVerde);
		año.setFont(new Font("TimesRoman",Font.LAYOUT_RIGHT_TO_LEFT, 35));
		
		añoIngreso = new JTextField();
		añoIngreso.setBounds(390, 520, 300, 30);
		añoIngreso.setForeground(Color.gray);
		añoIngreso.setFont(new Font("Arial", 0, 20));
		añoIngreso.setEditable(true);
		añoIngreso.setEnabled(true);
		
		cC = new JLabel("Clientes Captados: ");
		cC.setBounds(80, 530, 350, 100);
		cC.setForeground(colorVerde);
		cC.setFont(new Font("TimesRoman",Font.LAYOUT_RIGHT_TO_LEFT, 35));
		
		clienteCaptado = new JTextField();
		clienteCaptado.setBounds(420, 570, 350, 30);
		clienteCaptado.setForeground(Color.gray);
		clienteCaptado.setFont(new Font("Arial", 0, 20));
		clienteCaptado.setEditable(true);
		clienteCaptado.setEnabled(true);
		
		mC = new JLabel("Monto Cliente: ");
		mC.setBounds(80, 575, 350, 100);
		mC.setForeground(colorVerde);
		mC.setFont(new Font("TimesRoman",Font.LAYOUT_RIGHT_TO_LEFT, 35));
		
		montoCliente = new JTextField();
		montoCliente.setBounds(340, 615, 350, 30);
		montoCliente.setForeground(Color.gray);
		montoCliente.setFont(new Font("Arial", 0, 20));
		montoCliente.setEditable(true);
		montoCliente.setEnabled(true);
		
		siguiente = new JButton("Calcular");
		siguiente.setBounds(850, 500, 250, 70);
		Color colorAzul = new Color (13, 70, 94);
		siguiente.setBackground(colorAzul);
		siguiente.setForeground(Color.white);
		siguiente.setFont(new Font("TimesRoman",Font.ITALIC, 35));
		
		
		add(titulo);
		add(ced);
		add(cedula);
		add(nom);
		add(nombres);
		add(ape);
		add(apellido);
		add(gen);
		add(genero);
		add(fecha);
		add(fechaNacimiento);
		add(tel);
		add(telefono);
		add(mail);
		add(correo);
		add(dir);
		add(direccion);
		add(año);
		add(añoIngreso);
		add(cC);
		add(clienteCaptado);
		add(mC);
		add (montoCliente);
		add(siguiente);
		add(imagen);
		
	}


	public JLabel getTitulo() {
		return titulo;
	}


	public JLabel getCed() {
		return ced;
	}


	public JLabel getNom() {
		return nom;
	}


	public JLabel getApe() {
		return ape;
	}


	public JLabel getGen() {
		return gen;
	}


	public JLabel getFecha() {
		return fecha;
	}


	public JLabel getTel() {
		return tel;
	}


	public JLabel getMail() {
		return mail;
	}


	public JLabel getDir() {
		return dir;
	}


	public JLabel getAño() {
		return año;
	}


	public JLabel getcC() {
		return cC;
	}


	public JLabel getmC() {
		return mC;
	}


	public JTextField getCedula() {
		return cedula;
	}


	public JTextField getNombres() {
		return nombres;
	}


	public JTextField getApellido() {
		return apellido;
	}


	public JTextField getGenero() {
		return genero;
	}


	public JTextField getFechaNacimiento() {
		return fechaNacimiento;
	}


	public JTextField getTelefono() {
		return telefono;
	}


	public JTextField getCorreo() {
		return correo;
	}


	public JTextField getDireccion() {
		return direccion;
	}


	public JTextField getAñoIngreso() {
		return añoIngreso;
	}


	public JTextField getClienteCaptado() {
		return clienteCaptado;
	}


	public JTextField getMontoCliente() {
		return montoCliente;
	}


	public JButton getSiguiente() {
		return siguiente;
	}


	public JLabel getImagen() {
		return imagen;
	}

}
