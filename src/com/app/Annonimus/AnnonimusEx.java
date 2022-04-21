package com.app.Annonimus;

public class AnnonimusEx {

	public static void main(String[] args) {
		ImplimentClass m = new ImplimentClass();
		m.implimentMethod();
	}
}

interface Interface {
	void ma();
	int add(int a, int b);
}

class ImplimentClass {
	String implimentMethod() {
		Interface a = new Interface() {
//in interface 3 abstrct methods are present then we override all these methods
			@Override
			public void ma() {
				System.out.println("this is ma method");
			}

			@Override
			public int add(int a, int b) {
				System.out.println("sum of two numbers: " + a + b);
				return a + b;
			}
		};
		a.add(2434, 3543);

		a.ma();
		return null;

	}
}

class ParentEx {
	ImplimentClass i = new ImplimentClass() {

		@Override
		String implimentMethod() {
			return null;

		}
	};
}
