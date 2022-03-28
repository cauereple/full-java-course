package br.com.xti.redes;

import java.net.Socket;
import java.util.Scanner;

public class ConselhosCliente {

	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("127.0.0.1", 6000);
		Scanner s = new Scanner(socket.getInputStream());
		System.out.println("Mensagem: " + s.nextLine());
		s.close();
	}

}
