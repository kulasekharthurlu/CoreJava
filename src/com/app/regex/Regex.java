package com.app.regex;

import java.util.regex.Pattern;

public class Regex {

	   // static final Logger log = Logger.getLogger(Regex.class);

	    public static void main(String[] args) {

	        String name = "Kulasekhar";
	        if (!Pattern.matches("[A-Za-z]{10}", name)) {
	           System.out.println("your enter name is valid");
	        }
	        int phoneNumber = 956357687;
	        if (!Pattern.matches("[6-9]{1}[0-9]{1,9}", String.valueOf(phoneNumber))) {
	        	System.out.println("your enter your phoneNumber is valid");
	        }
	        double salary = 1088.5534;
	        if (!Pattern.matches("[0-9]{1,6}.[0-9]{1,8}", String.valueOf(salary))) {
	        	System.out.println("enter double is not valid");
	        }
	        String email = "kul-a._io89@gmail.com";
	        if (!Pattern.matches("[a-zA-Z0-9_.-]{1,30}@[a-zA-Z0-9]{1,30}.[a-zA-Z]{1,4}", email)) {
	        	System.out.println("your enter email is valid");
	        }
	    }


}
