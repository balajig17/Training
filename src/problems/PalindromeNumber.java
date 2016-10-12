/**
 * Program to check if a given number is a palindrome
 */
package problems;

/**
 * @author Balaji Gurumurthy
 *
 */
public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x = 12373212;
		PalindromeNumber p = new PalindromeNumber();
		boolean isPal = p.isPalindrome(x);
		System.out.println(isPal);

	}

	public boolean isPalindrome(int x) {
		
		String num = String.valueOf(x);
		int mid = num.length()/2;
		for(int i=0; i <mid; i++) {
			if(num.charAt(i) != num.charAt(num.length()-1-i))
				return false;
		}
		return true;

	}

}
