package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.ArchivoPropiedades;

public class Arreglo {
	
	private int bd[];
	private int tam;
	private ArchivoPropiedades archivo;
	
	public Arreglo() {
		archivo = new ArchivoPropiedades();
		crearArreglo();
		cargarDatos();
	}
	
	public void crearArreglo() {
		String aux = archivo.leerPropiedades("cantidadDatos");
		tam = Integer.parseInt(aux);
		bd = new int[tam];
	}
	
	public void cargarDatos() {
		for (int i = 0; i < bd.length; i++) {
			String aux = archivo.leerPropiedades("num"+(i+1));
			bd[i]= Integer.parseInt(aux);
		}
	}
	
	public String verDatos() {
		String rta = "";
		for (int i = 0; i < bd.length; i++) {
			rta += bd[i] + "  ";
		}
		return rta;
	}
	
	public void actualizarNumero(String clave, int valor) {
		archivo.escribirPropiedades(clave, ""+valor);
	}
	
	

}
