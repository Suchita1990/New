package Stack;
/*
 * it creates empty stack of 0 capacity
 * we can not convert any collection into stack bcoz there is no direct constructor available
 */
import java.util.ArrayList;
import java.util.Stack;

public class Stack_Constructor {

	public static void main(String[] args)
	{
       Stack s=new Stack();
       ArrayList al=new ArrayList();
     	al.add("Hi");
  	    al.add("Suchita");
  	    al.add("Sneha");
  	    al.add(10);
  	    al.add(20);
  	System.out.println("ArrayList:" +al);
       s.add(10);
       s.add(20);
       s.add(30);
       s.add(40);
       s.add(al);
       System.out.println(s);
     
	}

}
