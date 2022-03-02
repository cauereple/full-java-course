package br.com.xti.logica;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaProdutos {
	
	public static void main(String[] args) {
		
		// PASSO 1 
		//Criar um ArrayList dos produtos
		ArrayList<String>	 produtos = new ArrayList<String>();
		
		// PASSO 2
		// Utilizar Scanner para ver o que o usuário está escrevendo 
		Scanner s = new Scanner(System.in);
		
		// PASSO 3
		// Explicar ao usuário do que se trata o programa
		System.out.println("Liste seus Produtos (para sair digite FIM)");
		
		// PASSO 4
		// Coletar os produtos que o usuário está digitando e adicionar no ArrayList
		
		// inicializando uma variável
		String produto;
		
		// coletando o produto
		//produto = s.nextLine();    em vez de fazer essa instrução aqui, podemos passar para dentro do parâmetro do While
		
		// caso esse nosso produto seja diferente da palavra FIM, vamos adicionar à nossa lista de produtos esse produto que foi digitado pelo usuário e no final vamos imprimir todos os produtos do nosso ArrayList utilizando o método toString(). 
		// Para fazer a comparação de valores de um objeto, usamos o metodo .equals() que irá comparar duas String
		
		while(!"FIM".equals(produto = s.nextLine()))
			produtos.add(produto);
			
		System.out.println(produtos.toString());
		
		// então eu atribuí o valor lido na tela do meu sistema à variável produto e depois de fazer essa operação eu comparo o valor de produto com a palavra FIM e se essa operação for negativa eu adiciono aquele produto na minha lista, senão eu nao adiciono. 
	}
}