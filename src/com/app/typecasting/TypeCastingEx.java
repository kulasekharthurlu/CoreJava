package com.app.typecasting;

public class TypeCastingEx {
    public static void main(String[] args) {
        int i = 89;
        String s = String.valueOf(i);
        System.out.println(s);
        // String s1 = i; // Compile time error

        String name = "Raj";
        int age = Integer.parseInt(name);
        System.out.println(age);
    }

}
