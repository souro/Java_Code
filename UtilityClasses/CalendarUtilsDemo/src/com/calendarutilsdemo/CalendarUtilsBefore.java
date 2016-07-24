package com.calendarutilsdemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarUtilsBefore {
	public static void main(String args[]){

	   // create calendar objects.
	   Calendar cal = Calendar.getInstance();
	   Calendar past = Calendar.getInstance();

	   // print the current date
	   System.out.println("Current date: " + cal.getTime());

	   // change year in past calendar
	   past.set(Calendar.YEAR, 2006);
	   System.out.println("Year is " + past.get(Calendar.YEAR));

	   // check if calendar date is before current date
	   System.out.println("Before current date:" + cal.before(past));
	}

}
