package com.app.streams;

import java.util.ArrayList;

public class MinMaxEx {

	public static void main(String[] args) {
		 
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(23);
		al.add(237);
		al.add(26);
		al.add(289);
		Integer afterSortingList=al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(afterSortingList);
		
		Integer afterSortingLis=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(afterSortingLis);
		

	}

}
