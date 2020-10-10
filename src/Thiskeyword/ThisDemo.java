/*
 * this keyword can be used to invoke current class method(implicitly)
 *this.display/display is same mens in this case if we do not use this keyword before display method then compiler invoke the this keyword by default to display method 
 */

package Thiskeyword;

public class ThisDemo {
	void display()
	{
		System.out.println("Hello");
	}
	void show()
	{
		//this.display();//call to disply method
		display();
	}

	public static void main(String[] args)
	{
	  ThisDemo d=new ThisDemo();	
       d.show();// o/p :Hello
	}

}
