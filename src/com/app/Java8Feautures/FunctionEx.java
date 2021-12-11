package com.app.Java8Feautures;

import java.util.function.Function;

public class FunctionEx {

	public static void main(String[] args) {
		 Function<Integer,Integer> f=i->i*i;
		        Integer result= f.apply(80);
		        System.out.println("the square the 80: "+result);

	}

}
