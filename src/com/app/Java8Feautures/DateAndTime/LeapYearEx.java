package com.app.Java8Feautures.DateAndTime;

import java.time.Year;
import java.util.Scanner;

public class LeapYearEx {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter year numbet: ");
  int n=sc.nextInt();
  Year y=Year.of(n);
  if(y.isLeap())
	  System.out.printf("%d given year is leap year",n);
  else
	  System.out.printf("%d given year is not leap year",n);

	}

}
