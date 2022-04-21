package com.app.dataStructuresAndAlgarithms.serching;

public class LinerSearch {
	public static int linerSerch(int key,int []arr) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70};
		int key=100;
      int  result	=	linerSerch(key,arr);
      if(result>0)
          System.out.println("the index number of   "+key+"  is  "+result);
      else
    	  System.out.println("the index number of   "+key+"  is not in array  ");
	}

}
