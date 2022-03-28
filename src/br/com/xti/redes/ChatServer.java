package br.com.xti.redes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

	public ChatServer() {
		
		ServerSocket server;
		
		// Scanner leitor;
		try {
			server = new ServerSocket(6500);
			while (true) {
				Socket socket = server.accept();
				new Thread(new EscutaCliente(socket)).start();
				// leitor = new Scanner(s.getInputStream());
				// System.out.println(leitor.nextLine());
			}
		} catch (IOException e) {
		}
	}

	private class EscutaCliente implements Runnable {

		String texto;
		Scanner leitor;

		public EscutaCliente(Socket socket) {
			try {
				leitor = new Scanner(socket.getInputStream());
			} catch (Exception e) {
			}
		}

		@Override
		public void run() {
			try {
				while ((texto = leitor.nextLine()) != null) {
					System.out.println(texto);
				}
			} catch (Exception x) {
			}

		}

	}

	public static void main(String[] args) {

		new ChatServer();
	}

}
