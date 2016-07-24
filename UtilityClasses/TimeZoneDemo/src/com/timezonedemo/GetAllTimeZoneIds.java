package com.timezonedemo;

import java.util.TimeZone;

public class GetAllTimeZoneIds {
	public static void main(String args[]) {
		// getting available Ids
		String[] availId = TimeZone.getAvailableIDs();

		// checking available Ids
		System.out.println("Available Ids(count:"+ availId.length + ") are: ");
		for (int i = 0; i < availId.length; i++) {
			System.out.println(availId[i]);
		}
	}
}
