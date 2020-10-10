package Comparator;

import java.util.TreeSet;

public class Test
{
	 public static void main(String[] args)
	    {
			Student s1=new Student(40,3.45f);
			Student s2=new Student(65,4.4f);
			Student s3=new Student(78,3.81f);
			Student s4=new Student(98,3.72f);
			Student s5=new Student(83,2.987f);
			
			//TreeSet hs=new TreeSet(new ForExam());
			TreeSet hs1=new TreeSet(new ForNcc());
    			hs1.add(s1);
		    	hs1.add(s2);
			    hs1.add(s3);
		    	hs1.add(s4);
			    hs1.add(s5);
			for(Object s:hs1)
			{
				//int marks=((Student)s).marks;
				float height=((Student)s).height;
				//System.out.println(marks);
				System.out.println(height);
			}
			
		}
}
