package co.edu.unbosque.model;

public class Veterinaria {

	private Mascota mascotas[];
	private int tam;
	
	public Veterinaria() {
		mascotas = new Mascota [3];
		tam = 3;
		inicializar();
	}
	
	public Veterinaria(int tam) {
		mascotas = new Mascota [tam];
		this.tam = tam;
		inicializar();
	}
	
	public void inicializar() {
		for (int i = 0; i < mascotas.length; i++) {
			mascotas[i] = null;
		}
	}
	
	public String verDatos() {
		String rta = "";
		for (int i = 0; i < mascotas.length; i++) {
			rta = rta + mascotas[i] + "\n";
		}
		return rta;
	}
	
	public void asignarValor(String nombre, int edad, String tipo , int pos) {
		mascotas[pos] = new Mascota(nombre, edad, tipo);
	}
	
	public Mascota mascotaMayor() {
		Mascota mayor = mascotas[0];
		for (int i = 1; i < tam; i++) {
			if(mascotas[i].getEdad() > mayor.getEdad()) {
				mayor = mascotas[i];
			}
		}
		return mayor;
	}

	public Mascota[] getMascotas() {
		return mascotas;
	}

	public void setMascotas(Mascota[] mascotas) {
		this.mascotas = mascotas;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}
	
}
