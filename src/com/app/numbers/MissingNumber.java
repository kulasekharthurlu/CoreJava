package com.app.numbers;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        System.out.println(n);
        int sum = (n * (n + 1)) / 2;
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 = sum1 + arr[i];
        }
        System.out.println(sum - sum1);
    }

}
