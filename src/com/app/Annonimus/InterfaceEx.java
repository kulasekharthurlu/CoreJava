package com.app.Annonimus;

public class InterfaceEx {

	public static void main(String[] args) {
		 B a=new B() {
// annonimus class implementing the interface B.
			 @Override
		public void m1() {
				 System.out.println("implementing class");
			 }
		 };
		 a.m1();

	}

}
interface B{
	void m1();
}
