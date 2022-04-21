package com.app.dataStructuresAndAlgarithms.stack;

import java.util.Stack;

public class StringRevers {
	
	public static String reversString(String str) {
	Stack<Character> s=new Stack<>();
 
	char[] ch=str.toCharArray();
	for(char c:ch) {
		s.push(c);
	}
	for(int i=0;i<str.length();i++) {
		ch[i]=s.pop();
	}
	return new String(ch);
	}
	public static void main(String[] args) {
		String str="kitiki";
		System.out.println("normal string "+ str);
		System.out.println("reverse string "+ reversString(str));
	}
}
