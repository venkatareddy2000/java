package com.java.eight.features.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTimeExample1 {

	public static void main(String[] args) {
		// Current date
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date: " + currentDate);

		// Current time
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time: " + currentTime);

		// Current date and time
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date and Time: " + currentDateTime);

		// Specific date
		LocalDate specificDate = LocalDate.of(2023, 1, 1);
		System.out.println("Specific Date: " + specificDate);

		// Specific time
		LocalTime specificTime = LocalTime.of(12, 0, 0);
		System.out.println("Specific Time: " + specificTime);

		// Specific date and time
		LocalDateTime specificDateTime = LocalDateTime.of(2023, 1, 1, 12, 0, 0);
		System.out.println("Specific Date and Time: " + specificDateTime);
	}
}
