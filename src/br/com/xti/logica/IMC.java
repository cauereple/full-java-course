/**
 * Calcular o IMC 
 * IMC = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros)
 */
package br.com.xti.logica;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		
		String peso = JOptionPane.showInputDialog("Qual o seu peso em quilogramas?");
		double pesoQuilogramas = Double.parseDouble(peso);
		
		String altura = JOptionPane.showInputDialog("Qual a sua altura?");
		double alturaMetros = Double.parseDouble(altura);
		
		
		/*
		System.out.println("Qual o seu peso?");
		Scanner sp = new Scanner(System.in);
		double peso = sp.nextDouble();
		
		System.out.println("Qual a sua altura?");
		Scanner sa = new Scanner(System.in);
		double altura = sa.nextDouble();
		
		double altura = 1.70;
		*/
		
		double imc = pesoQuilogramas / (alturaMetros * alturaMetros);
		double roundImc = Math.round(imc*100)/100;
		
		/*
		System.out.println("IMC = " + roundImc); 
		System.out.println(msg); 
		*/
		
		String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "Fora do peso ideal";
		msg = "IMC = " + roundImc + "\n" + msg;
		
		JOptionPane.showMessageDialog(null, msg);
		
		
		
	}
}