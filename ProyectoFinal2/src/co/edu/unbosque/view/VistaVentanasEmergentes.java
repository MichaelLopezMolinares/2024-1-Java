package co.edu.unbosque.view;
import javax.swing.JOptionPane;
/**
 * {@summary} Esta clase se dedica a mostrar mensajes y recibir comandos mediante ventanas emergentes creadas con JOptionPane
 */
public class VistaVentanasEmergentes {
	
	public VistaVentanasEmergentes() {
		
	}
	/**
	 * Metodo usado para leer datos de tipo int de parte del usuario
	 * @param mensaje Mensaje para mostrar en la ventana emergente
	 * @return int
	 */
	public int leerDatoEntero(String mensaje) {
		int dato = 0;
		String aux = JOptionPane.showInputDialog(mensaje);
		dato = Integer.parseInt(aux);
		return dato;
	}
	
	public long leerDatoLong(String mensaje) {
		long dato = 0;
		String aux = JOptionPane.showInputDialog(mensaje);
		dato = Long.parseLong(aux);
		return dato;
	}
	/**
	 * Metodo usado para leer datos de tipo String de parte del usuario
	 * @param mensaje Mensaje para mostrar en la ventana emergente
	 * @return int
	 */
	public String leerDatoTexto(String mensaje) {
		String dato = "";
		dato = JOptionPane.showInputDialog(mensaje);
		return dato;
	}
	
	public char leerDatoChar(String mensaje) {
		 String dato = JOptionPane.showInputDialog(null, mensaje);
		    if (dato != null && dato.length() == 1) {
		        return dato.charAt(0);
		    } else {
		        return '\0';
	   }
	}
	public void mostrarInfo(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	
}
