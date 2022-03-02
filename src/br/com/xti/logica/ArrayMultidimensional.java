package br.com.xti.logica;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		
		//Array de uma dimensão
		String[] uma = {"Ricardo", "Sandra", "Beatriz", "Lawrence", "Laura", "Juliana"};
		
		//Array de duas dimensões
		String[][] duas = 
		{
			{"Ricardo", "M", "DF"},
			{"Sandra", "F", "MG"},
			{ "Beatriz", "F", "DF"},
			{"Lawrence", "M", "PA"},
			{ "Laura", "F", "PA"},
			{"Juliana", "F", "SP"}
		};
		
		System.out.println(uma[2]);
		System.out.println(duas[3][0]);
		
		// Quantos elementos tem dentro da primeira dimensão do nosso Array
		System.out.println(duas.length);
		
		// Quantos elementos tem dentro do primeiro elemento Array dentro do nosso Array
		System.out.println(duas[0].length);
		
		// Trocando o primeiro elemento dentro do segundo Array dentro do nosso Array
		System.out.println("\nAntes de alterar o array duas[1][0]");
		System.out.println(duas[1][0] + "\n");
		duas[1][0] = "SANDRA";
		System.out.println("Depois de alterar o array duas[1][0]");
		System.out.println(duas[1][0]);
		
	}
}