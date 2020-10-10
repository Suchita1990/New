package ArrayList;

import java.util.ArrayList;

public class ArrayList_MethodDemo {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		   al.add("Hello");
		   al.add("Hello");//Duplicates allowed
		   al.add(10);
		   al.add(3.14);
		   al.add('c');
		   al.add(null);//Null insertion possible
		   
		   System.out.println(al);
		   
		   ArrayList copy=new ArrayList(al);
			//System.out.println(copy);//copy all elements from al into copy object one by one
			copy.add(al);
	/**1.
	 * add():Appends the specified element to the end of this list.
	 */		
			System.out.println("copy contains:"+copy);
	/**2.
	 * get():Returns the element at the specified position in this list.
	 */		
			System.out.println(copy.get(5));
			System.out.println(copy.get(6));//get() is used for copy all object from copy
			
			al.addAll(al);
			System.out.println(al);
			
			
	}

}
