package com.app.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LamdaEx {

	public static void main(String[] args) {
	  List<Integer> a=new ArrayList<Integer>();
	  a.add(12);
	  a.add(56);
	  a.add(23);
	Comparator<Integer> c= (e2,e1)-> e1<e2?1:e1>e2?-1:0;
	 Collections.sort(a,c);
	 System.out.println(a);
	 System.out.println();
	      a.stream().forEach(System.out::println);
	     
	     List<Integer> l= a.stream().filter(i->i%2==0).collect(Collectors.toList());
	     Set<Integer> set=a.stream().filter(e->e%2==0).collect(Collectors.toSet());
	     Map<Integer, Integer> map=a.stream().filter(m->m%2==0).collect(Collectors.toMap(k->k, v->v));
	     System.out.println();
	        l.stream().forEach(System.out::println);

	}

}
