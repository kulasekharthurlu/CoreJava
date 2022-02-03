package com.app.arrays;

import org.apache.log4j.Logger;

public class ArraysTheory {
/*
 * (1) An Array is indexed Collections of Homogeneous elements and fixed in size.
 * 
 * 
 * 
 * 
 * 
 
 */
public static final Logger log = Logger.getLogger(ArraysTheory.class);
	 public static void main(String[] args) {
		Emp e=new Emp(1,"kww","kldeq");
		log.info(e);
		
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
