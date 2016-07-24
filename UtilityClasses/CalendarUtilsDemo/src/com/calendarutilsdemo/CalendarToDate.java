package com.calendarutilsdemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarToDate {
	public static void main(String args[]){	   
		Calendar calendar = Calendar.getInstance();
        Date date =  calendar.getTime();
	   System.out.println("The Current Date is :" + date);
	}

}
