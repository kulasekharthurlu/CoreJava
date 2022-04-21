package com.app.recursion;

public class PolindromString {

	public static void main(String[] args) {
		System.out.println(isPolindrom("racecar"));

	}

	public static boolean isPolindrom(String input) {
		if (input.equals("") || input.length() == 1) {
			return true;
		}
		if (input.charAt(0) == input.charAt(input.length() - 1)) {
			return isPolindrom(input.substring(1, input.length() - 1));
		}
		return false;
	}
}
