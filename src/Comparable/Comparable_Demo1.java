package Comparable;

import java.util.TreeSet;

public class Comparable_Demo1
{
	public static void main(String[] args)
	{
		Student1 s1=new Student1(40);
		Student1 s2=new Student1(65);
		Student1 s3=new Student1(78);
		Student1 s4=new Student1(83);
		Student1 s5=new Student1(98);
		
		TreeSet hs=new TreeSet();
		  hs.add(s1);
		  hs.add(s2);
		  hs.add(s3);
		  hs.add(s4);
		  hs.add(s5);
		  System.out.println(hs);
		  
		  for(Object s:hs)
		  {
			 int marks=((Student1)s).marks;
			  System.out.println(marks);
		  }

	}

}

