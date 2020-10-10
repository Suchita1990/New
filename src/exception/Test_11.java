package exception;

public class Test_11
{
 public static void main(String[] args)
 {
   String s="Hello";
   try
   {
    System.out.println(s.charAt(5));
}catch(StringIndexOutOfBoundsException e)
{
	System.out.println("Unable to read 5th index, so reading 4th index ");
	System.out.println(s.charAt(4));
	}
}
}
