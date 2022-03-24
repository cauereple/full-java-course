package br.com.xti.colecao;

public class Generico <E> {
	
	E elemento;
	
	public void setElemento(E elemento) {
		this.elemento = elemento;
	}
	
	public E getElemento() {
		return elemento;
	}

	public static void main(String[] args) {
		
		Generico <String> g = new Generico<>();
		g.setElemento("Lagoa Paranoá");
		System.out.println(g.getElemento().toUpperCase());
	}

}
