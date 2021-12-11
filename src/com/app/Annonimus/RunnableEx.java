package com.app.Annonimus;

public class RunnableEx {

	public static void main(String[] args) {
		 Runnable r=new Runnable() {
			
			@Override
			public void run() {  
				for(int i=0;i<=10;i++) {
					System.out.println("childs thread.....");
				}
			}
		};
		Thread  t=new Thread(r);
		t.start();
		for(int i=0;i<=10;i++) {
			System.out.println("main thread.....");
		}
	}

}
interface Test{
	private void ma() {
		
	}
	 int i=909;
	// public static final by default for the varables
	 
		
	
}
