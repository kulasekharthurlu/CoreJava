package com.app.inner_class.memberclasses;

public class Test {

	public static void main(String[] args) {
		 Outer obj=new Outer();
		 obj.i=23;
		 
		 Outer.Inner obj1= obj.new Inner();
		 obj1.j=4567;
	}

}
class Outer{
	
	int i;
	
	class Inner{
		int j;
		
	}
}
