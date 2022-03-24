package br.com.xti.threads;

public class PingPongRunnable implements Runnable{

	String palavra;
	long tempo;

	public PingPongRunnable(String palavra, long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
	}

	public static void main(String[] args) {

		Runnable ping = new PingPongRunnable("ping", 1500);
		Runnable pong = new PingPongRunnable("PONG", 2000);
		
		new Thread(ping, "ping").start();
		new Thread(pong, "pong").start();

		System.out.println("Ver Thread");

	}

	@Override
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				System.out.println(palavra);
				Thread.sleep(tempo);
			}
			
		} catch (InterruptedException e) {
			
			return;
		}
	}

}