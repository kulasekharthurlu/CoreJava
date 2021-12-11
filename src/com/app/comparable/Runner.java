package com.app.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

public static void main(String[] args) {
	List<Laptops> laps=new ArrayList<Laptops>();
	laps.add(new Laptops("dell",4,500));
	laps.add(new Laptops("lenovo",8,5000));
	laps.add(new Laptops("apple",12,5056));
	laps.add(new Laptops("Acer",6,50033));
	
	Collections.sort(laps);
	for(Laptops l:laps) {
		System.out.println(l);
	}
}
	

}
