package com.app.string;

import java.util.stream.IntStream;

public class Test {
	 static int number=25;
	  static int num=number/2;;
public static	boolean checkDevise(int prime) {
	System.out.println(prime);
	return prime%num==0?false:true;
}
	public static void main(String[] args) {
		boolean result=true;
		 int count=0;
//		for(int i=2;i<num/2;i++) {
//			if(num%i==0) {
//				 result=false;
//				 break;
//			} 
//		} 
//		 if(result)
//			 System.out.println("this is prime number");
//		 else {
//			System.out.println("not prime number");
//		}
		// System.out.println(count);
		
		
		
		
		if( IntStream.range(2, num).noneMatch(e->num%2==0))
			System.out.println(number+" prime");
		else
			System.out.println(number+"  not prime");
	}    

}
