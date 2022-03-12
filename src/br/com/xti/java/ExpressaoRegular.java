package br.com.xti.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {
		
		String padrao = "Java";
		String texto = "Java";
		
		boolean b = texto.matches(texto);
		//System.out.println(b);
		
		// o método matches é Case Sensitive
		boolean b1 = "Java".matches("java");
		//System.out.println(b1);
		
		/*
		 * MODIFICADORES
		 * (?i), Ignora maiúscula e minúscula
		 * (?x), Reconhece comentários
		 * (?m), Multilinhas, ou seja, trabalha com várias linhas
		 * (?s), Dottal
		 */
		
		boolean b2 = "Java".matches("(?i)java");
		//System.out.println(b2);
		
		/*
		 * METACARACTERES
		 * 
		 * .	faz com que nossa regular expression procure qualquer tipo de caractere
		 * \d	procura por números de 0-9
		 * \D	procura por qualquer coisa que não seja número
		 * \s	procura a ocorrência de qualquer tipo de espaço
		 */
		
		b = "2".matches("\\d");
		//System.out.println(b);
		
		// se colocarmos um a, a avaliação vai ser falsa porque um a não é um digito
		b = "a".matches("\\d");
		//System.out.println(b);
		
		// podemos fazer uma expressão para validação de CEP
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "70294-070".matches(cep);
		//System.out.println(b);
		
		/*
		 * QUANTIFICADORES
		 * 
		 * X{n}		X, exatamente n vezes
		 * X{n, }	X, pelo menos n vezes
		 * X{n, m}	X, pelo menos n mas não mais do que m vezes
		 * X?		X, 0 ou 1 vez
		 * X*		X, 0 ou + vezes
		 * X+		X, 1 ou + vezes
		 */
		
		b = "21".matches("\\d{2}");
		//System.out.println(b);
		
		// podemos fazer a validação do CEP dessa forma
		cep = "\\d{5}-\\d{3}";
		b = "70294-070".matches(cep);
		//System.out.println(b);
		
		
		// para validar uma data
		b = "27/12/1994".matches("\\d{2}/\\d{2}/\\d{4}");
		//System.out.println(b);
		
		
		/*
		 * METACARACTERE DE FRONTEIRA
		 * 
		 * ^	inicia
		 * $	finaliza
		 * |	ou
		 */
		
		// Vamos criar um padrão para saber se nosso texto começa com a palavra Pier
		
		// ou seja, queremos avaliar se nosso texto começa ^ com a palavra Pier e se ele continua com qualquer caractere . a partir dali, 0 ou + vezes *
		b = "Pier21".matches("^Pier.*");
		//System.out.println(b);
		
		b = "tem java aqui".matches(".*java.*");
		//System.out.println(b);
		
		
		/*
		 * AGRUPADORES
		 * 
		 * [...]			Agrupamento
		 * [a-z]			Agrupamento
		 * [0-9]			Alcance
		 * [a-e][i-u]		União
		 * [a-z&&[aeiou]]	Interseção
		 * [^abc]			Exceção
		 * [a-z&&[^m-p]		Subtração
		 * \x				Fuga Literal
		 * 
		 */
		
		b = "true".matches("[+T]rue | [yY]es");
		
		// validação de email simples
		b = "rh@xti.com".matches("\\w+@\\w+\\.\\w{2,3}");
		//System.out.println(b);
		
		
		
		
		/*
		 *  Queremos encontrar todas as ocorrências da palavra doce.
		 *  para isso o nosso vamos utilizar a classe Pattern que tem como método compile
		 *  poderemos então chamar o método matcher que nos retorna um objeto matcher que tem 2 métodos que utilizaremos: o find() e o group()
		 */
		
		String doce = "Qual é o Doce mais doCe que o doce?";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		
		/*
		 * SUBSTITUIÇÕES
		 */
		
		String r = doce.replaceAll("(?i)doce","DOCINHO");
		//System.out.println(r);
		
		String rato = "O rato roeu a roupa do rei de roma";
		r = rato.replaceAll("r[aeiou]", "XX");
		//System.out.println(r);
		
		
		// FORMATAÇÃO DE UM CONTÚDO COM TRANSFORMAÇÃO DE PARTE DA STRING EM VARIÁVEIS
		
		String url = "www.xti.com.br/clientes-2011.html";
		
		// construímos a nossa regex (regular expression/padrão)
		String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		
		//para transformarmos parte dessa String em variável faremos:
		re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
		
		//Então contando do www.xti.com.br que é nossa 1a variável, clientes nossa 2a variável e o ano que é nossa 3a variável
		// vamos construir agora a String para usar no método replace
		// para chamar nossa nossa variável da String fazemos $1 (cifrão e a posição da variável)
		// "http://$1/$3/$2.jsp"
		// agora fazemos a substituição que será o nosso texto.replaceAll(nossa expressão regular e a String que vamos utilizar para a substituição
		String site = url.replaceAll(re, "http://$1/$3/$2.jsp");
		System.out.println("Antes da substituição " + url);
		System.out.println("Depois da substituição " + site);
		
		
		
		
	}

}
