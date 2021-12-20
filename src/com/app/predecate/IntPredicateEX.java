package com.app.predecate;

import java.lang.System.Logger;
import java.util.function.*;

public class IntPredicateEX {
	

	public static void main(String[] args) {
		
		IntPredicate p= i->i%2==0;
		LongPredicate lp=i->i*2==14;
		DoublePredicate dp=i->i-2==6;
		System.out.println(dp.test(8));
		  
	
	}

}
