package br.com.xti.erros;

import br.com.xti.heranca.Animal;
import br.com.xti.heranca.Cachorro;
import br.com.xti.heranca.Galinha;

public class ExcecoesComuns {
	
	static int[] arrayNull;
	static int[] arrayPosicaoInexistente = new int[0];

	public static void main(String[] args) {
		
		// NullPointerException
		System.out.println(arrayNull.length);
		
		// ArithmeticException
		int x = 5 / 0;
		
		// ArrayIndexOutOfBoundsException
		System.out.println(arrayPosicaoInexistente[1]);
		
		// ClassCastException
		Animal a = new Galinha();
		Cachorro c = (Cachorro) a;
		
		
		// NumberFormatException
		int i = Integer.parseInt("x");
		double d = Double.parseDouble("XTI");
	}

}
