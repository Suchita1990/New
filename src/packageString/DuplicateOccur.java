package packageString;

public class DuplicateOccur {
	public boolean containsChar(char toSearch,char[] arr)
	{
		boolean isFound=false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(toSearch==arr[i])
				return true;
		}
		   return isFound;
	}

	public static void main(String[] args) {
		String s="Maharashtra";
		DuplicateOccur d=new DuplicateOccur();
		if(d.containsChar('a',s.toCharArray()))
		{
			System.out.println("a is present");
		}
		else
		{
			System.out.println("a is not present");
		}
		
	}
}

