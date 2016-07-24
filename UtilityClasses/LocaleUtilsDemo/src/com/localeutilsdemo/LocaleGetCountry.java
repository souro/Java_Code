package com.localeutilsdemo;

import java.util.Locale;

public class LocaleGetCountry {
	public static void main(String args[]){
		// create a new locale
	   Locale locale = new Locale("ENGLISH", "US");

	   // print this locale
	   System.out.println("Locale1:" + locale);

	   // print the country of this locale
	   System.out.println("Country:" + locale.getCountry());
	}
}
