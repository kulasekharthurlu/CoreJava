package com.app.Annonimus;

public class ClassEx {

	public static void main(String[] args) {
		 A a=new A() {
//annonimus class extends class A
			 @Override
			 void m1() {
				 System.out.println("child class");
			 }
		 };
		 a.m1();
	}

}
class A{
	void m1() {
		System.out.println("parent class");
	}
}
