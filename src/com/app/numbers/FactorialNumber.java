package com.app.numbers;

public class FactorialNumber {
	public static void main(String[] args) {
		int inputNumber = 5;
		System.out.println("factorial of " + inputNumber + " is " + findFactorialNumber(inputNumber));
		System.out.println("factorial of " + inputNumber + " is " + findFactorialNumberByRecursion(inputNumber));

	}

	public static int findFactorialNumber(int inputNumber) {
		int fact = 1, i = 0;
		for (i = 1; i <= inputNumber; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static int findFactorialNumberByRecursion(int inputNumber) {

		 if(inputNumber >= 1) {
			 return inputNumber*findFactorialNumberByRecursion(inputNumber-1);
		 }else {
			 return 1;
		 }

	}

}
