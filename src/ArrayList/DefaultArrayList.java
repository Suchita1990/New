/*
 * It constructs an empty ArrayList of default capacity
 * 
 */
package ArrayList;

import java.util.ArrayList;
public class DefaultArrayList
{
	public static void main(String[] args)
	{
	  ArrayList al=new ArrayList();
	  //Empty ArrayList of capacity 10
	  for(int i=1;i<=12;i++)
	  {
		  al.add(i);
	  }
      System.out.println(al);
	}

}
