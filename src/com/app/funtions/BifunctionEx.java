package com.app.funtions;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BifunctionEx {

	public static void main(String[] args) {
		 BiFunction<Integer,String, Employee> b=(eno,ename)->new Employee(eno, ename);
		 ArrayList<Employee> l=new ArrayList<Employee>();
		 l.add(b.apply(1000, "Tony"));
		 l.add(b.apply(2000, "Many"));
		 l.add(b.apply(3000, "Cherry"));
		 l.add(b.apply(4000, "Hari"));
		 for(Employee e:l) System.out.println("employee number : "+e.eno+" employee name: "+e.ename);
	}

}
class Employee{
	int eno;
	String ename;
	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	
}
