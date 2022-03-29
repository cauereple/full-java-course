package br.com.xti.redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServer {
	
	List<PrintWriter> escritores = new ArrayList<>();

	public ChatServer() {
		
		ServerSocket server;
		
		// Scanner leitor;
		try {
			server = new ServerSocket(6500);
			while (true) {
				Socket socket = server.accept();
				new Thread(new EscutaCliente(socket)).start();
				PrintWriter p = new PrintWriter(socket.getOutputStream());
				escritores.add(p);
				// leitor = new Scanner(s.getInputStream());
				// System.out.println(leitor.nextLine());
			}
		} catch (IOException e) {
		}
	}

	private void encaminharParaTodos(String texto) {
		for(PrintWriter w : escritores) {
			try {
				w.println(texto);
				w.flush();
			} catch(Exception e) {}
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
					encaminharParaTodos(texto);
				}
			} catch (Exception x) {
			}

		}

	}

	public static void main(String[] args) {

		new ChatServer();
	}

}
