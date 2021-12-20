package com.app.Java8Feautures.method_reference;

public class MethodReferenceEx {
	
	public static void test() {
		for(int i=0;i<=10;i++) System.out.println("child method");
	}
	public void m2() {
		for(int i=0;i<=10;i++) System.out.println("instance method");

	}
	public int m2(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		MethodReferenceEx m=new MethodReferenceEx();
		
		// Runnable r= MethodReferenceEx::test;
		 Runnable r= m::m2;
		 Thread t=new Thread(r);
		 t.start();

	}

}
