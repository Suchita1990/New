/**
 * Find Duplicate character from given string
 */
package packageString;

public class DuplicateChar {
	
	public boolean containsChar(char toSearch,char[] arr)
	{
	  boolean isFound=false;
	  for(int i=0;i<arr.length;i++)
	  {
		  if(toSearch==arr[i])
		  {
			  return true;
		  }
	  }
	    return isFound;
	}

	public static void main(String[] args) {
		String s="Maharashtra";
		int index=0;
		char duplicates[]=new char[s.length()/2];
		DuplicateChar d=new DuplicateChar();
		System.out.println("List Of Duplicate Characters:");
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				if(d.containsChar(s.charAt(i),duplicates))
				{
					
				}
				else
				{
					if(s.charAt(i)==s.charAt(j))
					{
						duplicates[index]=s.charAt(i);
						index++;
						break;
					}
				}
			}
		}
		for(char c:duplicates)
		{
			System.out.println(c);
		}
	}
}
	
				