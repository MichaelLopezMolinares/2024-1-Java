package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ArchivoPropiedades {

	private Properties prop = new Properties();
    private String archivoprop = "src\\data\\datosConfiguracion.properties";

    public int escribirPropiedades(String clave, String valor) {
        try{
            prop.setProperty(clave, valor);
            prop.store(new FileOutputStream(archivoprop), null);
        }
        catch (IOException ex) {
            return -1;
        }
        return 0;
    }

    public String leerPropiedades(String clave) {
        String valor = "";
        try {
            prop.load(new FileInputStream(archivoprop));
            valor = prop.getProperty(clave);
        }
        catch (IOException ex) {
            return null;
        }
        return valor;
    }
}


