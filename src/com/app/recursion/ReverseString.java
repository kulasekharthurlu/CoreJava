package com.app.recursion;

public class ReverseString {

	public String printReverseString(String input) {	
		if (input.equals("")) {
			return "";
		}

		return printReverseString(input.substring(1)) + input.charAt(0);
	}

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		System.out.println(rs.printReverseString("The lion king"));;
	}

}
