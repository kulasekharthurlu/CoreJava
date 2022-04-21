package com.app.numbers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Map;

public class FibonaaciNumber {
	public static void main(String[] args) { 
		List<String> stringList=new ArrayList<>();
		stringList.add("kulasekhar");
		stringList.add("ArrayList");
		List<Double> integerList=new ArrayList<>();
		integerList.add(90.78);
		integerList.add(78.987);
		getResult(integerList);
		
	}
	public static  List<?>   getResult(List<? extends Number> unsortedList ){
	Iterator<?> it=	unsortedList.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());;
	}
		return unsortedList ;
	}
}
