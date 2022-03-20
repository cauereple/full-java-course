package br.com.xti.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.xti.poo.Conta;

public class Serializa {

	public static void main(String[] args) throws Exception {
		
//		String[] nomes = {"Ricardo", "Beatriz", "Sandra"};
		
		/* ESCRITA DE OBJETO */
//		FileOutputStream fos = new FileOutputStream ("files/objeto.ser");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(nomes);
//		oos.close();
		
		
		
		/* LEITURA DE OBJETO */
//		FileInputStream fis = new FileInputStream("files/objeto.ser");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		String[] nomes1 = (String[]) ois.readObject();
//		ois.close();
//		System.out.println(Arrays.toString(nomes1));
		
		
		
		
		Conta conta1 = new Conta("XTI", 111_222_333.444);
		Conta conta2 = new Conta("BIR", 111_222_333.444);
		
		/* ESCRITA DE OBJETO */
		FileOutputStream fos = new FileOutputStream("files/objetoConta.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(conta1);
		oos.writeObject(conta2);
		oos.close();
		
		
		/* LEITURA DE OBJETO */
		FileInputStream fis = new FileInputStream("files/objetoConta.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Conta c1 = (Conta) ois.readObject();
		Conta c2 = (Conta) ois.readObject();
		ois.close();
		
		c1.exibeSaldo();
		c2.exibeSaldo();
	}

}
