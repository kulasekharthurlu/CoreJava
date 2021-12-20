package com.app.Java8Feautures.constructor_reference;

class Sample{
	
	public Sample() {
		System.out.println("sample class constructor executed..");
	}
	
}
interface Test{
	Sample get();
}
public class ConstructorReferenceEx {

	public static void main(String[] args) {
		 
     Test t=Sample::new;
      t.get();
      t.get();
      t.get();
      t.get();
      
     
	}

}
