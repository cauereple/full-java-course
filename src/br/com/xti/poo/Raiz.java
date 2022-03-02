package br.com.xti.poo;

public class Raiz {
	
	/**
	 * 
	 * @param numero
	 * @return a raiz segundo a equação de Pell
	 */
	int raiz(int numero) {
		
		int raiz = 0, impar = 1;
		while(numero >= impar) {
			numero -= impar;
			impar += 2;//proximo numero impar
			++raiz;
		}
		return raiz;
	}
}