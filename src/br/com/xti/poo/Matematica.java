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
	
	double somma(double um, double dois) {
		double s = um + dois;
		return s;
	}

}
