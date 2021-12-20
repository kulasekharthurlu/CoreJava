package com.app.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringCompareEx {

	public static void main(String[] args) {
		 ArrayList<String> al=new ArrayList<String>();
		 al.add("A");
		 al.add("AAA");
		 al.add("AA");
		 al.add("XXX");
		 al.add("AAAA");
		 al.add("AAAAAAAAAA");
		 Comparator<String> c=(s1,s2)->{
			 int l1=s1.length();
			 int l2=s2.length();
			 if(l1<l2) return 1;
			 else if(l2<l1) return -1;
			 else  return s1.compareTo(s2);
		 };
		 List<String> afterSortingList=al.stream().sorted(c).collect(Collectors.toList());
		 System.out.println(afterSortingList);
	}

}
