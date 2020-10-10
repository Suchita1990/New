package Map_Demo;

import java.util.Hashtable;

public class HashTable_Demo {

	public static void main(String[] args)
	{  
	   Hashtable h=new Hashtable(); 
	   /* h.put(new Student(2),"X");
	    h.put(new Student(8),"Y");
	    h.put(new Student(25),"Z");
	    h.put(new Student(25),"T");
	    h.put(new Student(12),"S");
	    
	    System.out.println(h);
*/       
	     h.put(2,"X");
	     h.put(8,"Y");
	     h.put(25,"Z");
	     h.put(19,"T");
	     Object ref=h.put(12,"P");
	     System.out.println("I got:"+(String)ref);
	     System.out.println(h);
	}

}
