
public class Test
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
