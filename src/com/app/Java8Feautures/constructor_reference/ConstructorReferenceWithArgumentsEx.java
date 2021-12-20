package com.app.Java8Feautures.constructor_reference;

interface Inter{
	Student get(int id, String name, String email);

}
class Student {
	private int id;
	private String name;
	private String email;
	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;

		System.out.println("constructor executed......");
	}
	@Override
	public String toString() {
		return "Student ={id: " + id + ", name: " + name + ", email: " + email + "}";
	}
	Student(){
		System.out.println("no arguconstructo.......");
	}

}
class Demo implements Inter{

	@Override
	public Student get(int id, String name, String email) {
		 Student st=new Student();
		return st;
	}
	
}
public class ConstructorReferenceWithArgumentsEx {

	public static void main(String[] args) {
		
		Demo D=new Demo();
		 Student s2= D.get(333, "Alexa", "alexa@gmail.com");
		 System.out.println(s2);

		Inter i=(id, name,  email)->new Student(id, name,  email);
		Student s1=	i.get(222, "Tony", "tony@gmail.com");
		System.out.println(s1);

		Inter I=Student::new;
		Student s=	 I.get(123, "kulasekhar", "kula@gmail.com");
		System.out.println(s);

	}

}
