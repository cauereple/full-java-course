package br.com.xti.refinado;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // Nossa Annotation Cabecalho poderá ser aplicada apenas a Classes
public @interface Cabecalho {
	
	String instituicao();
	String projeto();
	String dataCriacao();
	String criador();
	int revisao() default 1;

}
