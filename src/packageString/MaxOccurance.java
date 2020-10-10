/**
 * Find And Print a character which occured maximum no.of time(Consider capital and small)
 */
package packageString;

public class MaxOccurance {

	public static void main(String[] args) {
		String s = "Testing Shastra Testing";
		char max = 0;
		int count = 1, maxCount = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if (count > maxCount) {
				max = s.charAt(i);
				maxCount = count;
			}
			
				count=1;
			}
			System.out.println(max + "  occures  " +   maxCount +  "  Times");
		}
	}

