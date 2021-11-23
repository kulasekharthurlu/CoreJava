package com.app.multithreading;

import org.apache.log4j.Logger;

public class ThreadDemo   {
	//static Logger log=Logger.getLogger(ThreadDemo.class.getClass());
	public static void main(String[] args) {
		Demo t=new Demo();
		t.start();
		for(int i=1;i<=10;i++) {
			System.out.println("main thread...");
		} 
	}
}
class Demo extends Thread {
	//Logger log=Logger.getLogger(Demo.class.getClass());
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("child thread...");
		}
	}
	
}
