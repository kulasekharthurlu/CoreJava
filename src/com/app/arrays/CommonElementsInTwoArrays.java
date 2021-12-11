package com.app.arrays;

public class CommonElementsInTwoArrays {

	public static void main(String[] args) {
	  int firstArray[]= {2,3,4,5,11};
	  int secondArray[]= {2,33,44,5,4,10};
	  int count=0;
	  
	  for(int i=0;i<firstArray.length;i++) {
		  count++;
		  for(int j=0;j<secondArray.length;j++) {
			  
			  if(firstArray[i]==secondArray[j]) {
				  System.out.println(firstArray[i]);
				  count++;
			  }
			  count++;
		  }
	  }
	 System.out.println(count);
	}

}
