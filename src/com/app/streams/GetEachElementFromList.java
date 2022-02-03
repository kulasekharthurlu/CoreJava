package com.app.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.apache.log4j.Logger;

public class GetEachElementFromList {
	private static final Logger log=Logger.getLogger(GetEachElementFromList.class);
  public static void main(String[] args) {
	  ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(23);
		al.add(237);
		al.add(26);
		al.add(289);
	log.info(al);
	 
		
	               	al.stream().forEach(System.out::println);
	 
		
		Consumer<Integer> c=i->{
			if(i%2==0) {
				log.info("squer of "+i+" is "+i*i);
			}
		};
		al.stream().forEach(c);
	 
		
		
		al.stream().forEach(i->
			log.info(i*i)
		);
	 
		
		Integer [] i=al.stream().toArray(Integer[]::new);
		log.info(Arrays.toString(i));
		for(Integer I:i) {
			log.info(I);
		}
		 
		
		Stream.of(i).forEach(System.out::println);
}
}
