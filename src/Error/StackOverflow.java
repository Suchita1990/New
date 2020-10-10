/*There is StackOverflow error comes.
 *It means it is recurrceive method call.In this one method can call itself 
 * or one method call another method
 */

package Error;

import java.io.FileInputStream;
public class StackOverflow
{
	 public void m1()
	  {
		  m2();
	  }
	 public void m2()
	 {
		m1();
	}
	public static void main(String[] args) 
	{
	 StackOverflow f=new StackOverflow();
	 f.m1();
	}
	

}
