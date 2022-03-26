package br.com.xti.refinado;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursividade {

	/* 10 + (9 + (8 + (7 + (6 + (5 ... ))))) */
	public static int soma(int x) {
		if (x == 0) {
			return x;
		} else {
			return x + soma(x - 1);
		}
	}

	/* potencia(3,4) = 3 * 3 * 3 * 3  */
	public static int potencia(int x, int e) {
		if (e == 0) {
			return x;
		} else {
			return x * potencia(x, e-1);
		}
	}
	
	public static void listar(Path path) {
		if(Files.isRegularFile(path)) {
			System.out.println(path.toAbsolutePath());
		} else {
			String s = "\n" + path.toAbsolutePath();
			System.err.println(s.toUpperCase());
			
			try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
				
				for(Path p : stream) {
					listar(p);
				}
			
			} catch (Exception e) {}
		}
	}

	public static void main(String[] args) {

		//System.out.println(soma(10));
		//System.out.println(potencia(2, 10));
		
		listar(Paths.get("/Users/cauereple/eclipse-workspace/xti"));
	}

}
