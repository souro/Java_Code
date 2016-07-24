package com.timezonedemo;

import java.util.TimeZone;

public class TimeZoneDstSavings {
	public static void main(String rgs[]){
		// create time zone object     
	   //TimeZone timezone = TimeZone.getTimeZone("Europe/Paris");
	   TimeZone timezone = TimeZone.getTimeZone("Asia/Calcutta");
	   // checking DST saving
	   //The getDSTSavings() method is used to return the amount of time to be added to local standard time to get local wall clock time.
	   System.out.println("DST saving is :" + timezone.getDSTSavings());
	}
}
