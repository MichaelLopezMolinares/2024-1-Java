package co.edu.unbosque.model;

import java.util.ArrayList;

public class Veterinaria {

	private ArrayList<Mascota> mascotas;
	private int tam;
	
	public Veterinaria() {
		mascotas = new ArrayList<Mascota>();
		inicializar();
	}
	
	public void inicializar() {
		for (int i = 0; i < mascotas.size(); i++) {
			mascotas.set(i, null);
		}
	}
	
	public String verDatos() {
		String rta = "";
		for (Mascota aux : mascotas) {
			rta += aux + "\n";
		}
		return rta;
	}
	
	public void asignarValor(String nombre, int edad, String tipo , int pos) {
		mascotas.add(new Mascota(nombre, edad, tipo));
	}
	
	public Mascota mascotaMayor() {
		Mascota mayor = mascotas.get(0);
		for (Mascota aux : mascotas) {
			if(aux.getEdad() > mayor.getEdad()) {
				mayor = aux;
			}
		}
		return mayor;
	}

	public ArrayList<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

}
