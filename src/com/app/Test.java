package com.app;
//reference is not important but refernce type is important
public class Test { 
	public static void main(String[] args) {
		Impli m=new Impli();
		m.implimentMethod();
	}
}
 interface Anno{
	 void ma();
	 int add(int a,int b);
 }
 class Impli{
	 String implimentMethod() {
		 Anno a=new Anno() {
			
			@Override
			public void ma() {
 				System.out.println("this is ma method");
			}
			
			@Override
			public int add(int a, int b) {
				System.out.println("sum of two numbers: "+a+b);
 				return a+b;
			}
		};
	a.add(2434, 3543);
	
	a.ma();
		return null;
		 
	 }
 }
 class ParentEx{
	 Impli i=new Impli() {
		 
		 @Override
		 String implimentMethod() {
			return null;
			 
		 }
	 };
 }
