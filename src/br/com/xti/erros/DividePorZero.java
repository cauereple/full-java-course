package br.com.xti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
	
	public static void dividir(Scanner s) {
		System.out.print("Numero: ");
		int a = s.nextInt();
		System.out.print("Divisor: ");
		int b = s.nextInt();
	
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		boolean continua = true;
		
		do {
			try {
				
				dividir(s);
				// se chegar até essa linha de código, mudamos a nossa variável para false
				// para que possa sair do ciclo
				continua = false;
				
			}
			catch(InputMismatchException | ArithmeticException e1) {
				e1.printStackTrace();
				System.err.println("Número Inválido");
				s.nextLine(); //descarta a entrada errada e libera novamente para o usuário
			}
			
		} while(continua);
		
		
		

	}
}


