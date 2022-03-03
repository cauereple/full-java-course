package br.com.xti.poo;

public class Galinha {
	
	public int ovos; // total de ovos do objeto Galinha
	public static int ovosDaGranja;
	
	public Galinha botar() {
		this.ovos++;
		Galinha.ovosDaGranja++;
		return this;
	}
	
	public static double mediaDeOvos(int galinhas)
	{
		return ovosDaGranja / galinhas;
	}

}
