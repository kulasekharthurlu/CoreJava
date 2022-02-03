package com.app;

import java.util.regex.Pattern;

import org.apache.log4j.Logger;

public class Test3 {
	public static final Logger log = Logger.getLogger(Test3.class);

	public static void main(String[] args) {
		String name = "Kulasekhar";
		Integer no = 45656;
		if (Pattern.matches("[0-9]", String.valueOf(no))) {
			log.info("your enter name is valid");
		}
		if (Pattern.matches("[A-Za-z]{30}", name))
			log.info("name is valid");

	}
}
