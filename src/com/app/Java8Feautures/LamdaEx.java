package com.app.Java8Feautures;

import java.util.Map;

public class LamdaEx {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3);
        map.forEach((k, v) -> System.out.println(k + " " + v));
        map.forEach((k, v) ->
                {
                    if(v == 2)
                        System.out.println(k + " " + v);
                    if (k.equals("B")) {
                        System.out.println("B is present");
                    }
                }
          );
    }

}
