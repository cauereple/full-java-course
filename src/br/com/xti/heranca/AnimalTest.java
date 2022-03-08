package br.com.xti.heranca;

public class AnimalTest {
	
	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}

	public static void main(String[] args) {
		
		//não podemos inicializar uma classe abstrata
		//Animal generic = new Animal(0, null);
		//generico.fazerBarulho();
		
		// devemos fazer isso para solucionar o problema
		Animal generico = null;
		barulho(generico);
		
		
		Cachorro toto = new Cachorro();
		toto.fazerBarulho();
		
		Galinha carijo = new Galinha();
		carijo.fazerBarulho();
		
		barulho(toto);

	}

}
