package co.edu.unbosque.model;
/**
 * {@summary} Esta clase se dedica a los equipos, sus datos y creacion 
 */
public class Equipo {
	
	private String nombre;
	private int estrellas;
	/**
	 * Este es un constructor sin parametros para la clase Equipo. crea un objeto equipo sin nombre y con 0 estrellas
	 */
	public Equipo() {
		nombre = "";
		estrellas = 0;
	}
	/**
	 * Este es un constructor con parametros para la clase Equipo. crea un objeto equipo con los atributos puestos
	 * @param nombre Nombre del equipo
	 * @param estrellas cantidad de estrellas del equipoa 
	 */
	public Equipo(String nombre, int estrellas) {
		this.nombre = nombre;
		this.estrellas = estrellas;
	}
	/**
	 * Este es un constructor con parametros para la clase Equipo. crea un objeto equipo con los atributos puestos
	 * @param nombre Nombre del equipo
	 */
	public Equipo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstrellas() {
		return estrellas;
	}

	
	
}
