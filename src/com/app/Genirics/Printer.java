package com.app.Genirics;

public class Printer <T,V> {
    T thingsToPrint;
    V otherThingsToPrint;

    public Printer(T thingsToPrint, V otherThingsToPrint) {
        this.otherThingsToPrint = otherThingsToPrint;
        this.thingsToPrint = thingsToPrint;
    }
    public void print(){
        System.out.println(thingsToPrint);
        System.out.println(otherThingsToPrint);
    }
    
}
