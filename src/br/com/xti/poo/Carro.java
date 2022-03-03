package br.com.xti.poo;

public class Carro {
	
	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	
	// Constructor vazio
	public Carro() {
		
	}
	
	// Constructor com parâmetros e com as variáveis inicializadas dentro
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
	}

}
