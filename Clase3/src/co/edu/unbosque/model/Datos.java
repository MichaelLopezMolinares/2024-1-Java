package co.edu.unbosque.model;

public class Datos {

	private int numeros[];
	private int tam;
	
	public Datos() {
		numeros = new int [10];
		tam = 10;
		inicializar();
	}
	
	public Datos(int tam) {
		numeros = new int [tam];
		this.tam = tam;
		inicializar();
	}
	
	public void inicializar() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = 0;
		}
	}
	
	public String verDatos() {
		String rta = "";
		for (int i = 0; i < numeros.length; i++) {
			rta = rta + numeros[i] + " ";
		}
		return rta;
	}
	
	public void asignarValor(int n, int pos) {
		numeros[pos] = n;
	}
	
	public int numeroMayor() {
		int mayor = Integer.MIN_VALUE;
		for (int i = 0; i < tam; i++) {
			if(numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}
		return mayor;
	}

	public int[] getNumeros() {
		return numeros;
	}

	public int getTam() {
		return tam;
	}

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}
	
	
}
