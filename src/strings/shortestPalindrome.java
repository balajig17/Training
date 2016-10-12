/**
 * Program to return the shortest palindrome that can be formed from the given input string
 */
package strings;

/**
 * @author Balaji Gurumurthy
 *
 */
public class shortestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "aacebeca";
		shortestPalindrome(s);

	}
	
	static public void shortestPalindrome(String s) {
		
		int palStart = -1;
		StringBuilder sb = new StringBuilder(s).reverse();
		
		for(int i=0; i< s.length(); i++) {
			if(checkPalindrome(s.substring(0,s.length()-i))) {
				palStart = i;
				break;
			}
		}
		System.out.println(palStart);
	}
	
	static public boolean checkPalindrome(String s) {
		boolean isPal = true;
		int mid = s.length()/2;
		for(int i=0; i<mid; i++) {
			if(s.charAt(i) == s.charAt(s.length()-1-i)) {
				isPal = true;
			}
			else {
				isPal = false;
				break;
			}
		}
		
		return isPal;
		
	}

}
