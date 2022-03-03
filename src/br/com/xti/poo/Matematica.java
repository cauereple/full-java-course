package br.com.xti.poo;

public class Matematica {
	
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return o maior do dois numeros
	 */
	int maior(int um, int dois) {
		
		if(um > dois)
			return um;
		else
			return dois;
	}
	
	// também pode ser declarado assim (double[] numeros)
	double soma(String titulo, double ... numeros) {
		
		System.out.print(titulo + " ");
		double total = 0;
		for(double n : numeros)
			total += n;
		
		return total;
	}
	
	// método media de int
	double media (int x, int y) {
		System.out.print("media (int x, int y) ");
		return (x+y) / 2;
	}
	
	//método media de duas String
	double media(String x, String y) {
		System.out.print("media(String x, String y) ");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix + iy) / 2;
	}
	
	//método media de 1 int
	double media(int x) {
		System.out.print("media(int x) ");
		return x;
	}
	
	//método que recebe um numero ilimitado de numeros e calcula a media
	double media(double ... numeros) {
		System.out.print("media(double ... numeros)");
		
		return this.soma("", numeros) / numeros.length;
	}
}
