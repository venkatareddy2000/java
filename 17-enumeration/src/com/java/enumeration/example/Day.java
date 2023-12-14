package com.java.enumeration.example;

public enum Day {
	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

	int day;

	Day(int day) {
		this.day = day;
	}

	public int getDay() {
		return this.day;
	}
}
