package com.app.Java8Feautures;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeAndDateEx {

	public static void main(String[] args) {
	 LocalDate date=LocalDate.now();
	 System.out.println(date);
	 
	 LocalTime time=LocalTime.now();
	 System.out.println(time);
	 
	 LocalDateTime dateAndTime=LocalDateTime.now();
	 System.out.println(dateAndTime);
	 
	 int dd=dateAndTime.getDayOfMonth();
	 System.out.println(dd);
	 
	 Month m=dateAndTime.getMonth();
	 System.out.println(m);
	 
	 int mm=dateAndTime.getMonthValue();
	 System.out.println(mm);
	 
	 int yyyy=dateAndTime.getYear();
	 
	 System.out.printf("\ndate:%d/%d/%d", dd,mm,yyyy);
	}

}
