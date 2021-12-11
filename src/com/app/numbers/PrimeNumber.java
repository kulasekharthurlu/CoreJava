package com.app.numbers;

public class PrimeNumber {
    //prime number is a number which is divisible by 1 and itself only
    public static void main(String[] args) { 
    	int num=50;
    	boolean result=true;
    	for(int i=2;i<50/2;i++) {
    		 
    		if(num%i==0)
    			result=false;
    		break;
    	}
    	if(result)
    		System.out.println("this is  primenumber...");
    	else
    		System.out.println("this is not prim number");
    }

}
