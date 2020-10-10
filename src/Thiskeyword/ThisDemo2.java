/*
 * this keyword can be used to pass as an argument in the method
 * 
 */

package Thiskeyword;

public class ThisDemo2
{
	void m1(ThisDemo2 d)//refrence create as parameter
	{
		System.out.println("I am in m1 method");
	}
	void m2()
	{
		m1(this);
	}

	public static void main(String[] args)
	{
	  ThisDemo2 d=new ThisDemo2();	
      d.m2();
	}

}
