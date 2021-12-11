package com.app.Java_5_Feautures;

public class AutoBoxing {
    public static void main(String[] args) {
        int i = 10;
        Integer i1 = i;// autoboxing
        System.out.println(i1);
        System.out.println(i1.intValue());
        System.out.println(i1.equals(i));
        System.out.println(i1.equals(10));

        int j = i1;// unboxing
        System.out.println(j);
        System.out.println(j == i);

        Integer i3= Integer.valueOf(10);

    }
    
}
