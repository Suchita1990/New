package ConstructorDemo;

public class A {
	     int i;
	   //parameterized constructor
		public A(int x) //----constructor
		{ 
			super();//call to object class constructor
			i=x;		
			System.out.println("My Constructor");
		}
	    public void display()
	    {
	    	System.out.println(i);
	    }
}
