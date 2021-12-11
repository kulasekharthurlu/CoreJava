package com.app.arrays;

public class FindMaxNumberInArray {
   public static void main(String[] args) {
	int []arr= {1,99,344,453,24,53,4,5,56};
	int max=0;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]>max) {
			 max=arr[i];
		 }
	 }
	 System.out.println(max);
   }
}
