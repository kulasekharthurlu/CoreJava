package com.app.dataStructuresAndAlgarithms.serching;

public class BinarySearchEx {
	
	public static void binarySearch( int arr[],int first,int last,int target) {
		 
		  for(int i=0;i<=last;i++){
			  int mid=(first+last)/2;
			  if(arr[mid]==target) {
				    System.out.println("Element is found at index: " + mid);  
			        break;  
			  } 
			  else if(arr[mid]<target){
				   first=mid+1;
				  
			  }else {
				  last=mid-1;
			  }
		  }
	}

	public static void main(String[] args) {
		 int arr[]= {10,20,30,40,50,60,70,80,90};
		int  first =0;
		int last=arr.length-1;
		int target=70;
		 binarySearch(arr,first , last, target);

	}

}
