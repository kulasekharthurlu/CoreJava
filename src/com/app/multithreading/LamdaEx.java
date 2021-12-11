package com.app.multithreading;

public class LamdaEx {

	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0;i<=8;i++) {
				System.out.println("Lamda expresion");
			}

		};
		r.run();
		

	}
}
