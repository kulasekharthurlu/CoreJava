package com.app.Java8Feautures.cosumer;

import java.util.function.Consumer;

public class CnsumerEx {

	public static void main(String[] args) {
		 Consumer<String> c=i->System.out.println(i);
		 c.accept("software");

	}

}
