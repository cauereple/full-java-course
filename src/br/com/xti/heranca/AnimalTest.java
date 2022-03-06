package br.com.xti.heranca;

public class AnimalTest {
	
	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}

	public static void main(String[] args) {

		Animal generico = new Animal(0, null);
		generico.fazerBarulho();
		
		Cachorro toto = new Cachorro();
		toto.fazerBarulho();
		
		Galinha carijo = new Galinha();
		carijo.fazerBarulho();
		
		barulho(toto);

	}

}
