package com.app.Interfaces;

import java.util.function.Predicate;

public class StaticMethodEx {

	public static void main(String[] args) {
		//Static t=new Static();
		// t.m1();
		 // Test.m1();
		 //m1();
		
		
		 T.m1(); // it is possible only

	}

}
interface T{
	public static void m1() {
		System.out.println("static method ececuted");
	}
}
class Static implements T{
	 
}

 
