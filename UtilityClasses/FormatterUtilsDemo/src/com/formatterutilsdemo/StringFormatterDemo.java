package com.formatterutilsdemo;

import java.util.Date;

public class StringFormatterDemo {
	public static void main(String args[]) {

		String formattedString = String.format(
				"Order with OrdId : %d and Amount: %d is missing", 40021, 3000);
		System.out.println(formattedString);

		System.out.printf(
				"Order with OrdId : %d  and Amount: %d is missing \n", 40021,
				3000);

		// %s is used to denote String arguments in formatted String
		String str = String.format("Hello %s", "Raj");
		System.out.println(str);

		// Formatting date in String format method - date in MM/dd/yy
		str = String.format("Today is %tD", new Date());
		System.out.println(str);

		Date today = new Date();
		System.out.printf("Date in dd/mm/yy format %td/%tm/%ty %n", today,
				today, today);

		// difference between %td and %te is that
		// %td use leading zero while %te doesn't
		System.out.printf("Today is %tB %te, %tY %n", today, today, today,
				today);

		// adding leading zero in numbers using String format,
		// %d is for decimal, 8 specify formatted number should be 8 digit and 0
		// specify use
		// leading zero, default is space, so if you don't specify leading
		// character space will be used.
		System.out.printf("Amount : %08d %n", 221);

		// printing positive and negative number using String format
		// + sign for positive, - for negative and %n is for new line

		System.out.printf("positive number : +%d %n", 1534632142);
		System.out.printf("negative number : -%d %n", 989899);

		// printing floating point number with System.format()
		System.out.printf("%f %n", Math.E);

		// 3 digit after decimal point
		System.out.printf("%.3f %n", Math.E);

		// 8 charcter in width and 3 digit after decimal point
		System.out.printf("%8.3f %n", Math.E);

		// adding comma into long numbers
		System.out.printf("Total %,d messages processed today", 10000000);
	}

}
