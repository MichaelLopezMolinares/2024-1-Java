package co.edu.unbosque.model;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

import co.edu.unbosque.model.persistence.Archivo;
/**
 * {@summary} Esta clase se dedica a la administracion de los equipos y sirve como una estructura para modificar el archivo de persistencia
 */
public class Campeonato {
	
	private int maxEquipos;
	private Equipo[] equipos;
	private Archivo archivo;
	/**
	 * Este es un constructor sin parametros de la clase Campeonato. es responsable de crear una instancia de la clase Archivo, leer los datos del archivo properties y cargarlos.
	 * valida las excepciones NumberFormatException, IOException y NullPointerException
	 */
	public Campeonato() {
		archivo = new Archivo();
		try {
			archivo.leerConfiguracion();
			maxEquipos = Integer.parseInt(obtenerPropiedad("campeonato.equipos"));
			equipos = new Equipo[maxEquipos];
			inicializarEquipos();
			buscarEquipo("Ejemplo");
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Hubo algun error en la lectura o No habian equipos|valores registrados");
			borrarTodo();
		} catch (NullPointerException e) {
			System.out.println("Uno de los valores del arreglo es nulo. se procedera a borrar");
			borrarTodo();
		} 
	}
	
	/**
	 * Encapsula la accion de buscar una propiedad dentro del archivo de persisitencia
	 * @param propiedad El nombre de la llave a buscar
	 */
	public String obtenerPropiedad(String propiedad) {
		return archivo.getDatos().getProperty(propiedad);
	}
	
	/**
	 * Encapsula la accion de agregar o modificar una propiedad dentro del archivo de persisitencia
	 * @param propiedad El nombre de la llave a crear o modificar'
	 * @param valor El valor de la llave a crear o modificar
	 */
	public void modificarPropiedad(String propiedad, String valor) {
		archivo.escribirPropiedades(propiedad, valor);
	}
	
	/**
	 * Encapsula la accion de eliminar una propiedad dentro del archivo de persisitencia
	 * @param propiedad El nombre de la llave a eliminar
	 */
	public void eliminarPropiedad(String propiedad) {
		archivo.getDatos().remove(propiedad);
		archivo.save();
	}
	/**
	 * Copia los datos de la persistencia y los carga dentro de un array de tipo Equipo
	 */
	public void inicializarEquipos(){
		for(int i= 0; i < maxEquipos; i++) {
			String nombre = obtenerPropiedad("campeonato.nombre"+i);
			int estrellas = Integer.parseInt(obtenerPropiedad(nombre+".estrellas"));
			equipos[i] = new Equipo(nombre, estrellas);
			
		}
	}
	
	/**
	 * Imprime los equipos existentes de modo descendiente en base las cantidades de estrellas
	 */
	public String InformacionCampeonato() {
		String info = "Cantidad de equipos: " + maxEquipos + "\n";
		int[] total = new int[maxEquipos];
		int temp = 0;
		
		for(int i = 0; i < maxEquipos; i++) {
			total[i] = equipos[i].getEstrellas();
			
		}
		
		for (int i = 0; i < maxEquipos; i++) {     
            for (int b = i+1; b < maxEquipos; b++) {     
            	if(total[i] < total[b]) {    
                    temp = total[i];    
                    total[i] = total[b];    
                    total[b] = temp;  
            	}
            }
		}
			
		for(int i = 0; i < maxEquipos; i++) {
			for(int b = 0; b < maxEquipos; b++) {
				if(total[i] == equipos[b].getEstrellas()) {
					info += (i+1) + ") " + equipos[b].getNombre() + "\n" +
				             "Estrellas: " + equipos[b].getEstrellas() + "\n";
				}
			}
		}
		return info;
	}
	
	/**
	 * Agrega un equipo a la persistencia con los atributos seleccionados y lo carga al array
	 * @param nombre nombre del equipo a crear
	 * @param estrellas la cantidad de estrellas que tendra el equipo a crear
	 * @throws NumberFormatException
	 * @return boolean
	 */
	public boolean agregarEquipo(String nombre, int estrellas) throws NumberFormatException {
	
			int pos = buscarEquipo(nombre);
			if(pos == -1) { 
				maxEquipos++;
				modificarPropiedad("campeonato.equipos", ""+maxEquipos);
				equipos = new Equipo[maxEquipos];
				modificarPropiedad("campeonato.nombre"+(maxEquipos-1), nombre);
				modificarPropiedad(nombre+".estrellas", ""+estrellas);
				inicializarEquipos(); 
				return true;
			}else {
				return false;
			}
	
		
	}
	
	/**
	 * Busca un equipo dentro de el Array equipos y retorna su posicion dentro de este. de no existir retorna -1
	 * @param nombre Nombre del equipo a buscar
	 * @throws NumberFormatException
	 * @return int
	 * 
	 */
	public int buscarEquipo(String nombre) throws NumberFormatException{
		int pos = -1;
		for(int i = 0; i < maxEquipos; i++) {
			if(equipos[i].getNombre().contains(nombre)) {
				pos = i;
			}
		}
		return pos;
	}
	
	/**
	 * Elimina un equipo existente dentro de la persistencia y el Array
	 * @param nombre Nombre del equipo a borrar
	 * @return boolean
	 */
	public boolean eliminarEquipo(String nombre) {
		int pos = buscarEquipo(nombre);
		
		if(pos != -1) {
			for (int i = pos; i < maxEquipos-1; i++) {
				equipos[i] = equipos[i+1];
			}
			maxEquipos--;
			modificarPropiedad("campeonato.equipos", ""+maxEquipos);
			for (int i = pos; i < maxEquipos; i++) {
				modificarPropiedad("campeonato.nombre"+(i), equipos[i].getNombre());
				System.out.println(equipos[i].getNombre() + "" + i);
			}
			eliminarPropiedad("campeonato.nombre"+(maxEquipos));
			eliminarPropiedad(nombre + ".estrellas");
			return true;
		} 
		return false;
	}
	
	/**
	 * Borra todos los archivos existentes dentro de la persistencia, crea una propiedad "campeonato.equipos" cpm valor 0 y guarda los cambios
	 */
	public void borrarTodo() {
		archivo.getDatos().clear();
		modificarPropiedad("campeonato.equipos", ""+0);
		archivo.save();
	}

	public int getMaxEquipos() {
		return maxEquipos;
	}

	public void setMaxEquipos(int maxEquipos) {
		this.maxEquipos = maxEquipos;
	}

	public Equipo[] getEquipos() {
		return equipos;
	}

	public void setEquipos(Equipo[] equipos) {
		this.equipos = equipos;
	}

	public Archivo getArchivo() {
		return archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}

}