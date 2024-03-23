package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Campeonato;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {
	/**
	 * {@summary} Esta clase se dedica a manejar la logica usada para el programa. implementa la interface ActionListener para el funcionamiento de los botones de la vista 
	 */
	private VentanaPrincipal vista;
	private Campeonato campeonato;
	
	/**
	 * Este es un constructor con parametros de la clase Controller. inicializa los atributos vista y campeonato. verifica los archivos de la persistencia y prepara la vista
	 */
	public Controller() {
		vista= new VentanaPrincipal();
		campeonato = new Campeonato();
		agregarLectores();
		checkExistencias();
		
		vista.getPanel_guardar().setVisible(false);
		vista.getPanel_eliminar().setVisible(false);
		vista.getPanel_resultado().setVisible(false);
		vista.getPanel_mostrar().setVisible(false);
	}
	/**
	 * Agrega los lectores de cada boton a utilizar
	 */
	private void agregarLectores() {
		vista.getBsalir().addActionListener(this);
		
		vista.getPanel_opciones().getBguardar().addActionListener(this);
		vista.getPanel_opciones().getBeliminar().addActionListener(this);
		vista.getPanel_opciones().getBmostrar().addActionListener(this);
		
		vista.getPanel_guardar().getBguardar().addActionListener(this);
		vista.getPanel_guardar().getBborrar().addActionListener(this);
		
		vista.getPanel_eliminar().getBeliminar().addActionListener(this);
		vista.getPanel_eliminar().getBlimpiar().addActionListener(this);
		
	}

	/**
	 * Anade las acciones para ejecutar al presionar cada boton
	 */
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "SALIR":
			vista.dispose();
			break;
			
		case "GUARDAR":
			vista.getPanel_guardar().setVisible(true);
			vista.getPanel_eliminar().setVisible(false);
			vista.getPanel_resultado().setVisible(true);
			vista.getPanel_mostrar().setVisible(false);
			break;
			
		case "LIMPIAR":
			vista.getPanel_resultado().getResultados().setText("");
			break;
		
		case "ELIMINAR":
			vista.getPanel_guardar().setVisible(false);
			vista.getPanel_eliminar().setVisible(true);
			vista.getPanel_resultado().setVisible(true);
			vista.getPanel_mostrar().setVisible(false);
			break;
			
		case "QUITAR":
			vista.getPanel_resultado().getResultados().setText("");
		
			break;
		
		case "MOSTRAR":
			vista.getPanel_guardar().setVisible(false);
			vista.getPanel_eliminar().setVisible(false);
			vista.getPanel_resultado().setVisible(false);
			vista.getPanel_mostrar().setVisible(true);
			mostrarEquipos();
			break;
		
		case "INGRESADO":
			agregarEquipo();
			break;
			
		case "BORRAR":
			eliminarEquipo();
			break;
		}
	}
	/**
	 * Conecta el metodo agregarEquipo de la clase Campeonato con la vista
	 */
	public void agregarEquipo() {
	    try {
	        String aux = vista.getPanel_guardar().getEquipo().getText();
	        String estrellas = vista.getPanel_guardar().getEstrellas().getText();

	        if(aux.isEmpty() && estrellas.isEmpty()) {
	        	vista.getPanel_resultado().getResultados().setText("Ingrese el nombre y las estrellas del equipo para guardarlo");
	        
	        }else if (aux.isEmpty()) {
	            vista.getPanel_resultado().getResultados().setText("Ingresar el nombre del equipo para guardarlo");

	        }else if(estrellas.isEmpty()) {
	        	vista.getPanel_resultado().getResultados().setText("Ingresar el numero de estrellas del equipo");
	        }
	        
	        int aux2 = Integer.parseInt(estrellas);
	        
	        if (campeonato.agregarEquipo(aux, aux2)) {
	            vista.getPanel_resultado().getResultados().setText(aux + " ha sido agregado con éxito");
	            vista.getPanel_guardar().getEquipo().setText("");
	            vista.getPanel_guardar().getEstrellas().setText("");
	        } else {
	            vista.getPanel_resultado().getResultados().setText("No fue posible la inserción de " + aux);
	            vista.getPanel_guardar().getEquipo().setText("");
	            vista.getPanel_guardar().getEstrellas().setText("");
	        }    
	    } catch (NumberFormatException e) {
	        vista.getPanel_resultado().getResultados().setText("Ingrese únicamente un valor numérico para las estrellas");
	        vista.getPanel_guardar().getEstrellas().setText("");
	    }	    
	}
	/**
	 * Revisa si hay entradas existentes dentro de la persistencia
	 */
	public void checkExistencias() {
		if(campeonato.getArchivo().getDatos().isEmpty() | Integer.parseInt(campeonato.obtenerPropiedad("campeonato.equipos")) == 0 ){
			vista.getPanel_opciones().setVisible(true);
			vista.getPanel_guardar().setVisible(true);
			vista.getPanel_eliminar().setVisible(false);
			vista.getPanel_resultado().getResultados().setText("No se encontraron equipos registrados. registre uno para seguir");
		}	
}
	/**
	 * Muestra los equipos existentes dentro del panel de resultados
	 */
	public void mostrarEquipos() {
		String aux = campeonato.InformacionCampeonato();
		vista.getPanel_mostrar().getMostrar().setText(aux);
	}
	
	/**
	 * Conecta el metodo eliminarEquipo de la clase Campeonato con la vista
	 */
	public void eliminarEquipo() {
		try {
		String aux = vista.getPanel_eliminar().getEquipo().getText();
		if(aux.isEmpty()) {
			vista.getPanel_resultado().getResultados().setText("Ingrese el nombre del equipo a eliminar");
		}else {
			if(campeonato.eliminarEquipo(aux)) {
			vista.getPanel_resultado().getResultados().setText( aux  +  " se elimino con éxito");
			vista.getPanel_eliminar().getEquipo().setText("");
			
			}else {
				vista.getPanel_resultado().getResultados().setText("No fue posible la elimnacion de " + aux );
				vista.getPanel_eliminar().getEquipo().setText("");
			}
		}
		
	} catch (NumberFormatException e) {
		vista.getPanel_resultado().getResultados().setText("Error de formato");
	}
	}
}
