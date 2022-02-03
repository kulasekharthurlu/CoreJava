package com.app;

import java.util.regex.Pattern;

import org.apache.log4j.Logger;

public class Regex {
    static final Logger log = Logger.getLogger(Regex.class);

    public static void main(String[] args) {

        String name = "Kulasekhar";
        if (Pattern.matches("[A-Za-z]{10}", name)) {
            log.info("your enter name is valid");
        }
        int num = 10;
        if (Pattern.matches("[0-9]{1,2}", String.valueOf(num))) {
            log.info("your enter number is valid");
        }
        double num1 = 103.5534;
        if (Pattern.matches("[0-9]{1,3}.[0-9]{1,8}", String.valueOf(num1))) {
            log.info("your enter double is valid");
        }
        String email = "kul-a._io89@gmail.com";
        if (Pattern.matches("[a-zA-Z0-9_.-]{1,30}@[a-zA-Z0-9]{1,30}.[a-zA-Z]{1,4}", email)) {
            log.info("your enter email is valid");
        }
    }

}
