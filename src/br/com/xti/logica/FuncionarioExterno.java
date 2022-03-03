package br.com.xti.logica;

import br.com.xti.poo.Funcionario;

// Teste externo (fora do pacote da classe Funcionario)
public class FuncionarioExterno {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.nome = "Ricardo";
		f.getNome();
	}

}
