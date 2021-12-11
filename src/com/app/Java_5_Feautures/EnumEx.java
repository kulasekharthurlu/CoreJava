package com.app.Java_5_Feautures;

public class EnumEx {
    public enum Seasons {
        WINTER, SPRING, SUMMER, FALL;
    }

    public enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }

    public enum Months {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
    }

    public enum Colors {
        RED, GREEN, BLUE, YELLOW, BLACK, WHITE;
    }

    public static void main(String[] args) {
        for (Seasons s : Seasons.values()) {
            System.out.println(s);
        }
        System.out.println(Colors.BLACK.ordinal());
        System.out.println(Colors.values().length);
        System.out.println(Colors.values()[0]);
        System.out.println(Colors.values()[1]);
        System.out.println(Colors.RED);

        for (Days d : Days.values()) {
            System.out.println(d);
        }
        Colors.valueOf("KULA");
        System.out.println(Colors.valueOf("KULA"));
        Colors.BLACK.name();

    }

}
