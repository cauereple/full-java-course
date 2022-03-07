package br.com.xti.heranca;

public class Quadrado implements AreaCalculavel{

	double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double CalculaArea() {
		return lado * lado;
	}
}
