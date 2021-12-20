package com.app.funtions.primitive_funtions;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorEx {

	public static void main(String[] args) {
		//IntUnaryOperator is child of funtion 
		//input and output is same
		//it  is recomondded
		
		//DoubleUnaryOperator d=i->i*8;
		//LongUnaryOperator d=i->i*8;
		
		 IntUnaryOperator o=i->i*i;
		 System.out.println(o.applyAsInt(90));
	}

}
