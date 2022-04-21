package com.app.recursion;

public class BinarySearch {

	

	public int findIndexNumber(int[] arr, int left, int right, int serchKey) {
		if (left > right) {
			return -1;
		}
		int mid = (left + right) / 2;
		if (serchKey == arr[mid]) {
			return mid;
		}
		if (serchKey < arr[mid]) {
			return findIndexNumber(arr, left, mid - 1, serchKey);

		}
		return findIndexNumber(arr, mid + 1, right, serchKey);

	}
	public static void main(String[] args) {
		BinarySearch bs=new BinarySearch();
      int[] inputArr= {-1,3,9,8,2,6,5,10};
      System.out.println(bs.findIndexNumber(inputArr, 0, inputArr.length-1, 10));
      
 	}
}
