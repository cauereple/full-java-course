package br.com.xti.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {

	public static void main(String[] args) {
		
		Collection<String> c = new ArrayList<>();
		c.add("A");
		c.add("E");
		c.add("I");
		System.out.println(c.toString());
		System.out.println(c.isEmpty());
		System.out.println(c.contains("A"));
		
		c.remove("A");
		System.out.println(c.toString());
		
		
		/* Grupos de Elementos */
		Collection<String> c2 = Arrays.asList("O", "U");
		System.out.println(c2.toString());
		c.addAll(c2);
		System.out.println(c.toString());
		System.out.println(c.containsAll(c2)); // verifica se existem todos esses elementos
		
		c.removeAll(c2);
		System.out.println(c.toString());
		
		
		/* Percorrer os elementos de uma Coleção com um foreach */
		for(String string : c) {
			System.out.println(string);
		}
		
		String[] s = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(s));
		
		
		c.clear(); // Limpa toda a nossa coleção
		System.out.println(c);
	}

}
