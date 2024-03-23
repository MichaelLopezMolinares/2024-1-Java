package co.edu.unbosque.model;

import java.util.ArrayList;
import co.edu.unbosque.model.persistence.VeterinariaDAO;

public class Veterinaria {

	private ArrayList<Mascota> clientes;
	private VeterinariaDAO veterinariaDAO;
	
	public Veterinaria() {
		clientes = new ArrayList<Mascota>();
		veterinariaDAO = new VeterinariaDAO(clientes);
	}

	public ArrayList<Mascota> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Mascota> clientes) {
		this.clientes = clientes;
	}

	public VeterinariaDAO getMascotaDAO() {
		return veterinariaDAO;
	}

	public void setMascotaDAO(VeterinariaDAO veterinariaDAO) {
		this.veterinariaDAO = veterinariaDAO;
	}
	
	public boolean adicionarMascota(String nombre, String tipo) {
		Mascota x = new Mascota(nombre, tipo);
		return veterinariaDAO.add(x);
	}
	
	public boolean eliminarMascota(String nombre, String tipo) {
		Mascota x = new Mascota(nombre, tipo);
		return veterinariaDAO.delete(x);
	}
	
	public boolean actualizarMascota(String nombre, String tipo1, String tipo2) {
		Mascota x = new Mascota(nombre, tipo1);
		Mascota y = new Mascota(nombre, tipo2);
		return veterinariaDAO.update(x, y);
	}
	
	public String obtenerListaMascotas() {
		return veterinariaDAO.getAll();
	}
	
}
