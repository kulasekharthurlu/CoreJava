package com.app.leetcode;

import java.util.Arrays;

public class ThreeSum {

	public static int[] threeSum(int[] nums, int target) {
		//Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for(int k=0;k<nums.length;k++) {
					if (nums[i] + nums[j]+nums[k] == target) {
						return new int[] { i, j ,k};
					}
				}
			}
		}
		throw new IllegalArgumentException("no match found");
	}

	public static void main(String[] args) {
   int[] inputArray= {1,3,7,2,4};
   int[] resultArray=threeSum(inputArray, 6);
   System.out.println(Arrays.toString(resultArray));
	}

}
