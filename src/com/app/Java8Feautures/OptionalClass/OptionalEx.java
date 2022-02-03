package com.app.Java8Feautures.OptionalClass;

import org.apache.log4j.Logger;

public class OptionalEx {
	public static final Logger log = Logger.getLogger(OptionalEx.class);

	public static void main(String[] args) {
		Customer c = new Customer(8, "kula");
		log.info(c.name + " " + c.getId());

		Customer c1 = new Customer(8, null);

		log.info(c1.name.toUpperCase() + " " + c1.getId());

	}

}

class Customer {
	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

}
