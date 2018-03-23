package javaLab;

import java.util.Calendar;
import java.util.Scanner;

public class Lab1part2 {
	public static void main(String[] args) {

		final String DATE_FORMAT = "yyyy-MM-dd";
		final String DELIMITER = "-";

		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		String date1;
		String date2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two dates as YYYY-MM-DD:");
		if (!sc.hasNext(DATE_FORMAT)) { // validate the dateformat
			date1 = sc.next();
			date2 = sc.next();
		} else {
			System.out.println("Invalid date input");
			date1 = sc.next();
			date2 = sc.next();
		}
		// Initialize calendar object and convert the date string into calendar

		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		year1 = Integer.parseInt(date1.split(DELIMITER)[0]);
		year2 = Integer.parseInt(date2.split(DELIMITER)[0]);
		month1 = Integer.parseInt(date1.split(DELIMITER)[1]);
		month2 = Integer.parseInt(date2.split(DELIMITER)[1]);
		day1 = Integer.parseInt(date1.split(DELIMITER)[2]);
		day2 = Integer.parseInt(date2.split(DELIMITER)[2]);
		cal1.set(year1, month1, day1);
		cal2.set(year2, month2, day2);
		sc.close();
		// FIXME: when enter wrong format. show message for enter again.

		// Convert time (millisecond) to do the calculation. First getTime()get the Date
		// Object. Second get the time.
		long time1 = cal1.getTime().getTime();
		long time2 = cal2.getTime().getTime();
		long diff = Math.abs(time1 - time2); // get absolute value, hence no need to compare which time is larger.

		diff = diff / (1000 * 60 * 60 * 24); // convert diff to day from millisecond
		System.out.println("The difference between " + date1 + " and " + date2 + " is:" + (diff / 365) + " years, "
				+ (diff % 365 / 30) + " months, " + (diff % 365 % 30) + " days, of which a total " + diff
				+ " days of difference.");

		/*
		 * //splitting the date to year month day. hard to calculate.
		 * 
		 *
		 * if (String.valueOf(date1).length() == 8) { year1 = date1 / 10000; month1 =
		 * (date1 % 10000) / 100; day1 = (date1 % 10000) % 100; //getting year month day
		 * for date1;
		 * 
		 * if (String.valueOf(date2).length() == 8) year2 = date2 / 10000; month2 =
		 * (date2 % 10000) / 100; day2 = (date2 % 10000) % 100; //getting year month day
		 * for date2;
		 * 
		 * }
		 */

	}

}
