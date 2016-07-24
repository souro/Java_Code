package com.calendarutilsdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToCalendar {
	public static void main(String args[]) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "22-01-2015 10:20:56";
		Date date = sdf.parse(dateInString);
	    Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println("The Current Date is :" + calendar.getTime());
	}

}
