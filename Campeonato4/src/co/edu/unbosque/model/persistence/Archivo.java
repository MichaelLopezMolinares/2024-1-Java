package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
* {@summary} La clase Archivo se dedica al manejo de las persistencias de este proyecto. usa la extension .properties
* 
*/
public class Archivo {
	
	private File f;
	private Properties datos;
	/**
	* Este es un constructor sin parametros de la clase Archivo. crea un archivo .properties en caso de que no exista
	* 
	*/
	public Archivo() {
		f = new File("archivos\\DatosCampeonato.properties");
		datos = new Properties();
		
		if (!f.isFile()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			
		
		}
	
	/**
	* Lee los datos del archivo y los carga dentro de el atributo datos
	* @throws IOException
	* 
	*/
	public void leerConfiguracion() throws IOException {
		try {
			FileInputStream in = new FileInputStream(f);
			datos.load(in);
			in.close();
		}catch(IOException e) {
			throw new IOException("Formato Inv�lido");
		}
	}
	/**
	* Modifica la persistencia y sobreescribe para modificar o crear una propiedad
	* @param Propiedad nombre de la propiedad a crear
	* @param valor Valor de la propiedad a crear
	* 
	*/
	public void escribirPropiedades(String propiedad, String valor) {
		try {
			datos.setProperty(propiedad, valor);
			datos.store(new FileOutputStream(f), null);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	/**
	* Guarda los cambios de una persistencia sin una accion en especifico
	*/
	public void save() {
		try {
			datos.store(new FileOutputStream(f), null);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public Properties getDatos() {
		return datos;
	}

	public void setDatos(Properties datos) {
		this.datos = datos;
	}

	public File getF() {
		return f;
	}

	public void setF(File f) {
		this.f = f;
	}
	
	
}
