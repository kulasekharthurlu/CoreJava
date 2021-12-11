package com.app.funtions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FindGrade {

	public static void main(String[] args) {
		Function<Student, String> f=k->{
			int marks=k.marks;
			String grade=" ";
			if(marks>=80) grade="distiction";
			else if(marks>=60) grade ="[A] first class";
			else if(marks>=40) grade ="[B] second class";
			else if(marks>=35) grade ="[C] third class";
			else  grade="Faild";
			return grade;

		};
		Predicate<Student> p=l->l.marks>=60;
		
		Consumer<Student> c=i->{
			System.out.println("Student name : "+i.name);
			System.out.println("Student marks : "+i.marks);
			System.out.println("Student grade : "+f.apply(i));
			System.out.println();
		};
		Student []s= {
				new Student("kula", 65),
				new Student("Tony", 90),
				new Student("alexa", 45),
				new Student("promt", 25),
				new Student("alia", 50),
		};
		for(Student s1:s) {
			if(p.test(s1)) {
				c.accept(s1);
			}

		}

	}

}
class Student{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

}