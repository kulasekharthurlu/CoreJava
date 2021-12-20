package com.app.funtions.primitive_funtions;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFuntionEx {

	public static void main(String[] args) {
		 
		IntToDoubleFunction f=i->Math.sqrt(i);
		System.out.println(f.applyAsDouble(7));

	}

}
