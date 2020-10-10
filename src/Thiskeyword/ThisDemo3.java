/*
 * this keyword can be used to pass as an argument in the constructor call
 * 
 */
package Thiskeyword;

public class ThisDemo3
{
	void m1()
	{
		Test t=new Test(this);
 	}

	public static void main(String[] args)
	{
	  	ThisDemo3 t=new ThisDemo3();
	  	t.m1();
	}

}
