package com.app.funtions.primitive_funtions;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UneryOperatorEx {

	public static void main(String[] args) {
		//uneryoperator is child of funtion
		//input and output is same
		//but not recomondded
		 UnaryOperator<Integer> O= i->i*7;
		 System.out.println(O.apply(89));
		 
		 
		 
		 
		 IntUnaryOperator u=i->i+1;
		 System.out.println(u.applyAsInt(8));
		 
		 IntUnaryOperator o=i->i*i;
		 System.out.println(o.applyAsInt(80));
		 
		 System.out.println(u.andThen(o).applyAsInt(7));

	}

}
