package br.com.xti.logica;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int anterior = 0;
		int proximo = 1;
		
		/*	
		System.out.println("Escolha um número para calcular Fibonacci: ");
		Scanner s = new Scanner(System.in);
		int numeroEscolhido = s.nextInt();
		*/
		
		System.out.println(anterior);
		
		while(proximo < 145) {
			System.out.println(proximo);
		
			proximo = proximo + anterior; // próximo número fibonacci
			anterior = proximo - anterior; // atualizando o número anterior (soma - anterior)
		}
	}
}
		
		