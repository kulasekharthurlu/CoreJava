package com.app.Genirics;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class Test {
    public static final Logger log = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        // Printer<String> stringPrinter = new Printer<>("Hello");
        // stringPrinter.print();
        // Printer<Integer> integerPrinter = new Printer<>(5);
        // integerPrinter.print();
        // Printer<ArrayList<String>> arrayListPrinter = new Printer<>(new
        // ArrayList<String>());
        // arrayListPrinter.print();

        // shout(new Printer<String>("Hello"));
        // shout(10);
        // shout(new ArrayList<String>());

        // shout("hello ", "java");

        // ArrayList<String> list = new ArrayList<>();
        // list.add("hello");
        // list.add("java");
        // printList(list);

        // printList1(myList);

        int i = 10;
        String s = String.valueOf(i);
        log.info(s);
        int k = Integer.parseInt(s);
        log.info(k);

    }

    public static <T> void shout(T t) {
        log.info(t);
    }

    public static <T, V> void shout(T t, V v) {
        System.out.println(t);
        System.out.println(v);
    }

    // private static <T> void shout(T thingToshout){
    // System.out.println(thingToshout+"!!!!!!!!!");
    // }

    // private static <T, v> void shout(T thingToshout, v otherThingsToShout) { //
    // <T,v> is the type of the generic
    // System.out.println(thingToshout + "!!!!!!!!!");
    // System.out.println(otherThingsToShout + "!!!!!!!!!");
    // }

    // private static <T, v> v shout(T thingToshout, v otherThingsToShout) { //
    // <T,v> is the type of the generic
    // System.out.println(thingToshout + "!!!!!!!!!");
    // System.out.println(otherThingsToShout + "!!!!!!!!!");
    // return otherThingsToShout;
    // }

    private static void printList(List<?> myList) {
        System.out.println(myList);
    }

    private static <T> void printList2(List<T> myList) {
        System.out.println(myList);
    }

    private static void printList1(List<? extends Printer> myList) {
        System.out.println(myList);
    }
}
