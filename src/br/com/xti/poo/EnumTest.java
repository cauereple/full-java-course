package br.com.xti.poo;

public class EnumTest {
	
	public static void main(String[] args) {
		
		System.out.println(PecasXadrez.BISPO);
		
		for(Medida m : Medida .values())
			System.out.println(m + " : " + m.titulo);
	}

}
