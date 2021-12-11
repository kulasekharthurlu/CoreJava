package com.app.predecate;

import java.util.function.Predicate;

public class StringEx {

	public static void main(String[] args) {
		 String[] s= {"kula","sekhar","ramarao","springBoot","reactJs"};
		 Predicate<String> p=s3->s3.length()>5;
		 for(String s1:s) {
			 System.out.println(p.test(s1)?s1:"this string not greater than 5   "+s1);
			 System.out.println();
		 }
	}

}
