package com.app.numbers;

public class PrimeNumber {
    //prime number is a number which is divisible by 1 and itself only
    public static void main(String[] args) {
        int num = 5;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    	
        
    }

}
