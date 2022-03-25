package br.com.xti.threads;

public class ContaConjunta {

	private int saldo = 100;

	public int getSaldo() {
		return saldo;
	}

	// método que simula uma operação de saque
	public synchronized void sacar(int valor, String cliente) {
		if (saldo >= valor) {
			int saldoOriginal = saldo;
			System.out.println(cliente + " vai sacar");
			try {
				System.out.println(cliente + " esperando");
				Thread.sleep(1000); // aguardando o processamento dessa solicitação de saque
			} catch (InterruptedException e) {
			}
			saldo -= valor;
			String msg = cliente + " SACOU " + valor + " [Saldo Original=" + saldoOriginal + ", Saldo Final=" + saldo
					+ "]";
			System.out.println(msg);
		} else {
			System.out.println("Saldo insuficiente " + cliente);
		}

	}

}
