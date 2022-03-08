package br.com.xti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		boolean continua = true;
		
		do {
			try {
				
				System.out.print("Numero: ");
				int a = s.nextInt();
				System.out.print("Divisor: ");
				int b = s.nextInt();
			
				System.out.println(a / b);
				// se chegar até essa linha de código, mudamos a nossa variável para false
				// para que possa sair do ciclo
				continua = false;
				
			}
			catch(InputMismatchException e1) {
				System.err.println("Números devem ser inteiros");
				s.nextLine(); //descarta a entrada errada e libera novamente para o usuário
			}
			catch(ArithmeticException e2) {
				System.err.println("Divisor deve ser diferente de Zero");
			}
			
		} while(continua);
		
		
		

	}
}


