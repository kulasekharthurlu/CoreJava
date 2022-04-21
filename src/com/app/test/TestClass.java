package com.app.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestClass {
	public static void main(String[] args) {
		String ld=LocalDate.now()+"";
		System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("MMM-yyyy")));
		LocalDate dd1=LocalDate.now();
		DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("MMM-yyyy");
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd  MMMM  yyyy");
		System.out.println(newPattern.format(dd1));
		System.out.println(dd1.format(df));
		LocalDateTime date = LocalDateTime.now();
		Date d = new Date();
		System.out.println(d);
		System.out.println(date.getMonth());
		LocalDate ltime = LocalDate.of(2022, Month.MARCH, 23);
		System.out.println(dd1.format(df));
		LocalDate dd = LocalDate.ofYearDay(2022, 9);
		LocalTime lTime = LocalTime.of(12, 30);
		LocalDateTime daTime = LocalDateTime.of(ltime, lTime);
		System.out.println(dd);
		System.out.println(daTime);
		System.out.println(ltime);
		System.out.println(lTime);
		 
	}
}
