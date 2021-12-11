package com.app.Java_5_Feautures;

public class VarargMethodEx {
   static void add(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("Sum of all numbers is " + sum);
    }

    public static void main(String[] args) {

        add(10, 20, 30, 40, 50);
    }
}
