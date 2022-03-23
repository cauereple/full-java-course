package br.com.xti.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		fila.add("Ricardo");
		fila.add("Sandra");
		fila.offer("Beatriz");
		System.out.println(fila);
		
		System.out.println("\nEste é o próximo da fila:\n" + fila.peek());
		System.out.println("\nEstou removendo esse elemento da fila:\n" + fila.poll());
		System.out.println("\n" + fila);
		
		/* Outros métodos disponíveis em LinkedList */
		LinkedList<String> f = (LinkedList<String>) fila;
		f.addFirst("Caio"); // coloco no início da fila
		f.addLast("Juliana"); // coloco no final da fila
		System.out.println(f);
		
		System.out.println(f.peekFirst());
		System.out.println(f.peekLast());
		
		f.pollFirst();
		f.pollLast();
		System.out.println(f);
		

	}

}
