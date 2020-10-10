package exception;
/*
 * throw keyword is used to propagate the exception to calling method
 * throws keyword-To throw Exception Explicitly(jabardasti exception throw karana hai)
 * 
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;


public class Exception
{
 public void m1() throws IOException,SQLClientInfoException,FileNotFoundException
  {
	  FileInputStream fis=new FileInputStream("");
	  
	  System.out.println("Continue m1 method");
  }
}

	