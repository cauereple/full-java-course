package br.com.xti.poo;

public class Conta {
	
	String cliente;
	double saldo;
	
	public Conta() {
		
	}
	
	public Conta(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public String getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void exibeSaldo() {
		System.out.println(cliente + ", seu saldo é " + saldo);
	}
	
	void saca(double valor) {

		//saldo = saldo - valor;
		saldo -= valor;	
	}
	
	void deposita(double valor) {
		saldo += valor;
	}
	
	void transferePara(Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}
}