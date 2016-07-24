package com.localeutilsdemo;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class LocaleSensitiveDemo {
	public static void main(String args[]){
		long number = 5000000L;
		
		NumberFormat numberFormatDefault = NumberFormat.getInstance();
		System.out.println("Number Format using Default Locale: "+numberFormatDefault.format(number));
		
		NumberFormat numberFormatLocale = NumberFormat.getInstance(Locale.ITALY);
		System.out.println("Number Format using ITALY Locale: "+numberFormatLocale.format(number));
		
		NumberFormat numberFormatDefaultCurrency = NumberFormat.getCurrencyInstance();
		System.out.println("Currency Format using Default Locale: "+numberFormatDefaultCurrency.format(number));
		
		NumberFormat numberFormatLocaleCurrency = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println("Currency Format using ITALY Locale: "+numberFormatLocaleCurrency.format(number));
		
		Currency currency = Currency.getInstance(Locale.CHINA);
		System.out.println(currency.getDisplayName()+" ("+currency.getCurrencyCode()+") "+currency.getDisplayName());
		
		Date currentDate = new Date();
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);
		System.out.println("Date Format in German Locale: "+dateFormat.format(currentDate));
	}
}
