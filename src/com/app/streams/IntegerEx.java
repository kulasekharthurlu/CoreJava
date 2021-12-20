package com.app.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerEx {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(0);
		l.add(5);
		l.add(34);
		l.add(10);
		l.add(455);
		l.add(90);
		System.out.println(l);

		List<Integer> afterMappingIntegers=new ArrayList<>();
		for(Integer i:l) {
			if(i%2==0)
				afterMappingIntegers.add(i+5);
		}
		System.out.println(afterMappingIntegers);

		Long below100=l.stream().filter(i->i<100).count();
		System.out.println(below100);

		List<Integer> f=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(f);

		List<Integer> m=l.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(m);

		//List<Integer> r=l.stream().reduce().collect(Collectors.toList());
		//System.out.println(r);

		List<Integer> ll=l.stream().filter(i->i%2==0).map(o->o+5).collect(Collectors.toList());
		System.out.println(ll);




		//default sorting order Assending order
		List<Integer> sortedList=l.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);


		//custom sorting order Desending order
		List<Integer> sortedList1=l.stream().sorted((i1,i2)->(i1<i2)?1:-1).collect(Collectors.toList());
		System.out.println(sortedList1);



		//custom sorting order Desending order using compareTo
		List<Integer> sortedList2=l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(sortedList2);
	}

}
