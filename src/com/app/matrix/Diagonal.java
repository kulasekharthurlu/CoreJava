package com.app.matrix;

import java.util.Arrays;

public class Diagonal {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[0][3]=12;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[1][3]=16;
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		arr[2][3]=19;
		arr[3][0]=7;
		arr[3][1]=8;
		arr[3][2]=9;
		arr[3][3]=15;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<=i;j++) {
				if(i==j)
				   sum=arr[i][j]+sum;
				System.out.println("kulsekhar");
			}
		}
		System.out.println(sum);
	}

}
