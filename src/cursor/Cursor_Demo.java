/*Iterator is the metod which is implememted by hashset
 * if the data hVE SAME DATA TY
 * 
 */
package cursor;
import java.util.HashSet;
import java.util.Iterator;


public class Cursor_Demo {

	public static void main(String[] args) 
	{
		{
			  HashSet al=new HashSet();
			    al.add(12);
			    al.add(14);
		        al.add(13);
		        al.add(10);
//		        
//		        for(int i=0;i<al.size();i++)
//		        {
//		        	System.out.println(al);
//		        }
	/**
	 * Returns an iterator over the elements in this set.  The elements
	 * are returned in no particular order.Bcoz Set is an unorder collection
	 */
		        
          Iterator itr=al.iterator();
          while(itr.hasNext())
          {
        	  System.out.println(itr.next());
          }
	}

	}
}
