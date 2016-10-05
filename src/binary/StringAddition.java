/**
 * Given two binary strings, return the sum of the numbers as a binary string
 */
package binary;

/**
 * @author Balaji Gurumurthy
 *
 */
public class StringAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String num1 = "1";
		String num2 = "111";
		System.out.println("Sum = "+ sum(num1, num2));

	}
	
	
	public static String sum(String b1, String b2) {
		
		
		String small_num, big_num;
		if(b1.length() >= b2.length()) {
			small_num = b2;
			big_num = b1;
		}
		else {
			small_num = b1;
			big_num = b2;
		}
		int max_length = big_num.length() + 1;
		int min_length = small_num.length();
		int diff = max_length - min_length + 1;
		small_num = String.format("%0$"+diff+"s", small_num);
		small_num = small_num.replace(' ', '0');
		big_num = String.format("%0$"+1+"s", big_num);
		big_num = big_num.replace(' ', '0');
		System.out.println(small_num);
		System.out.println(big_num);
		char[] sum = new char[max_length];
		boolean carry = false;
		for(int i = max_length-1; i >0; i--) {
			String s = add(small_num.charAt(i), big_num.charAt(i), carry);
			if(s == "10" || s == "11") {
				carry = true;
				sum[i] = s.charAt(1);
			}
			else {
				carry = false;
				sum[i] = s.charAt(0);
			}				
		}
		if(carry)
			sum[0] = '1';
		else
			sum[0] = '\u0000';
		System.out.println(sum);
		return String.copyValueOf(sum);
	}
	
	private static String add(char n1, char n2, boolean carry) {
		String sum;
		if(n1 == '0') {
			if(n2 == '1') 
				sum = "1";
			else
				sum = "0";
		} else {
			if(n2 == '0')
				sum = "1";
			else
				sum = "10";
		}
		
		if(!carry)
			return sum;
		else {
			if(sum == "10")
				return "11";
			else
				return add(sum.charAt(0), '1', false);
		}
	}
	

}
