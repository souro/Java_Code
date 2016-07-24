package com.timezonedemo;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneOffset {
	public static void main(String args[]){
		// create time zone object     
	   TimeZone timezone = TimeZone.getTimeZone("Asia/Calcutta");
	      
	   // checking offset value for date 
	   //The method call returns the amount of time in milliseconds to add to UTC to get local time.
	   System.out.println("Offset value:" + 
	   timezone.getOffset(Calendar.ZONE_OFFSET));
	   
	}
}
