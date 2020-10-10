package Comparator;

import java.util.Comparator;

public class ForExam implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		Student s= (Student) o1;//We assign Object o1 that s is a student type; 
		Student t= (Student) o2;
		if(s.marks<t.marks)
			return -1;
		else if(s.marks>t.marks)
			return 1;
		else
		    return 0;
	}

}
