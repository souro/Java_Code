package com.timezonedemo;

import java.util.TimeZone;

public class DefaultTimeZone {
	public static void main(String args[]){
		// create default time zone object
	   TimeZone timezonedefault = TimeZone.getDefault();      
	   // checking default time zone value          
	   System.out.println("Default time zone is :\n" + timezonedefault);
	}
}
