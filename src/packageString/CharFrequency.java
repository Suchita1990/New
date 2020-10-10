/***
 * 
 * Character Frequency In Program
 * 
 */

package packageString;

public class CharFrequency {

	public static void main(String[] args) {
		
		String s="Hello Testing Shastra";
		char[] c=s.toCharArray();//To Convert The String Into Character Array
		int count;
		for(int i=0;i<s.length();i++)
		{
			count=0;
			
			for(int j=0;j<s.length();j++)
			{
				if(j<i && c[i]==c[j])
				{
					break;
				}
				if(c[j]==c[i])
				{
					count++;
				}
				if(j==s.length()-1)
				{
					System.out.println("The Character  "+c[i]+"  is present "+count+" times");
				}
			}
		}

	}

}
