package com.app.funtions.primitive_funtions;

import java.util.function.ToIntFunction;

public class ToIntFunctionEx {

	public static void main(String[] args) {
		 ToIntFunction<String> f=i->i.length();
		 System.out.println(f.applyAsInt("kulasekhar"));

	}

}
