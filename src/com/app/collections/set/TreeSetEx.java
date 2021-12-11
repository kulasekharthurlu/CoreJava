package com.app.collections.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		 TreeSet<Integer> t=new TreeSet<>(new Test());
		 t.add(3);
		 t.add(33);
		 t.add(343);
		 t.add(11);
		 t.add(36);	 
		 t.add(773);
		 System.out.println(t);
	}

}
class Test implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		 Integer i1= (Integer)o1;
		 Integer i2= (Integer)o2;
        if(i1>i2)
        	return -1;
        else if(i1<i2)
        	return +1;
        else	
		    return 0;
	}
	
}
