package br.com.xti.refinado;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD}) // Nossa Annotation ErrosCorrigidos poderá ser aplicada a Classes e Métodos
public @interface ErrosCorrigidos {
	
	//String[] errosComMaisDeDoisElementos();
	//String[] errosUmElementoApenas();
	String[] value();

}
