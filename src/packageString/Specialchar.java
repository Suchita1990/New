package packageString;

public class Specialchar {

	public static void main(String[] args) {
		String s = "Hello  T$t!ng Sh@str@";
		for (int i = 0; i < s.length(); i++)
		{
/*			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') 
			{

			} 
			else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') 
			{
				
			} 
			else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') 
			{

			} else if (s.charAt(i) == ' ') 
			{

			} else {
				System.out.println(s.charAt(i));
			}*/
			
			if( (s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||  (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) == ' '))
			{
				
			}
			else
			{
				System.out.println(s.charAt(i));
			}
		     }
		
	}

}
