package com.app.string;

public class ReverseString {
	
	public static void main(String[] args) {
		String str = "Sekhar";
		StringBuilder sb = new StringBuilder();
		for(int i = str.length()-1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb.toString());
		
	}
}
