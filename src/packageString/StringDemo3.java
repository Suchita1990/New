package packageString;

public class StringDemo3 {

	public static void main(String[] args) {
		String s="Helloe";
		System.out.println(s.length());
		System.out.println(s.charAt(4));
		System.out.println(s.indexOf('e'));//it gives first occurance of character
		System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        String[] parts=s.split("");
         System.out.println(parts[0]);
        String s1="   Hello Testing Shastra";
        System.out.println("Before trim" +s1);
        s1=s1.trim();
        System.out.println("After trim   "+5); 
        String t="Hello Testing Shastra";
        String t1=t.substring(6);
        System.out.println(t1);
         String t2=t.substring(6,12);
         System.out.println(t2);
        		
        
        
        
	}

}
