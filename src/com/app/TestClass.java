package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClass {
	public static void main(String[] args) {
		 Child c=new Child("kula",24,12343434,435);
		 Child c1=new Child("lula",235,1234,425);
		 Child c2=new Child("aula",25,12334,415);
		
		 List<Child> list=new ArrayList<Child>();
		 list.add(c1);
		 list.add(c);
         list.add(c2);
         System.out.println(list);//toString method override compelsary
         Collections.sort(list, (e1,e2)->e1.getAge()-(e2.getAge()));
         for(Child d:list) {
        	 
        	 System.out.println(d.name+" "+d.age+" "+d.rollno+" "+d.marks);
         }
		  
	}
}
 abstract class Parent {
	 String name;
	 int age;
	 Parent(String name,int age){
		 this.name=name;
		 this.age=age;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
 }
 class Child extends Parent{
	 int rollno;
	 int marks;
	  Child(String name,int age,int rollno,int marks){
		  super(name,age);
		  this.rollno=rollno;
		  this.marks=marks;
	  }
	@Override
	public String toString() {
		return "{rollno:" + rollno + ", marks:" + marks + ", name:" + name + ", age:" + age + "}";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	 
	  
 }