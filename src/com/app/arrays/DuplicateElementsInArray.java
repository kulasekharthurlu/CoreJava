package com.app.arrays;

 
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateElementsInArray {
	public static void main(String[] args) {
		 int l[]= {1,2,3,4,5,6,7,8,9,1,5,1};
		 Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		 for(int i=0;i<l.length;i++) {
			 if(map.containsKey(l[i])) {
				 map.put(l[i], map.get(l[i])+1);
			 }
			 else {
				 map.put(l[i], 1);
			 }
		 }
		 System.out.println(map);
		 for(Entry<Integer, Integer> e:map.entrySet()) {
			 if(e.getValue()>=2) {
				 System.out.println(e.getKey()+" = "+e.getValue());
			 }
		 }
	}

}
