package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Vector_Stack
{
   public static void main(String[] args)
	{
		 Stack s=new Stack();
		  s.add(10);
		  
		  ArrayList al=new ArrayList();
		  al.add(10);
		  al.add(20);
		  System.out.println("After Adding Stack\n"+al);
		  
		  LinkedList l=new LinkedList();
			l.add(10);
			l.add(20);
			l.add(40);
			
		Vector v=new Vector();
		  v.add(10);
	      v.add(20);
		  v.add(30);
		  v.add(40);
		
		System.out.println(v.get(2));
		

	}

}
