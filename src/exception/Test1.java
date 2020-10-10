package exception;

public class Test1
{   
	public static int addArray(int... a) //var array
	{ 
		int result=0;
		try
		{
		for (int i = 0; i < a.length; i++)
		{
		  result=result+a[i];	
		}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array is");
		}
		return result;
	}

}
