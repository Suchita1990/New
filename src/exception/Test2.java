package exception;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLClientInfoException;


public class Test2 
{
	public static void main(String[] args) 
	{
		Sample1 s=new Sample1();
		try {
				s.m2();//Risky
			} catch (SQLClientInfoException e) {
				
				e.printStackTrace();
			}catch(FileNotFoundException f){
			
			
		} catch (IOException e) {
			
			
		}
		System.out.println("continue in main method");
	}

}
