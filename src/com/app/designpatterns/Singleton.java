package com.app.designpatterns;

public class Singleton {
	
	//1. private constructor
	//2. static method
	//3  static field
	
	//Note: Best UseCase is DB Connection
	private  Singleton() {
		System.out.println("fooo");
	}
	
	private static Singleton singletone=null;
	
	public static Singleton getSingletoneInstance() {
		if(singletone==null)
			singletone = new Singleton();
		return singletone;
	}
	
	public static void main(String[] args) {
		 
		for(int i=0;i<=10;i++) {
			getSingletoneInstance();
			System.out.println(i);
		}
	}
}
