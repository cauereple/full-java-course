package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import br.com.xti.poo.Conta;

public class Arquivo3 {

	// 1 PASSO --> Precisamos ter um lugar para armazenar essas contas
	private Path path = Paths.get("files/contas.txt");
	// 2 PASSO --> Precisamos de um charset (que é a codificação que vamos
	// utilizar)
	private Charset utf8 = StandardCharsets.UTF_8;

	// 3 PASSO --> Criar o método armazenarContas que recebe como parâmetro um objeto Conta do tipo ArrayList
	public void armazenarContas(ArrayList<Conta> contas) throws IOException {

		/* 
		 * 4 PASSO --> fazer o try catch com o nosso BufferedWriter, percorrer
		 * nosso Array com um for each
		 * e escrever dentro do arquivo para cada conta, uma nova linha com as
		 * informações cliente e saldo
		 */
		try (BufferedWriter writer = Files.newBufferedWriter(path, utf8)) {
			for (Conta conta : contas) {
				writer.write(conta.getCliente() + ";" + conta.getSaldo() + "\n");

			}
		}

	}
	// 5 PASSO --> Criar o método recuperarContas que vai retornar um objeto conta do tipo ArrayList
	public ArrayList<Conta> recuperarContas() throws IOException {
		
		// 9 PASSO --> esse método espera o retorno de um ArrayList de contas
		ArrayList<Conta> contas = new ArrayList<>();
		
		// 6 PASSO --> fazer o try catch com o nosso BufferedReader
		try (BufferedReader reader = Files.newBufferedReader(path, utf8)) {
			
			/* 
			 * 7 PASSO --> Vamos criar um ciclo while para ler cada linha do nosso Array onde ele vai ler com o
			 * método reader.readLine() da classe String enquanto nossa line for null 
			*/
			String line = null;
			while ((line = reader.readLine()) != null) {
				// 8 PASSO --> Vamos quebrar as linha com o método split passando a regex ";"
				String[] tokens = line.split(";");
				/* 
				 * 10 PASSO --> e aqui dentro para cada linha nós vamos criar uma nova conta
				 * e dentro dessa conta vamos passar o nome do cliente tokens[0] que ja está no formato string
				 * e o saldo do cliente [1] que temos que converter para double, já que ele está vindo no formato String
				 * usaremos o Double.parseDouble(tokens[1])
				 */
				Conta conta = new Conta(tokens[0], Double.parseDouble(tokens[1]));
				
				// 11 PASSO --> agora nós podemos adicionar essa conta a nossa lista de contas
				contas.add(conta);
			}
		}
		// 12 PASSO --> e no final retornar todas as contas que estão dentro de um ArrayList
		return contas;
	}

	public static void main(String[] args) throws IOException {

		ArrayList<Conta> contas = new ArrayList<>();

		contas.add(new Conta("Ricardo", 12000.23));
		contas.add(new Conta("Lawrence", 11050.32));
		contas.add(new Conta("Sandra", 18000.21));
		contas.add(new Conta("Beatriz", 23200.09));

		Arquivo3 operacao = new Arquivo3();
		operacao.armazenarContas(contas);

		// 13 PASSO --> vamos atribuir essa variável a um ojbeto Conta do tipo Array já que o método dele retorna um ArrayList
		ArrayList<Conta> contas2 = operacao.recuperarContas();
		
		// 14 PASSO --> Agora vamos imprimir o valor de cada uma dessas contas do ArrayList com um ciclo for each
		for(Conta conta : contas) {
			// 15 PASSO --> agora podemos chamar o método exibe saldo da classe Contas.java que tornamos público para podermos chamar-lo
			conta.exibeSaldo();
		}

	}

}
