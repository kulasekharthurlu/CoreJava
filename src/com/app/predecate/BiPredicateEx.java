package com.app.predecate;

import java.util.function.BiPredicate;

public class BiPredicateEx {

	public static void main(String[] args) {
		 BiPredicate<Integer, Integer> p=(a,c)->(a+c)%2==0;
		 System.out.println(p.test(23, 34));

	}

}
