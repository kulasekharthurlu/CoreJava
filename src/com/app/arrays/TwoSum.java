package com.app.arrays;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		 int []a= {11,18,19,21,23};
		 int target=30;
         int[] returnValue= twoSum(a, target);
         System.out.println(Arrays.toString(returnValue));
	}
	static int[] twoSum(int []a, int target) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==target) {
					 return new int[] { a[i],a[j]};
				}
			}
		}
		return a;
		
	}

}
