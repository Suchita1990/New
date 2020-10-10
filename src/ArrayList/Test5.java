package ArrayList;

import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args)
	{
	  int i=10;
	  byte b=20;
	  char c='A';
	  
	  ArrayList al=new ArrayList();
	  al.add(i);
	  al.add(b);
	  al.add(c);
	  
	  System.out.println(al.get(2).getClass());
	  
	  System.out.println(al.get(1).getClass());


	}

}
