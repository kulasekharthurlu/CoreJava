package com.app.leetcode;

import java.util.Arrays;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("no match found");
	}

	public static void main(String[] args) {
   int[] inputArray= {1,3,7,2,4};
   int[] resultArray=twoSum(inputArray, 6);
   System.out.println(Arrays.toString(resultArray));
	}
}
