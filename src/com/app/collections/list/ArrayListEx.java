package com.app.collections.list;

import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		List<Integer> al = List.of(12,3,5,7,90,234,223);

		int val=al
				.stream()
				.filter(k->k%2==0)
				.map(m->m+1)
				.reduce(0,(l,n)->l+n).intValue();
		System.out.println(val);

	}
}
