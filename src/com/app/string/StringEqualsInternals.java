package com.app.string;

public class StringEqualsInternals {
	
	public static void main(String[] args) {
		String s1= "java";
		String s2= "java";
		
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1==s2);        // true
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		StringBuffer sb1=new StringBuffer("programming");
		StringBuffer sb2=new StringBuffer("programming");
		System.out.println(sb1);
		
		System.out.println(sb1.equals(sb2)); // false
		System.out.println(sb1==sb2);        // false
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		StringBuilder b1=new StringBuilder("Scala");
		StringBuilder b2=new StringBuilder("Scala");
		System.out.println(b1.equals(b2)); // false
		System.out.println(b1==b2);        // false
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		
	}
	
}
