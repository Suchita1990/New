package Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import Comparable.Student;
import Comparator.ForExam;

public class Comparable_Demo
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		
		//TreeSet hs=new TreeSet();
		ArrayList<Student> hs=new ArrayList<Student>();
		  hs.add(s1);
		  hs.add(s2);
		  hs.add(s3);
		  hs.add(s4);
		  hs.add(s5);
		  System.out.println(hs);
		  
		Collections.sort(hs, new ForExam());
	/*	  
		  for(Object s:hs)
		  {
			 int marks=((Student)s).marks;
			  System.out.println(marks);
		  }*/
	}

}
