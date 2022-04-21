package com.app.hashcode;


public class CheckHashCodes {


	public static void main(String[] args) {
		 Animal a=new Animal(null, null);
		 
		 a.setColour("White");
		 a.setType("Cow");
		 System.out.println(a.getColour()+" "+a.getType());
		 a.showVarablesValue();
	}

}
class Animal{
private	String type;
private	String colour;


public Animal(String type, String colour) {
	
	this.type = type;
	this.colour = colour;
}


public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}


public String getColour() {
	return colour;
}


public void setColour(String colour) {
	this.colour = colour;
}


void showVarablesValue() {
	try {
		System.out.println(type.hashCode() +" "+colour.hashCode());
	} catch (Exception e) {
		 	//	e.printStackTrace();
		System.out.println("exseption occured");
	}
}
}
