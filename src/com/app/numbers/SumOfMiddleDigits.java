package com.app.numbers;

public class SumOfMiddleDigits {
    public static void main(String[] args) {
        int num = 123456,temp=num, sum = 0;
        for (int i = 1; i <= 6; i++) {
            int r=num%10;
            if(i==3 || i==4)
                sum+=r;
            num/=10;


        }

        System.out.println("Sum of middle digits of " + temp + " is " + sum);
    }

}
