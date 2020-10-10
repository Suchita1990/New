/*Duplicate entries Possible
 * Heterogeneous data can save
 * Null insertion possible
 */
package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1
{
   public static void main(String[] args)
   {
	   ArrayList al=new ArrayList();
	   al.add("Hello");
	   al.add("Hello");
	   al.add(10);
	   al.add(10);
	   al.add(3.14);
	   al.add('c');
	   al.add(null);//Null insertion possible
	   al.remove(3);
	   
	   System.out.println(al.get(1));
	   System.out.println(al);
	   }
}
