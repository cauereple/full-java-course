package br.com.xti.logica;

import java.util.Random;

public class CardSelection {

	public static void main(String[] args) {
		
		String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
		String[] nipes = {"Espadas", "Paus", "Copas", "Ouros"};
		
		Random r = new Random();
		
		int indiceFaces = r.nextInt(faces.length);
		String face = faces[indiceFaces];
		
		int indiceNipes = r.nextInt(nipes.length);
		String nipe = nipes[indiceNipes];
		
		
		/*
		Podemos deixar o codigo mais enxuto colocando tudo junto
		
		String face = faces[r.nextInt(faces.length)];
		String nipe = nipes[r.nextInt(nipes.length)];
		*/
		
		
		String carta = face + " de " + nipe;
		
		System.out.println(carta);
	}
}