package com.app.recursion;

public class DesimalToBynary {
	
	public static void main(String[] args) {
		DesimalToBynary db=new DesimalToBynary();
		System.out.println(db.findBinary(233, ""));
		
	}
	public String findBinary(int input,String result) {
		if(input == 0) {
			return result;
		}
		result = input%2+result;
		return findBinary(input/2, result);
	}

}
