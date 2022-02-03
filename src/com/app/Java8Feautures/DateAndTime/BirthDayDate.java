package com.app.Java8Feautures.DateAndTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class BirthDayDate {

	public static void main(String[] args) {
     LocalDate birthDay=LocalDate.of(1999, Month.JUNE, 16);
     LocalDate today=LocalDate.now();
     Period p=Period.between(birthDay, today);
     System.out.printf("my birthday : %d years %d months %d days",p.getYears(),p.getMonths(),p.getDays());
	
     LocalDate deathDay=LocalDate.of(1999, Month.JUNE, 16);
     Period p1=Period.between(today, deathDay);
     int d=p1.getYears()*365+p1.getMonths()*30+p1.getDays();
     System.out.printf("\n you will be on earth only days %d days ", d);
	
	}
	

}
