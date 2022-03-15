package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("files/texto.txt");
		Charset utf8 = StandardCharsets.UTF_8;

		/* ESCRITA */
		try (BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
			w.write("Texto\n");
			w.write("Outro Texto");
			/*
			 * Não precisamos chamar o método flush() porque o nosso método close() o chama
			 * automaticamente, fazendo com que a chamada do flush() fosse desnecessária
			 * w.flush();
			 */

		} catch (IOException e) {
			e.printStackTrace();
		} /*
			 * todos os objetos que implementam a interface Closeable a partir do JAVA 7,
			 * não precisam mais usar o bloco finally para fechar a nossa conexão
			 * 
			 * finally { if (w != null) { w.close(); }
			 * 
			 * }
			 */

		/* LEITURA */
		try (BufferedReader reader = Files.newBufferedReader(path, utf8)) {
			String linha = null;
			while ((linha = reader.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
