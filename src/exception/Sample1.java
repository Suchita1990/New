package exception;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLClientInfoException;


public class Sample1 
{
  public void m2() throws IOException,SQLClientInfoException,FileNotFoundException
  {
	Exception e=new Exception();
	//e.m1();
	try
	{
		e.m1();
	}catch(IOException e1)
	{
		System.out.println("Exception is handled");
	}
	System.out.println("Continue m2 method");
  }
}
