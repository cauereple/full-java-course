package br.com.xti.poo;

public class CarroTest {

	public static void main(String[] args) {
		
		// primeira forma de criar um objeto (constructor vazio)
		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;
		
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 360;
		ferrari.motor = v12; // adiciona o Motor ao Carro
		
		// segunda forma de criar um objeto (constructor com parâmetros)
		Carro koenigsegg = new Carro("Koenigsegg CCXR", 430, 3.1);
		System.out.println(koenigsegg.modelo);
		
		Motor v8 = new Motor("v8", 1018);
		koenigsegg.motor = v8;
		
		System.out.println(koenigsegg.motor.potencia + " cavalos de potência");
		
		
		
		Carro bugatti = new Carro("Bugatti Veyron", 430, 2.2, new Motor("W16", 1200));
		
		System.out.println(bugatti.modelo);
		System.out.println(bugatti.motor.potencia + " cavalos de potência");

	}

}
