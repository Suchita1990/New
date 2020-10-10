package arraypackage;

public class SingleDigit {

	public static void main(String[] args) 
	{
		   int[] a={12,17,54,82};
			 int result=0;
			 for(int i=0;i<a.length;i++)
			 {
			  result=result+a[i];
			 }
			 System.out.println(result);
			 
			 int num=result;
			 int rem=0,sum=0;
			 while(num>0)
			 {
			  rem=num%10;
			  sum=sum+rem;
			  num=num/10;
			  }
		   
			  if(num==0)
			  {
			   num=sum;
		       
			  if(sum<10)
			  {
		      // break;
			  }
		      
			 sum=0;
			}
	
		 System.out.println(sum);
		 }

}		
	


