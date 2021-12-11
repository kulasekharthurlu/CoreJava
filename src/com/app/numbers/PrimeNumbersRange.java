package com.app.numbers;

public class PrimeNumbersRange {
    //1 to 100 prime numbers
    public static void main(String[] args) {
        int num = 10;
        int count = 0;
        for (int i = 2; i <num; i++) {
        	 count = 0;
            for (int j = 2; j<i; j++) {
             
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }

}
