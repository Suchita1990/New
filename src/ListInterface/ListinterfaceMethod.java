/**
 * 
 */
package ListInterface;
import java.util.ArrayList;

public class ListinterfaceMethod
{

	public static void main(String[] args)
	{
	  ArrayList al=new ArrayList();
	    al.add(10);
	    al.add(20);
	    al.add(20);
	    al.add(30);
	    al.add(40);
	    al.add(2,50);
	    
	  ArrayList x=new ArrayList();
	     x.add(60);
	     x.add(70);
	     x.add(80);
	     
	     x.add(al);
	    System.out.println(x);
	    
	/**
	 *1. Replaces the element at the specified position in this list with
	 * the specified element.
	 */
	      System.out.println(al.get(2));
	   
	/**
	 * 2.Returns the index of the first occurrence of the specified element
	 * in this list, or -1 if this list does not contain the element.*/    
	      System.out.println(al.contains(40));
    /**
     * 3.Inserts all of the elements in the specified collection into this
     * list, starting at the specified position.  Shifts the element
     * currently at that position (if any) and any subsequent elements to
     * the right (increases their indices).*/ 
	      x.addAll(al);
	    System.out.println(x);
	 /**
	  *4. Removes the first occurrence of the specified element from this list,
	  * if it is present.  If the list does not contain the element, it is
	  * unchanged.*/  
	      x.remove(al);
	    System.out.println(x);
	/**
	 *5 Returns the number of elements in this list.
	 */ 
	    System.out.println(al.size());
	    
	 /**
	  *6.Replaces the element at the specified position in this list with
	  * the specified element.
	  */   
	        al.set(3,90);
	      System.out.println(al);
	  /**clone():
	   *7.Returns a shallow copy of this <tt>ArrayList</tt> instance.*/   
	     ArrayList a=new ArrayList();
	       a=(ArrayList)al.clone();//Object casting to ArrayList
	       System.out.println(a); // a=al;//Also we can assign to al
	      
	  /**
	   *8.ensureCapacity(int min_capacity) Increases the capacity of this <tt>ArrayList</tt> instance, if
	   * necessary, to ensure that it can hold at least the number of elements
	   * specified by the minimum capacity argument.
	   * 
	   * *new capacity=current capcity*(3/2)+1;
	   * ex.new capacity=10(default capacity of arraylist)*(3/2)+1=16; 
	   *  */  
	       al.ensureCapacity(1000);
	     System.out.println("ArrayList can surely store upto 1000 elements");
	 /**
	  *9.Returns the index of the first occurrence of the specified element
	  * in this list, or -1 if this list does not contain the element.*/
	     
	       System.out.println(al.indexOf(20));
	 /**
	  *10.Returns the index of the last occurrence of the specified element
	  * in this list, or -1 if this list does not contain the element.*/      
	      System.out.println(al.lastIndexOf(40));
	         ArrayList al1=new ArrayList(); 
	      System.out.println(al1.lastIndexOf(10));
	 /**
	  *11.Returns a view of the portion of this list between the specified
	  * {@code fromIndex}, inclusive, and {@code toIndex}, exclusive
	  * The returned list supports all of the optional list operations.
	  * */      
	        System.out.println(al.subList(1, 3));
	  /**
	   *12.Returns the element at the specified position in this list.
	   */     
	        System.out.println(al.get(3));
	  /**
	   *13.removes from this list all of its elements that are not contained in the specified collection
	   * .
	   */      x.retainAll(al);
	         System.out.println(x);
	         
	   /**
	    *14.toArray():Returns an array containing all of the elements in this list
	    * in proper sequence (from first to last element).*/       
	           Object[] a1=al.toArray();
	           for(Object o:a1)
	           {
	        	   System.out.println(o);
	           }
	    /**
	     *15.Returns <tt>true</tt> if this list contains the specified element.
	     * More formally, returns <tt>true</tt> if and only if this list contains
	     * at least one element */	           
	           x.contains(al);
	          System.out.println(x);
	          System.out.println(al.contains(x));//all elements present in the list should be same
	   	}

}
