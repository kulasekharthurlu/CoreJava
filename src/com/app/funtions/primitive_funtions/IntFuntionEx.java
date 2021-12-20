package com.app.funtions.primitive_funtions;

import java.util.function.IntFunction;

public class IntFuntionEx {

	public static void main(String[] args) {
 IntFunction<Integer> f=i->i*2;
 System.out.println(f.apply(7));
	}

}
