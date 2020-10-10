package Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class ForNcc implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		Student s=(Student)o1;
		Student t=(Student)o2;
		
		if(s.height<t.height)
			return -1;
		else if(s.height>t.height)
			return +1;
		else
		return 0;
	}
   
}
