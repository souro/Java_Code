package com.timezonedemo;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneDemo {
	public static void main(String args[]){
		Calendar calendar = new GregorianCalendar();
		TimeZone timeZone = calendar.getTimeZone();
		System.out.println("Time Zone Details ID: "  +timeZone.getID()+ "    Name: " +timeZone.getDisplayName());
	}
}
