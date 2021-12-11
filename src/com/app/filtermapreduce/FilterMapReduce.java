package com.app.filtermapreduce;

import java.util.Arrays;
import java.util.stream.Stream;

public class FilterMapReduce {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Integer result = Arrays
                                .stream(arr)
                                .filter(i -> i % 2 == 0)
                                .map(k -> k + 2)
                                .reduce(0, (a, b) -> a + b);
        System.out.println(result);
    }
}
