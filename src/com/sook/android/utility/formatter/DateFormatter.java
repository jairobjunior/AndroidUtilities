package com.sook.android.utility.formatter;

public class DateFormatter {

	public static CharSequence getDayWithSuffix(int day) {
		if (day >= 1 && day <= 31) {
			if (day >= 11 && day <= 13) {
				return day + "th";
			}

			switch (day % 10) {
				case 1:
					return day + "st";
				case 2:
					return day + "nd";
				case 3:
					return day + "rd";
				default:
					return day + "th";
			}
		}
		
		throw new IllegalArgumentException("The day of the month should be between 1 and 31.");
	}
}