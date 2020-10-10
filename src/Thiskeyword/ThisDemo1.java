/*
 * this() keyword can be used to invoke current class constructor
 * we can do constructor chaining in this case
 */
package Thiskeyword;

public class ThisDemo1
{   
	ThisDemo1() //No Argument Constructor
	{
		this(10);//we can call one constructor inside another constructor
	 System.out.println("No Arguement Constructor");	
	}
	ThisDemo1(int a) //Parameterised Constructor
	{
		//this();//calling no arg. constructor inside parameterised constructo
	 System.out.println("Parameterised Constructor");
	}

	public static void main(String[] args)
	{
	  ThisDemo1 d=new ThisDemo1();
	  //ThisDemo1 d=new ThisDemo1(10);
	 
	}

}
