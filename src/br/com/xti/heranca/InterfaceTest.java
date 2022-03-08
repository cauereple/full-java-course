package br.com.xti.heranca;

public class InterfaceTest {
	
	public static void area(AreaCalculavel o) {
		System.out.println(o.calculaArea());
	}
	
	public static void volume(VolumeCalculavel o) {
		// da mesma forma, ignora a forma como foi implementado o método.
		// ele sabe simplesmente que se ele chamar esse método, a classe que ele recebeu (independente de qual classe seja), ela vai ser capaz de calcular seu proprio volume
		System.out.println(o.calcularVolume());
	}

	public static void main(String[] args) {

		//Quadrado q = new Quadrado(2);
		//AreaCalculavel a = q;
		area(new Quadrado(2));
	}

}
