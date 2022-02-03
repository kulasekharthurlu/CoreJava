package com.app.Java8Feautures.DateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdEx {

	public static void main(String[] args) {
		 
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la=ZoneId.of("America/Los_Angeles");
		ZonedDateTime tz=ZonedDateTime.now(la);
		System.out.println(tz);
	}

}
