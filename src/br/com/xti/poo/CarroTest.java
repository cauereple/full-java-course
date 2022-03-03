package br.com.xti.poo;

public class CarroTest {

	public static void main(String[] args) {
		
		// primeira forma de criar um objeto (constructor vazio)
		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;
		
		// segunda forma de criar um objeto (constructor com parâmetros)
		Carro koenigsegg = new Carro("Koenigsegg CCXR", 430, 3.1);
		System.out.println(koenigsegg.modelo);

	}

}
