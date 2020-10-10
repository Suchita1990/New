//Find and Print Vowel from String
package packageString;

public class Vowel {

	public static void main(String[] args) {
		String s="Hello Testing Shastra";

		for(char c:s.toCharArray())
		{
			if(c=='a'||c=='e'||c=='i'||c=='A'||c=='o'||c=='u'||c=='I'||c=='O'||c=='U')
			
           System.out.println(c);
       }
}
}
