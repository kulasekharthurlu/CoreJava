package com.app.Java8Feautures;

import java.time.LocalDateTime;
import java.time.Month;

public class TimeAndDateOfEx {

	public static void main(String[] args) {
		 LocalDateTime date=LocalDateTime.of(1999, Month.APRIL, 23, 12, 45);
		 System.out.println(date);
		 
		 System.out.println("After seven months: "+date.plusMonths(7));
		 System.out.println("Before seven months: "+date.minusMonths(7));

	}

}
