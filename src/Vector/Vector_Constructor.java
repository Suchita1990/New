/*
 * New Capacity=current capacity*2.
 */
package Vector;

import java.util.ArrayList;
import java.util.Vector;

public class Vector_Constructor {

	public static void main(String[] args) 
	{
		 ArrayList al=new ArrayList();
//		   al.add("Shravani");
//		   al.add("Avinash");
//		   al.add("Vishal");
//		   al.add("Smita");
		Vector v=new Vector();//default initial capacity
		System.out.println("Capacity" +v.capacity());
		
		Vector v1=new Vector(100);
		System.out.println("Capacity of v1 "+  v1.capacity());
		
		Vector v2=new Vector(4,10);
		System.out.println("Capacity of v2 is "+ v2.capacity());
		
		Vector v3=new Vector(al);
		System.out.println("Capacity of v3 is: "+v3.capacity());
	}

}
