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
		
		System.out.println(titulo);
		double total = 0;
		for(double n : numeros)
			total += n;
		
		return total;
	}

}
