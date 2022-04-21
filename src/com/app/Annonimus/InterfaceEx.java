package com.app.Annonimus;

public class InterfaceEx {

	public static void main(String[] args) {
		 B a=new B() {
// annonimus class implementing the interface B.
			 @Override
		public void m1() {
				 System.out.println("implementing class");
			 }

			@Override
			public void m2() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void m3() {
				// TODO Auto-generated method stub
				
			}
		 };
		 a.m1();

	}

}
interface B{
	void m1();
	void m2();
	void m3();
}
