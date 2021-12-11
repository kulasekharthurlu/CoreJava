package com.app.arrays;

import java.util.Arrays;

public class ArraysTheory {
/*
 * (1) An Array is indexed Collections of Homogeneous elements and fixed in size.
 * 
 * 
 * 
 * 
 * 
 
 */
	 public static void main(String[] args) {
		Emp e=new Emp(1,"kww","kldeq");
		System.out.println(e);
		
	}
}
class Emp{
	int id;
	String name;
	String email;
	public Emp(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public Emp() {
		super();
	}
	@Override
	public String toString() {
		return "{ id : " + id + ", name : " + name + ", email :" + email + "}";
	}
	
}
