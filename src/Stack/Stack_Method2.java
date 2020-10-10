package Stack;

import java.util.Stack;

public class Stack_Method2 {

	public static void main(String[] args)
	{
		  Stack s=new Stack();
		  s.push(10);
		  s.push(20);
		  s.push(30);
		  s.push(40);
		  //s.add(50);
		  System.out.println(s.peek());
		  
		  System.out.println(s);
		  
		  System.out.println("After peek method:\n"+s);
		  
		  System.out.println(s.pop());
		  
		  System.out.println("After pop method:\n"+s);
		
	}

}
