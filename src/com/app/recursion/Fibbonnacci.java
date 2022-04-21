package com.app.recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibbonnacci {
	public static void main(String[] args) {
		 
		 
		System.out.println(findFibbonnaciNum(10));
	}

	public static int findFibbonnaciNum(int n) {
		 if((n == 0) || (n == 1)) 
			 return n;
		 else
			 return findFibbonnaciNum(n-1)+findFibbonnaciNum(n-2);
		 
	}

}
