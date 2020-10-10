/*We can not apply for loop on hashset bcoz there is no get method
 * in case null index:we can not use for loop for iterate the over the collection best choice is Cursor
 * Use of Cursor:1.Iterator:2.ListIterator:3.Enumeration
 */
package cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;


public class FirstCase {

	public static void main(String[] args)
	{
	   HashSet al=new HashSet();
	    al.add(12);
	    al.add(14);
            al.add(13);
            al.add(10);
	    al.add(30);
      /*  
        for(int i=0;i<al.size();i++)
        {
        	System.out.println(al.);//o/p:12 null 14 13 bcoz of for loop travel 0 to 4 but there is no start point as one so it gives null
        }
		*/
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			int element=(int)itr.next();
			element=element+2;
			element=element+6;
		}
		Iterator itr1=al.iterator();
		System.out.println("Collection After Adding 2 to it");
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}

}
