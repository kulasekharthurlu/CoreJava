package com.app.Java8Feautures;

public class FunctionalInterfaceEx {
	

	public static void main(String[] args) {
         intter r=()->System.out.println("kulasekhar");
         r.m1();
	}

}

@FunctionalInterface
interface intter{
	void m1();
}