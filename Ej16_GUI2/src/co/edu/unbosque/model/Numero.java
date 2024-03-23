package co.edu.unbosque.model;

public class Numero {

	private double num;
	
	public Numero() {
		num = 0.0;
	}
	
	public double sumar(Numero otro) {
		return num + otro.num;
	}
	
	public double restar(Numero otro) {
		if(num < otro.num) {
			return otro.num - num;
		}else {
			return num - otro.num;
		}
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}
	
}
