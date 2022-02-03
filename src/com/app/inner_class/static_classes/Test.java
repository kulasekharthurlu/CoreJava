package com.app.inner_class.static_classes;

public class Test {

	public static void main(String[] args) {
		 Outer.i=89;
		 
		 Outer.Inner obj1= new Outer.Inner();
		 
		 obj1.j=23;
	}

}
class Outer{
	
static	int i;
	
static	class Inner{
		int j;
		
	}
}
