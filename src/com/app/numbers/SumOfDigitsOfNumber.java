package com.app.numbers;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        int num = 543;
        int sum = 0;
         for(int i=1;i<=3;i++) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println(sum);
    }

}
