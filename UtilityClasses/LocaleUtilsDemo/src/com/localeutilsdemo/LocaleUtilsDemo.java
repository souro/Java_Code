package com.localeutilsdemo;

import java.util.Locale;

public class LocaleUtilsDemo {
	public static void main(String args[]){
		// Creates a locale object using one parameter to constructor
		Locale locale = new Locale("fr");	
		System.out.println("locale: "+locale);
		
		// Create a locale object using two parameters constructor
		Locale locale2 = new Locale("fr", "CANADA");
		System.out.println("locale2: "+locale2);
		
		// Create a locale object using three parameters constructor
		Locale locale3 = new Locale("no", "NORWAY", "NY");
		System.out.println("locale3: "+locale3);
		
		// A local object from Locale.Builder
		Locale localeFromBuilder = new Locale.Builder().setLanguage("en").setRegion("GB").build();
		System.out.println("localeFromBuilder: "+localeFromBuilder);
		
		//Locale from forLanguageTag method
		Locale forLangLocale = Locale.forLanguageTag("en-GB");
		System.out.println("forLangLocale: "+forLangLocale);
		
		//Using Locale Contant
		Locale localeCosnt = Locale.FRANCE;
		System.out.println("localeCosnt: "+localeCosnt);
	}
}
