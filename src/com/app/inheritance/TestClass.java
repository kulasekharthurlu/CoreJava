package com.app.inheritance;

public class TestClass {
public static void main(String[] args) {
	Sub s=new Sub();
	s.addTwoNums(23, 56);
	s.multipleTwoNums(232, 512);
}
}
class Super{
  public void addTwoNums(int num1,int num2) {
	  System.out.println("sum of two numbes :" +(num1+num2));
  }
}
class Sub extends Super{
	public void multipleTwoNums(int num1,int num2) {
		System.out.println("multiple of two numbers: "+(num1*num2));
	}
}
