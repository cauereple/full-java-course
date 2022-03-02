package br.com.xti.logica;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Informe o raio: ");
		double raio = s.nextDouble();
		
		double pi = Math.PI;
		double diametro = 2 * raio;
		double circunferencia = 2 * pi * raio;
		double roundCircunferencia = Math.round(circunferencia*100)/100;
		double area = pi * (raio * raio);
		double roundArea = Math.round(area*100)/100;
		
		System.out.println("Diametro: " + diametro);
		System.out.println("Circunferencia: " + roundCircunferencia);
		System.out.println("Area: " + roundArea);		
	}
}