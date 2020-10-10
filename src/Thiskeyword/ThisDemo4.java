/*
 * this keyword can be used to return the current class instance from the method
 * 
 */
package Thiskeyword;

public class ThisDemo4 
  {
	ThisDemo4 m1()
	{
		return this;//it is used to return current class instance
	}

	public static void main(String[] args)
	{
	  ThisDemo4 t=new ThisDemo4();
	  t.m1();

	}

}
