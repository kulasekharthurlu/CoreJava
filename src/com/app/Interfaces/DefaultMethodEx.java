package com.app.Interfaces;

public class DefaultMethodEx {

	public static void main(String[] args) {
		Child c=new Child();
		c.m1();

	}

}
interface In{
	default void m1() {
		System.out.println("default method ==1");
	}
}
interface I2{
	default void m1() {
		System.out.println("default method ==2");
	}
}
class Child implements In,I1{

	@Override
	public void m1() {
		 //I2.super.m1();//not possible
		//System.out.println("child method executed..");

	}

}
