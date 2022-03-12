package br.com.xti.java;

public class StringMutavel {

	public static void main(String[] args) {

		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("JAVA");

		int tamanho = s1.length();
		int capacidade = s1.capacity();

		System.out.println("Nossa string Java tem " + tamanho + " de tamanho e " + capacidade + " de capacidade.");

		// usamos o método append para concatenar objetos String
		s1.append(" Trabalhando ");
		
		char[] c = {'c', 'o', 'm'};
		
		s1.append(c).append(" Textos.");
		
		System.out.println(s1);
		
		
		String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();
		
		System.out.println(url);
	}

}
