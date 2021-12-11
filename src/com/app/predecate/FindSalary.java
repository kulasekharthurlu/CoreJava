package com.app.predecate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class FindSalary {

	public static void main(String[] args) {
		ArrayList<Emp> l=new ArrayList<>();
		l.add(new Emp("kula",7867.9));
		l.add(new Emp("ravi",867.9));
		l.add(new Emp("raja",755867.9));
		 Predicate<Emp> p=e->e.salary>3000;
		 for(Emp e:l)
			 System.out.println(p.test(e)?e.name+":"+e.salary:"");

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
