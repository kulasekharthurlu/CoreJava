package com.app.Annonimus;

import org.apache.log4j.Logger;

public class RunnableEx {
   public static final Logger log = Logger.getLogger(RunnableEx.class);
	public static void main(String[] args) {
		 Runnable r=new Runnable() {
			
			@Override
			public void run() {  
				for(int i=0;i<=10;i++) {
					 log.info("childs thread.....");
				}
			}
		};
		Thread  t=new Thread(r);
		t.start();
		for(int i=0;i<=10;i++) {
			log.info("main thread.....");
		}
	}

}
interface Test{
	private void ma() {
		
	}
	 int i=909;
	// public static final by default for the varables
	 
		
	
}
