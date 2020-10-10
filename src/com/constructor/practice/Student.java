package com.constructor.practice;

public class Student {
	int id;
	String name;
	Student()
	{
		
	}
	Student(int i, String n)
	{
		id=i;
		name=n;
	}
	public void display() {
     System.out.println(id+" "+name);
	}
  public static void main(String[] args) {
	Student s=new Student();
	Student s1=new Student(10,"Rani");
	s.display();
	s1.display();
}
}
