package com.app.Java_5_Feautures;

public class CovariantEx {

    public static void main(String[] args) {

    }

}

class SuperClass {
    public static SuperClass add() {
        System.out.println("SuperClass");
        return new SuperClass();
    }
}

class SubClass extends SuperClass {

    public static SubClass add() {

        System.out.println("SubClass");
        return new SubClass();
    }
}
