package br.com.xti.refinado;

import java.io.Serializable;

// Jeito errado de se fazer
/*
 * Instituição:		Universidade XTI
 * Projeto: 		Sistema de Avaliações
 * Data de Criação:	27/03/2022
 * Criador:			Cauê Rizzo Reple
 * Revisão:			2
 */


// Jeito certo de se fazer
@Cabecalho(
		instituicao = "Universidade XTI",
		projeto = "Sistema de Avaliações",
		dataCriacao = "27/03/2022",
		criador =	"Cauê Rizzo Reple",
		revisao =	2
)

//@ErrosCorrigidos(errosComMaisDeDoisElementos = {"0001", "0002"})
//@ErrosCorrigidos(errosUmElementoApenas = "0001")
@ErrosCorrigidos("0001")
@SuppressWarnings({"serial", "unused"})
public class Anotacao implements Serializable{
	
	//@SuppressWarnings("unused")
	private int x;

	//@SuppressWarnings("unused")
	@Deprecated //esse método deixará de ser usado no futuro ou desaparecerá
	private void anotar() {}
	
	@Override
	public String toString() {
		return null;
	}

}
