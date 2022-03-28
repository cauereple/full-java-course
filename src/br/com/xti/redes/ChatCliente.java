package br.com.xti.redes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChatCliente extends JFrame {

	JTextField textoParaEnviar;
	Socket socket;
	PrintWriter escritor;

	// Conexão com o Servidor
	public void configurarRede() {
		try {
			socket = new Socket("127.0.0.1", 6000);
			escritor = new PrintWriter(socket.getOutputStream());
		} catch (Exception e) {
		}
	}

	// Interface gráfica
	public ChatCliente() {
		super("Chat");

		Font fonte = new Font("Serif", Font.PLAIN, 26);
		textoParaEnviar = new JTextField();
		textoParaEnviar.setFont(fonte);
		JButton botao = new JButton("Enviar");
		botao.setFont(fonte);
		Container envio = new JPanel();
		envio.setLayout(new BorderLayout());
		envio.add(BorderLayout.CENTER, textoParaEnviar);
		envio.add(BorderLayout.EAST, botao);
		getContentPane().add(BorderLayout.SOUTH, envio);

		configurarRede();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 90);
		setVisible(true);

	}

	public class EnviarListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			escritor.println(textoParaEnviar.getText());
			escritor.flush();
			textoParaEnviar.setText("");
			textoParaEnviar.requestFocus();
		}
	}

	public static void main(String[] args) {

		new ChatCliente();

	}

}
