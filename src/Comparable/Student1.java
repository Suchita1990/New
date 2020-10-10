package Comparable;

public class Student1 implements Comparable
{ 
	int marks;
   public Student1(int marks)
   {
	   this.marks=marks;
   }
	@Override
	public int compareTo(Object o)
	{
		//Student s=(Student)o;
	  if(this.marks<((Student1)o).marks)
	  {
		 return 0;
	  }
	  else if(this.marks>((Student1)o).marks)
	  {
	    return 1;
     	}
	  else return -1;
  }
}

