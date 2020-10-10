package com.string.practice;

import java.lang.reflect.Method;

public class String_getClassDemo {

	 public static void main(String[] args) {
		 int count = 0;
		Object o=new String ("durga");
		Class c=o.getClass();
		System.out.println("Fully qualified name of class: " + c.getName());
		Method[] m=c.getDeclaredMethods();
		System.out.println("Method Information");
		for(Method m1:m)
		{
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("The no of Methods: "+count);
		}

}
