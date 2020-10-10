package Vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorMethod {

	public static void main(String[] args) 
	{
	   ArrayList al=new ArrayList();
	   al.add("Shravani");
	   al.add("Avinash");
	   al.add("Vishal");
	   al.add("Smita");
	   Vector v=new Vector();
	   v.add(10);
	   v.add(20);
	   v.add(30);
	   v.add(40);
	   System.out.println(v);
	   //v.add(2,"Suchita");
	   //System.out.println(v);
	   v.addElement(al);//we can add object or element
	   System.out.println(v);
	 //  v.remove(al);
	  // System.out.println(v);
	   //v.removeElementAt(1);
	   //System.out.println(v);
	  // v.removeAllElements();
	   //System.out.println(v);
	   System.out.println(v.get(3));
	   System.out.println(v.elementAt(0));
	  // System.out.println(v.getFirst);
	   //System.out.println(v.getlast);
	   System.out.println(v.size());
	   System.out.println(v.capacity());
	   System.out.println(v.elements());//it gives hashcode
	   	    
	   	}

}
