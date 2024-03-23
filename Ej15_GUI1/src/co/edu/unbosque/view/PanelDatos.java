package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel{

	private JLabel e1;
	private JLabel e2;
	private JLabel e3;
	private JTextField c_num1;
	private JTextField c_num2;
	private JButton bsumar;
	private JButton brestar;
	
	public PanelDatos() {
		setBackground(Color.YELLOW);
		setLayout(null);
		setBorder(new TitledBorder("Panel de datos"));
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		e1 = new JLabel("Ingrese primer numero: ");
		e1.setBounds(50, 50, 150, 20);
		add(e1);
		
		e2 = new JLabel("Ingrese segundo numero: ");
		e2.setBounds(50, 100, 150, 20);
		add(e2);
		
		e3 = new JLabel("Operaciones: ");
		e3.setBounds(50, 150, 80, 20);
		add(e3);
		
		c_num1 = new JTextField();
		c_num1.setBounds(220, 50, 200, 20);
		add(c_num1);
		
		c_num2 = new JTextField();
		c_num2.setBounds(220, 100, 200, 20);
		add(c_num2);
		
		bsumar = new JButton("Sumar");
		bsumar.setBounds(220, 150, 80, 20);
		bsumar.setActionCommand("SUMAR");
		add(bsumar);
		
		brestar = new JButton("Restar");
		brestar.setBounds(320, 150, 80, 20);
		brestar.setActionCommand("RESTAR");
		add(brestar);
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

	public JLabel getE3() {
		return e3;
	}

	public void setE3(JLabel e3) {
		this.e3 = e3;
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
	
}
