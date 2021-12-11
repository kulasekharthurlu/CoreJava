package com.app.arrays;

public class SumofElementsInArray {
	
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,67,78,8};
		int sum=0;
		for(int element:arr) {
			sum=sum+element;
		}
		System.out.println(sum);
	}

}
