package com.timezonedemo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneConversion {
	public static void main(String args[]){
		TimeZone timeZone = TimeZone.getTimeZone("Europe/Paris");

		Calendar calendar = new GregorianCalendar();

		//long timeHere = calendar.getTimeInMillis();
		Date timeHere = calendar.getTime();
		System.out.println("Time Here  = " + timeHere);
		System.out.println("hour     = " + calendar.get(Calendar.HOUR_OF_DAY));

		calendar.setTimeZone(timeZone);

		//long timeEu = calendar.getTimeInMillis();
		Date timeEu = calendar.getTime();
		System.out.println("Time in Europe   = " + timeEu);
		System.out.println("hour     = " + calendar.get(Calendar.HOUR_OF_DAY));
	}

}
