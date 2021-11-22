package com.app.numbers;

public class FizzBuzz {
	public static void main(String[] args) {
		int n=23,i=0;
		for(i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i+" this number is fizzbuzz");
			}
			else if(i%3==0) {
				System.out.println(i+" fizz");
			}
			else if(i%5==0) {
				System.out.println(i+" buzz");
			}else {
				System.out.println(i);
			}
			System.out.println(","+" ");
		}
	}

}
