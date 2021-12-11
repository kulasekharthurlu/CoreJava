package com.app.Interfaces;

public class MultipleInheritance {

	public static void main(String[] args) {
		 Tes t=new Tes();
		 t.m1();

	}

}
interface I{
	void m1();
}
interface I1{
	void m1();
}
class Tes implements I,I1{

	@Override
	public void m1() {
	 System.out.println("interface method executed");
		
	}
	 
}
