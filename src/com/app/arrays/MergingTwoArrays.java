package com.app.arrays;

import java.util.Arrays;

public class MergingTwoArrays {


	public static void main(String[] args) {
		
		int firstArray[]=new int[] {23,45,6,23,4,54,32};
		int []secondArray=new int[] {1,2,3,4,5,6,7};
		
		int []mergeArray=new int[firstArray.length+secondArray.length] ;
		int pos=0;
		for(int element:firstArray) {
			mergeArray[pos]=element;
			pos++;
		}
		System.out.println(pos);
		for(int element:secondArray) {
			mergeArray[pos]=element;
			pos++;
		}
		 System.out.println(pos);
		 System.out.println(Arrays.toString(mergeArray));
	}


}
