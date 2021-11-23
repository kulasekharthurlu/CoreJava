package com.app.numbers;

public class PolindromNum {
    public static void main(String[] args) {
        int num = 1221;
        int temp = num;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println("Number is polindrom");
        } else {
            System.out.println("Number is not polindrom");
        }
    }
    
}
