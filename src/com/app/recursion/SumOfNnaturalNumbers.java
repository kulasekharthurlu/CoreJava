package com.app.recursion;

public class SumOfNnaturalNumbers {
public static void main(String[] args) {
	SumOfNnaturalNumbers snn=new SumOfNnaturalNumbers();
	System.out.println(snn.findSumOfNnaturalNumbers(10, 0));
}
public int findSumOfNnaturalNumbers(int inputNumber,int result) {
	if(inputNumber == 0) {
		return result;
	}
	result =result+inputNumber;
	return findSumOfNnaturalNumbers(inputNumber-1, result);
}
}
