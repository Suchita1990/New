/*
 *CharAt() returns value at the given index number 
 *Accessing all the elements present At odd Index
 *Counting  Frequency Of Character in string
 */

package packageString;

public class CharAtMethod {

	public static void main(String[] args) {
		
	/*	String s="Testing Shastra";
	    char ch=s.charAt(6);
	    System.out.println(ch);
		   }*/
		
		String s="Testing Shastra";
		/*int slength=s.length();
		
		System.out.println("Character At 0 th Index Is:"+s.charAt(0));
		
		System.out.println("Character At Last Index Is:"+s.charAt(s.length()-1));
	}*/
		
		/*for(int i=0;i<s.length()-1;i++)
		{
	*/		/*if(i%2!=0)
			{
				System.out.println("Char At "+i+" place "+s.charAt(i));
			}
			}
		}*/
			int count=0;
			for(int i=0;i<s.length()-1;i++)
			{
			  if(s.charAt(i)=='t')
				
				count++;
		  }
	
	      
	      System.out.println("Freqency Of t Is:"+count);
	}
	
}


