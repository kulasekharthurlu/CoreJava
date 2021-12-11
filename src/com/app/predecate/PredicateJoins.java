package com.app.predecate;

import java.util.function.Predicate;

public class PredicateJoins {

	public static void main(String[] args) { 
		int []i= {56,78,45,34,2,312,43};
		Predicate<Integer> p1=k->k%2==0;
		Predicate<Integer> p2=k->k>40;
		for(Integer nu:i) {
			//System.out.println(p1.and(p2).test(nu)?"number is even and >90:  "+nu:" ");
			//System.out.println(p1.or(p2).test(nu)?"number is even and >90:  "+nu:" ");
			System.out.println(p1.negate().test(nu)?"number is even and >90:  "+nu:"");
		}
	}

}
