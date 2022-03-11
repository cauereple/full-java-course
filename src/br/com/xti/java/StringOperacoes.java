package br.com.xti.java;

public class StringOperacoes {

	public static void main(String[] args) {
		
		String s1 = "Write Once";
		String s2 = s1 + " Run AnyWhere";
		String s3 = new String("Java Virtual Machine");
		
		char[] array = {'J', 'a', 'v', 'a'};
		String s4 = new String(array);
		System.out.println(s4);
		
		
		// OPERAÇÕES
		int tamanho = s1.length();
		char letra = s1.charAt(0); // 0 a length() -1
		String texto = s1.toString();
		
		
		// LOCALIZAÇÃO
		int posicao1 = s3.indexOf('J');
		System.out.println(posicao1);
		
		int posicao2 = s3.indexOf("Virtual");
		System.out.println(posicao2);
		
		int ultima = s3.lastIndexOf('a');
		System.out.println(ultima);
		
		
		// COMPARAÇÃO
		String xti = "XTI";
		boolean x = xti.equals("xti");
		System.out.println(x);
		
		boolean y = xti.equalsIgnoreCase("xti");
		System.out.println(y);
		
		boolean z = xti.startsWith("XT");
		System.out.println(z);
		
		int c = "amor".compareTo("bola");
		System.out.println(c);
		
		String so = "Olhe, olhe!";
		boolean o1 = so.regionMatches(6, "Olhe", 0, 4);// Não ignora o Case sensitive
		boolean o2 = so.regionMatches(true, 6, "Olhe", 0, 4); // Ignora o Case sensitive
		System.out.println(o1);
		
		
		
		
		
		
		

	}

}
