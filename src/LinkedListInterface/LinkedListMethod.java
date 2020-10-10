package LinkedListInterface;

import java.util.LinkedList;

public class LinkedListMethod {

	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		  l.add("Hello");
		  l.add(10);
		  l.add("Testing");
		  l.add("Shatra");
		  l.add(20);
  /**
    * Inserts the specified element at the beginning of this list.
    */		  
		//  l.addFirst("a");
		  //System.out.println(l);
  /**
    * Appends the specified element to the end of this list.
    */	  
		 // l.addLast(10);
		  //System.out.println(l);
  /**
    * Removes and returns the first element from this list.
    */	  
		  //System.out.println(l.removeFirst());
		 // l.removeFirst();
		  System.out.println(l);
  /**
   * Removes and returns the last element from this list.*/	  
		 // System.out.println(l.removeLast());
		   //	  l.removeLast();
		     //System.out.println(l);
  /**
	* Returns the first element in this list.
	*/
		  //System.out.println(l.getFirst());
  /**
    * Returns the last element in this list.
	*/
		  //System.out.println(l.getLast());
  /**
	* Adapter to provide descending iterators via ListItr.previous
	*/		  
		    LinkedList ls=new LinkedList();
		    ls.add("b");
		    ls.add("o");
		    ls.add("o");
		    ls.add("t");
		   System.out.println(ls.descendingIterator());
		    ls.descendingIterator();
		  	   System.out.println(ls);
 /**
   *l.listIterator(index) Returns a list-iterator of the elements in this list (in proper
   * sequence), starting at the specified position in the list.*/	  
		    l.listIterator();
		   System.out.println(l);
		   
		  
	}

}
