/**
 * 
 */

package CollectionInterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionInterfaceMethod {

	public static void main(String[] args)
	{
	   ArrayList al=new ArrayList();
	   al.add(10);
	   al.add(20);
	   al.add(30);
	   al.add("A");
	   
	   ArrayList x=new ArrayList();
	   x.add(10);
	   x.add(20);
	   x.add(30);
	   x.add(40);
	   
	   LinkedList l=new LinkedList();
		l.add(40);
		l.add(50);
		l.add(60);
		
	    // toArray() method:return list element into array
		Object[] a=l.toArray();
		for(Object o:a)
		{
			System.out.println(o);
		}
	   
	  System.out.println(x.removeAll(al));
	  
//	  System.out.println(al.size());
	  
	 //   al.clear();
	  //System.out.println(al);
	  
       al.retainAll(x);//it will delete uncommon elements from invoking collection
	  System.out.println("RetainAll:"+al);
	  
	 // System.out.println(al.toArray());
	  //System.out.println(x.contains(al));
	}

}
