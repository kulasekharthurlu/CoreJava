package com.app.Java8Feautures.OptionalClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalEx {

	public static void main(String[] args) {
		Customer c = new Customer(8, "kula");
		System.out.println(c.name + " " + c.getId());
		Customer c1 = new Customer(8, null);
		Optional<String> op=Optional.ofNullable(c1.getName());
		System.out.println(op.isPresent()?op.get().toUpperCase():"" + " " + c1.getId());
		Consumer<String> game=new Consumer<String>() {
			public void accept(String name) {
				System.out.println(name);
			}
		};
		List<String> list=List.of("kula","sekhar","hanuman");
		list.forEach(game);
		 
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
