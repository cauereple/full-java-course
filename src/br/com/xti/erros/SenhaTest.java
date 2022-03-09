package br.com.xti.erros;

public class SenhaTest {
	
	static void autenticar(String senha) throws SenhaInvalidaException {
		if("123".equals(senha)) {
			//autenticado
			System.out.println("Atenticado");
		} else {
			//senha incorreta
			throw new SenhaInvalidaException("Senha incorreta");
		}
	}

	public static void main(String[] args) {
		
		try {
			autenticar("1234");
		} catch(SenhaInvalidaException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}	

}
