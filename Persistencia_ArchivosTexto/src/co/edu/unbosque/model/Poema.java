package co.edu.unbosque.model;

import java.io.File;

import co.edu.unbosque.model.persistence.Archivo;

public class Poema {
	
	private String texto;
	Archivo arch;

	public Poema() {
		arch = new Archivo();
	}
	
	public Poema(File f) {
		arch = new Archivo(f);
	}
	
	public String leerPoema() {
		texto = arch.leerArchivo();
		return texto;
	}
	
	public String actualizarPoema(String frase) {
		return arch.escribirArchivo(frase);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
