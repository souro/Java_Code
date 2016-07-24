package com.calendarutilsdemo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarUtilsCompare {
	public static void main(String args[]){
			   
		// create two calendar at the different dates
	   Calendar cal1 = new GregorianCalendar(2015, 8, 15);
	   Calendar cal2 = new GregorianCalendar(2008, 1, 02);

	   // compare the time values represented by two calendar objects.
	   int i = cal1.compareTo(cal2);

	   // return positive value if equals else return negative value
	   System.out.println("The result is :"+i);

	   // compare again but with the two calendars swapped
	   int j = cal2.compareTo(cal1);

	   // return positive value if equals else return negative value
	   System.out.println("The result is :" + j);
	}

}
