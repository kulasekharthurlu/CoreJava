package com.app.Annonimus;

public class Test1 {

	
	public void show() {
		System.out.println("");
	}
	public static void main(String[] args) {
		 Test1 t=new Test1() {
				 public void show() {
					 System.out.println(" Annonimus class");
				 }
		 };
		 t.show();
	}

}
class Test2{
	
}
