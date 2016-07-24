package com.dateutilsdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilsDemo {
	public static void main(String args[]) throws ParseException{
		//Default Date format
		Date currdate1 = new Date();
		System.out.println("currdate1: " +currdate1);
		
		//Date to String
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String currdate2 = sdf1.format(new Date());
		System.out.println("currdate2: " +currdate2);
		
		//String to Date
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String dateInString1 = "31/08/1990 10:20:56";
		Date currdate3 = sdf3.parse(dateInString1);
		System.out.println("currdate3: " +currdate3);
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("EEE MMM dd hh:mm:ss z yyyy");
		String dateInString2 = new Date().toString();
		Date currdate4 = sdf4.parse(dateInString2);
		System.out.println("currdate4: " +currdate4);
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("EEE MMM dd hh:mm:ss z yyyy");
		String dateInString3 = "Tue Aug 31 10:20:56 IST 1990";
		Date currdate5 = sdf5.parse(dateInString3);
		System.out.println("currdate5: " +currdate5);
		
		//Current Date and Time
		SimpleDateFormat sdf6 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(sdf6.format(date));
	}
}
