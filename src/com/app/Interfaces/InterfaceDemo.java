package com.app.Interfaces;

public class InterfaceDemo {

	public static void main(String[] args) {
		 
	}

}
interface Test{
	int i=90;   //int i=90;=public static final int i=90;
	void m1();   // void m1();=public abstract void m1();
	void m2();
	default void m3() {
		System.out.println("default method..");
	}
	private int m4() {
		System.out.println("private method...");
		return 0;
		
	}
   public	static void m5() {
		System.out.println("static method...");
	}
   
   //main method is also plased in interface
   public static void main(String[] args) {
	System.out.println("this is main method");
}
	
}
