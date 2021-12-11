package com.app.ternaryoperator;

import java.util.function.Predicate;

public class Lamda {

	public static void main(String[] args) {
		Predicate<Integer> p=i->i%2!=0;
		System.out.println(p.test(90)?"this is even":"this is not even ");
		String name="kulasekhar";
		String result=name.isEmpty()?"kala":name;
		System.out.println(result);




	}

}
