package br.com.xti.threads;

import java.util.Random;

public class Produtor implements Runnable{

	private Random random = new Random();
	private Ponte ponte;
	public Produtor(Ponte ponte) {
		this.ponte = ponte;
	}
	
	@Override
	public void run() {
		int total = 0;
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(random.nextInt(3000));
				total += i;
				ponte.set(i);
				System.out.println("\t" + total);
			} catch (InterruptedException e) {}
			
		}
		
	}

}
