package com.app.Java8Feautures.method_reference;


interface inter{
	void add(int a,int b );
}
public class Test {

	public static void  sum(int a, int b) {
		System.out.println("static method : "+a+b);
	}
	
	public static void main(String[] args) {
		
		//method parameters must be matched remaining not required
		
		inter in=(a,b)->System.out.println("sum of numbers: "+a+b);
		in.add(9, 56);
		
		inter i1=Test::sum;
		i1.add(78, 89);
		
		
		 
	}

}
