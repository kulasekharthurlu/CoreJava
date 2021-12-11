package com.app.designpatterns;


interface Travel{
	String getJournyType();
}

class Bus implements Travel{
	@Override
	public String getJournyType() {
		return "Journy starts by bus";
	}
}

class Car implements Travel{
	@Override
	public String getJournyType() {
		return "Journy starts by Car";
	}
}

class Flight implements Travel{
	@Override
	public String getJournyType() {
		return "Journy starts by Flight";
	}
}
public class FactoryDesignPttern {
	
	public static void main(String[] args) {
		String s="flighfhfhft";
		
		Travel travel=null;
		
		if(s.equals("car"))
			travel=new Car();
		if(s.equals("flight"))
			travel=new Flight();
		if(s.equals("bus"))
			travel=new Bus();
		
		
		System.out.println("Your Journy type is :"+ travel.getJournyType());
		
	}
}
