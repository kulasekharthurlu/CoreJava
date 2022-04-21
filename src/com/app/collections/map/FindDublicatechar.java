package com.app.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDublicatechar {

	public static void main(String[] args) {
        String str = "Kulasekhar";
        char[] ch = str.toCharArray();
        Map<Character, Integer> map=new HashMap<Character, Integer>();
        for(int i=0;i<ch.length;i++) {
        	if(map.containsKey(ch[i])) {
        		map.put(ch[i], map.get(ch[i])+1);
        	}else {
        		map.put(ch[i], 1);
        	}
        	
        }
        System.out.println(map);
    }
}
