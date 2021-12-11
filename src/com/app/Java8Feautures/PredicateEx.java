package com.app.Java8Feautures;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		Integer c=99;
		Predicate<Integer> p=i->i%2==0;
		boolean returnValue=  p.test(c);
		if(returnValue)
			System.out.println("given number is Even Number");
		else
			System.out.println("given number is not Even Number");

	}

}
