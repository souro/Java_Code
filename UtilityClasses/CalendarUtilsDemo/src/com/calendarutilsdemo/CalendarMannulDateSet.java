package com.calendarutilsdemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMannulDateSet {
	public static void main(String args[]){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
		
		Calendar calendar = new GregorianCalendar(2013,1,24,11,24,56);	
		System.out.println("#1. " + sdf.format(calendar.getTime()));

		//update a date
		calendar.set(Calendar.YEAR, 2016);
		calendar.set(Calendar.MONTH, 7);
		calendar.set(Calendar.MINUTE, 42);
			
		System.out.println("#2. " + sdf.format(calendar.getTime()));
	}

}
