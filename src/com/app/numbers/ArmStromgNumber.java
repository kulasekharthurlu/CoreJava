package com.app.numbers;

public class ArmStromgNumber {
	public static void main(String[] args) {
		//1 2 3 4 5 6 7 8 9 153 370 371 407 1634
		int no=1634,lno=no,sum=0,c=0,r=0;
		for(int i=1;i<=4;i++) {
			r=no%10;
			c=r*r*r*r;
			sum=sum+c;
			no=no/10;
		}
		if ( sum==lno) {
			System.out.println(sum+" is Amstrong number");
		} else {
			System.out.println(sum+" is not Amstrong number");

		}
	}

}
