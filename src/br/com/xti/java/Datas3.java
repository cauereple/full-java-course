package br.com.xti.java;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		Date date = c.getTime();

		Locale brasil = new Locale("pt", "BR");
		Locale usa = Locale.US;
		Locale japao = Locale.JAPAN;
		Locale italia = Locale.ITALIAN;

		// BRASIL
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		System.out.println(f.format(date));

		// USA
		f = DateFormat.getDateInstance(DateFormat.FULL, usa);
		System.out.println(f.format(date));

		// JAPÃO
		f = DateFormat.getDateInstance(DateFormat.FULL, japao);
		System.out.println(f.format(date));

		// ITALIANO
		f = DateFormat.getDateInstance(DateFormat.FULL, italia);
		System.out.println(f.format(date));
	}

}
