package com.app.Java8Feautures.cosumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class BiConsumerEx {

	public static void main(String[] args) {
		ArrayList<Emp> l=new ArrayList<Emp>();
		 papulate(l);
		 BiConsumer<Emp, Double> b=(e,d)->e.salary=e.salary+d;
		 for(Emp e:l) {
			 b.accept(e, 500.0);
			 System.out.println("Employee salary : "+e.salary);
			 System.out.println("Employee salary : "+e.name);
			 System.out.println();
		 }
		  

	}
	public static void papulate(ArrayList<Emp> l) {
		
		l.add(new Emp("Bheem", 29000.0));
	    l.add(new Emp("Alexa", 249000.0));
		l.add(new Emp("Kula", 9000.0));
		l.add(new Emp("Google", 99000.0));
	}

}
class Emp{
	String name;
	double salary;
	public Emp(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}
