package br.com.xti.java;

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
		BufferedWriter w = Files.newBufferedWriter(path, utf8);
		
		w.write("Texto1 ");
		w.write(" Texto2");
		
		w.flush();
		w.close();
		
		
	}

}
