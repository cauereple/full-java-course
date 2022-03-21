package br.com.xti.java;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		
		// DATA ATUAL
		Date agora = new Date();
		System.out.println(agora);
		
		
		// DATA ESPECÍFICA DESDE 01 de Jan 1970
		Date data = new Date(1_000_000_000_000L);
		System.out.println(data);
		
		
		// MÉTODOS
		data.getTime();
		data.setTime(1_000_000_000_000L);
		System.out.println(data.compareTo(agora));
		
		
		// CALENDAR
		
		// GregorianCalendar 
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		System.out.println(c.getTime());
		
		// método recuperar
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		// método definir
		c.set(Calendar.YEAR, 1972);
		c.set(Calendar.MONTH, 2); // ou Calendar.MARCH
		c.set(Calendar.DAY_OF_MONTH, 25);
		System.out.println(c.getTime());
		
		// método limpar
		c.clear(Calendar.MINUTE);
		c.clear(Calendar.SECOND);
		System.out.println(c.getTime());
		
		
		// ADICIONAR OU REMOVER
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.YEAR, 1);
		System.out.println(c.getTime());
		
		c.add(Calendar.DAY_OF_MONTH, -1);
		c.add(Calendar.YEAR, -1);
		System.out.println(c.getTime());
		
		
		
		
		
		/* Saudação com Bom Dia (se for antes do meio dia), 
		 * Boa Tarde (se a hora atual tiver passado do meio dia) ou 
		 * Boa noite se a hora atual for superior das 18 horas */
		
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		
		System.out.println("Agora são " + hora + " horas.");
		
		if (hora <= 12) {
			System.out.println("Bom dia!");
		} else if (hora > 12 && hora < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}
		

	}

}
