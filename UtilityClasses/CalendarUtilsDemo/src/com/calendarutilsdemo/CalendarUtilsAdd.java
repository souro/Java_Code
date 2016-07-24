package com.calendarutilsdemo;

import java.util.Calendar;

public class CalendarUtilsAdd {
	public static void main(String args[]){
			   
	   // create a calendar
	   Calendar cal = Calendar.getInstance();
		  
	   // print current date
	   System.out.println("The current date is : " + cal.getTime());

	   // add 20 days to the calendar
	   cal.add(Calendar.DATE, 2);
	   System.out.println("2 days later: " + cal.getTime());

	   // subtract 2 months from the calendar
	   cal.add(Calendar.MONTH, -2);
	   System.out.println("2 months ago: " + cal.getTime());
	}

}
