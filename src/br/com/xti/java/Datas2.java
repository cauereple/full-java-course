package br.com.xti.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {

	public static void main(String[] args) throws ParseException {
		
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		Date date = c.getTime();
		// formatação padrão (do jeito que vem)
		System.out.println(date);
		
		
		// FORMATAÇÃO DE DATAS
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(date)); // depois de formatado
		
		
		// FORMATAÇÃO DE HORA
		f = DateFormat.getTimeInstance();
		System.out.println(f.format(date));
		
		
		// FORMATAÇÃO DE DATA E HORA
		f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(date));
		
		
		// ESTILOS
		f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(f.format(date));
		
		
		// CONVERSÃO STRING PARA DATE
		Date data2 = f.parse("12/02/1980");
		System.out.println(data2);
		
		
		
		// MÉTODO SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(date));
		System.out.println(sdf.parse("10/10/2010"));
	}

}
