package br.com.xti.poo;

public class ContaTest {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.cliente = "Ricardo";
		conta.saldo = 10_000.00;
		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Caue";
		destino.saldo = 8000;
		destino.exibeSaldo();
		
		conta.transferePara(destino, 1550);
		conta.exibeSaldo();
		destino.exibeSaldo();
		

	}

}
