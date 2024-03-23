package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Comision;
import co.edu.unbosque.model.IngenieroJunior;
import co.edu.unbosque.model.IngenieroSenior;
import co.edu.unbosque.model.Personal;
import co.edu.unbosque.model.Tecnico;
import co.edu.unbosque.view.VentanaDatosCom;
import co.edu.unbosque.view.VentanaDatosIngJu;
import co.edu.unbosque.view.VentanaDatosIngSe;
import co.edu.unbosque.view.VentanaDatosTec;
import co.edu.unbosque.view.VistaVentanasEmergentes;
/**
 * {@summary} Esta clase se dedica a manejar la logica usada para el programa. implementa la interface ActionListener para el funcionamiento de los botones de la vista 
 */
public class Controller implements ActionListener {
	
	private Personal x;
	private VistaVentanasEmergentes vista;
	private VentanaDatosIngJu IngJu;
	private VentanaDatosIngSe IngSe;
	private VentanaDatosTec Tec;
	private VentanaDatosCom Com;
	
	/**
	 * Este es un constructor sin parametros para la clase Controller. inicializa el dato vista y emplea el metodo funcionar
	 */
	public Controller() {
		vista = new VistaVentanasEmergentes();
		funcionar();
	}
	
	/**
	 * El metodo funcionar inicializa el programa. imprime un mensaje en una ventana emergente y registra la opcion escogida por el usuario
	 */
	public void funcionar () {
		vista.mostrarInfo("\nBienvenido a la gestion de datos del personal, seleccione el tipo de personal: ");
		int opcion = vista.leerDatoEntero(
				
				"\n1: Ingeniero Junior"
			   + "\n2: Ingeniero Senior"
			   + "\n3: Tecnico"
			   + "\n4 : Comision");
		
		preguntarOpcion(opcion);
		
	}
	
	/**
	 * Este metodo redirige al usuario en base a su eleccion a la ventana para ingresar datos de un empleado clase IngenieroJunior, IngenieroSenior, Tecnico y Comision. dentro de cada opcion se incializa la ventana, se agregan sus lectores y se configura su visibilidad
	 * @param opcion Es la eleccion escogida por el usuario dentro de funcionar()
	 */
	private void preguntarOpcion(int opcion) {
		switch(opcion){
		case 1:
			IngJu = new VentanaDatosIngJu();
			agregarLectoresIngJu();
			IngJu.setVisible(true);	
			break;
		case 2:
			IngSe = new VentanaDatosIngSe();
			agregarLectoresIngSe();
			IngSe.setVisible(true);	
			break;
		case 3:
			Tec = new VentanaDatosTec();
			agregarLectoresTec();
			Tec.setVisible(true);	
			break;
		case 4:
			Com = new VentanaDatosCom();
			agregarLectoresCom();
			Com.setVisible(true);
			break;
		default:
			break;
		}	
	}
	/**
	 * Crea una instancia de IngenieroJunior en base a los datos escogidos por el usuario y calcula su salario. los resultados se muestran mediate una ventana emergente
	 */
	public void crearIngenieroJunior() {
		
		int aux1 = Integer.parseInt(IngJu.getCedula().getText());
		String aux2 = IngJu.getNombres().getText();
		String aux3 = IngJu.getApellido().getText();
		char aux4 = IngJu.getGenero().getText().charAt(0);
		String aux5 = IngJu.getFechaNacimiento().getText();
		long aux6 = Long.parseLong(IngJu.getTelefono().getText());
		String aux7 = IngJu.getCorreo().getText();
		String aux8 = IngJu.getDireccion().getText();
		int aux9 = Integer.parseInt(IngJu.getAñoIngreso().getText());
		int aux10 = Integer.parseInt(IngJu.getNivel().getText());
		
		IngenieroJunior x;
		x = new IngenieroJunior(aux1, aux2, aux3, aux4, aux5, aux6, aux7, aux8, aux9,aux10);
		x.calcularSalario();
		vista.mostrarInfo(x.toString());
	
	}
	
	/**
	 * Crea una instancia de IngenieroSenior en base a los datos escogidos por el usuario y calcula su salario. los resultados se muestran mediate una ventana emergente
	 */
	public void crearIngenieroSenior() {
		
		int aux1 = Integer.parseInt(IngSe.getCedula().getText());
		String aux2 = IngSe.getNombres().getText();
		String aux3 = IngSe.getApellido().getText();
		char aux4 = IngSe.getGenero().getText().charAt(0);
		String aux5 = IngSe.getFechaNacimiento().getText();
		long aux6 = Long.parseLong(IngSe.getTelefono().getText());
		String aux7 = IngSe.getCorreo().getText();
		String aux8 = IngSe.getDireccion().getText();
		int aux9 = Integer.parseInt(IngSe.getAñoIngreso().getText());
		int aux10 = Integer.parseInt(IngSe.getVentas().getText());
		
		IngenieroSenior x;
		x = new IngenieroSenior(aux1, aux2, aux3, aux4, aux5, aux6, aux7, aux8, aux9,aux10);
		x.calcularSalario();
		vista.mostrarInfo(x.toString());
		
	}
	
	/**
	 * Crea una instancia de Tecnico en base a los datos escogidos por el usuario y calcula su salario. los resultados se muestran mediate una ventana emergente
	 */
	public void crearTecnico() {
		
		int aux1 = Integer.parseInt(Tec.getCedula().getText());
		String aux2 = Tec.getNombres().getText();
		String aux3 = Tec.getApellido().getText();
		char aux4 = Tec.getGenero().getText().charAt(0);
		String aux5 = Tec.getFechaNacimiento().getText();
		long aux6 = Long.parseLong(Tec.getTelefono().getText());
		String aux7 = Tec.getCorreo().getText();
		String aux8 = Tec.getDireccion().getText();
		int aux9 = Integer.parseInt(Tec.getAñoIngreso().getText());
		int aux10 = Integer.parseInt(Tec.getEdad().getText());
	
		Tecnico x;
		x = new Tecnico(aux1, aux2, aux3, aux4, aux5, aux6, aux7, aux8, aux9,aux10);
		x.calcularSalario();
		vista.mostrarInfo(x.toString());
	}
	
	/**
	 * Crea una instancia de Comision en base a los datos escogidos por el usuario y calcula su salario. los resultados se muestran mediate una ventana emergente
	 */
	public void crearComision() {
		int aux1 = Integer.parseInt(Com.getCedula().getText());
		String aux2 = Com.getNombres().getText();
		String aux3 = Com.getApellido().getText();
		char aux4 = Com.getGenero().getText().charAt(0);
		String aux5 = Com.getFechaNacimiento().getText();
		long aux6 = Long.parseLong(Com.getTelefono().getText());
		String aux7 = Com.getCorreo().getText();
		String aux8 = Com.getDireccion().getText();
		int aux9 = Integer.parseInt(Com.getAñoIngreso().getText());
		int aux10 = Integer.parseInt(Com.getClienteCaptado().getText());
		int aux11 = Integer.parseInt(Com.getMontoCliente().getText());
		
		
		Comision x;
		x = new Comision(aux1, aux2, aux3, aux4, aux5, aux6, aux7, aux8, aux9,aux10, aux11);
		x.calcularSalario();
		vista.mostrarInfo(x.toString());
			
	}
	
	/**
	 * Agrega los lectores de VentanaDatosIngJu
	 */
	public void agregarLectoresIngJu () {
		if (IngJu != null) {
			IngJu.getSiguiente().addActionListener(this);
			IngJu.getSiguiente().setActionCommand("CalcularJunior");
		}	
	}
	
	/**
	 * Agrega los lectores de VentanaDatosIngSe
	 */
	public void agregarLectoresIngSe() {
		if (IngSe != null) {
			IngSe.getSiguiente().addActionListener(this);
			IngSe.getSiguiente().setActionCommand("CalcularSenior");
		}
	}
	
	/**
	 * Agrega los lectores de VentanaDatosTec
	 */
	public void agregarLectoresTec() {
		if (Tec != null) {
			Tec.getSiguiente().addActionListener(this);
			Tec.getSiguiente().setActionCommand("CalcularTecnico");
		}	
	}
	
	/**
	 * Agrega los lectores de VentanaDatosCom
	 */
	public void agregarLectoresCom() {
		if (Com != null) {
			Com.getSiguiente().addActionListener(this);
			Com.getSiguiente().setActionCommand("CalcularComision");
		}
	}
	
		
		
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		
		case "CalcularJunior":
			crearIngenieroJunior();
			break;
		case "CalcularSenior":
			crearIngenieroSenior();
			break;
		case "CalcularTecnico":
			crearTecnico();
			break;
		case "CalcularComision":
			crearComision();
			
		}
	}


}
    
   