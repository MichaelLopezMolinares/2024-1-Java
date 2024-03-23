package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel{

	private JLabel e1;
	private JLabel e2;
	private JTextField c_num1;
	private JTextField c_num2;
	private JButton bsumar;
	private JButton brestar;
	private JButton bmultiplicar;
	private JButton bdividir;
	
	public PanelDatos() {
		setBackground(new Color(243, 100, 13));
		setLayout(new GridLayout(4, 2));
		setBorder(new TitledBorder("Panel de datos"));
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		e1 = new JLabel("N1:");
		add(e1);
		
		c_num1 = new JTextField();
		add(c_num1);
		
		e2 = new JLabel("N2:");
		add(e2);
		
		c_num2 = new JTextField();
		add(c_num2);
		
		bsumar = new JButton("Sumar");
		bsumar.setActionCommand("SUMAR");
		add(bsumar);
		
		brestar = new JButton("Restar");
		brestar.setActionCommand("RESTAR");
		add(brestar);
		
		bmultiplicar = new JButton("Multiplicar");
		bmultiplicar.setActionCommand("MULTIPLICAR");
		add(bmultiplicar);
		
		bdividir = new JButton("Dividir");
		bdividir.setActionCommand("DIVIDIR");
		add(bdividir);
	}

	public JLabel getE1() {
		return e1;
	}

	public void setE1(JLabel e1) {
		this.e1 = e1;
	}

	public JLabel getE2() {
		return e2;
	}

	public void setE2(JLabel e2) {
		this.e2 = e2;
	}

	public JTextField getC_num1() {
		return c_num1;
	}

	public void setC_num1(JTextField c_num1) {
		this.c_num1 = c_num1;
	}

	public JTextField getC_num2() {
		return c_num2;
	}

	public void setC_num2(JTextField c_num2) {
		this.c_num2 = c_num2;
	}

	public JButton getBsumar() {
		return bsumar;
	}

	public void setBsumar(JButton bsumar) {
		this.bsumar = bsumar;
	}

	public JButton getBrestar() {
		return brestar;
	}

	public void setBrestar(JButton brestar) {
		this.brestar = brestar;
	}

	public JButton getBmultiplicar() {
		return bmultiplicar;
	}

	public void setBmultiplicar(JButton bmultiplicar) {
		this.bmultiplicar = bmultiplicar;
	}

	public JButton getBdividir() {
		return bdividir;
	}

	public void setBdividir(JButton bdividir) {
		this.bdividir = bdividir;
	}
	
}
