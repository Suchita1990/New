package exception;

public class Exception2 
{
	 public void login(String username,String password)
	  {
		try{
			throw new Test4Exception();
		}
		catch(Test4Exception e)
		{
			e.printStackTrace();
	      System.out.println("You are not a valid user");
	}
	}
}
