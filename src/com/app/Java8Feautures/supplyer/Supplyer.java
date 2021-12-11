package com.app.Java8Feautures.supplyer;

import java.util.Date;
import java.util.function.Supplier;

public class Supplyer {

	public static void main(String[] args) {
	 Supplier<Date> s=()->new Date();
	System.out.println( s.get());;
	}

}
