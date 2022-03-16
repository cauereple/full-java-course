package br.com.xti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	public static void main(String[] args) throws IOException {
			Path path = Paths.get("./files/fonte.txt");
			
			/* VERIFICAÇÃO/CHECK DE ARQUIVOS */
			
			/* se ele existe
			System.out.println(Files.exists(path));
			
			se é um diretório
			System.out.println(Files.isDirectory(path));
			
			se é um arquivo regular
			System.out.println(Files.isRegularFile(path));
			
			se o arquivo pode ser lido pelo usuário
			System.out.println(Files.isReadable(path));
			
			se ele pode ser executado
			System.out.println(Files.isExecutable(path));
			
			qual o tamanho do arquivo (lançando Exceção)
			System.out.println(Files.size(path));
			
			quando foi a última vez que esse arquivo foi modificado
			System.out.println(Files.getLastModifiedTime(path));
			
			quem é o dono do arquivo
			System.out.println(Files.getOwner(path));
			
			procurar o tipo de arquivo que estamos olhando
			System.out.println(Files.probeContentType(path));
			*/
			
			
			
			/* EXCLUSÃO/DELETE DE ARQUIVOS */
			//Files.deleteIfExists(path);
			
			
			
			
			/* CRIAÇÃO DE ARQUIVOS */
			
			//Files.createFile(path);
			//Files.write(path, "Meu Texto".getBytes());
			
			
			
			/* CÓPIA DE ARQUIVOS */
			// uma cópia, é na verdade um outro destino
			
			Path copia = Paths.get("./files/copia.txt");
			//Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
			
			
			
			/* MOVE */
			//  Queremos mover o nosso arquivo fonte para dentro do diretório move que ainda nao existe,

			Path mover = Paths.get("files/move/fonte.txt");
			
			//  então precisamos criar esse diretório primeiro
			Files.createDirectories(mover.getParent());
			
			// e em seguida podemos mover utilizando o método move
			// Então vamos mover a nossa fonte para o mcainho informado e 
			// passaremos ainda alguns padrões de cópia como StandardCopyOption.REPLACE_EXISTING
			Files.move(path, mover, StandardCopyOption.REPLACE_EXISTING);
			
	}

}
