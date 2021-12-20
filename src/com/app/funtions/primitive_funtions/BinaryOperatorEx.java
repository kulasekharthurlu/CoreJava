package com.app.funtions.primitive_funtions;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorEx {

	public static void main(String[] args) {
 
		BinaryOperator<String> b=(s1,s2)->s2+s1;
		System.out.println(b.apply("kulasekhar", "Thurlu"));
		
		//LongBinaryOperator
		//DoubleBinaryOperator
		IntBinaryOperator o=(i,i1)->i*i1;
		System.out.println(o.applyAsInt(9, 56));
		
		
		
	}

}
