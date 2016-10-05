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
		String num1 = "1000";
		String num2 = "10";
		System.out.println("Sum = " + addBinary(num1, num2));

	}

	public static String addBinary(String num1, String num2) {
		StringBuffer sum = new StringBuffer();

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		num1 = new StringBuffer(num1).reverse().toString();
		num2 = new StringBuffer(num2).reverse().toString();
		// Longer String maintained in num2 variable
		if (num1.length() >= num2.length()) {
			String temp = num1;
			num1 = num2;
			num2 = temp;
		}

		int i;
		int carry = 0;
		for (i = 0; i < num1.length(); i++) {
			String res = add(num1.charAt(i), num2.charAt(i), carry);
			if (res.length() == 2) {
				carry = 1;
				sum.append(res.charAt(1));
			} else {
				carry = 0;
				sum.append(res.charAt(0));
			}
		}
		for (int j = i; j < num2.length(); j++) {
			if (carry == 1) {
				String res = add('1', num2.charAt(j), 0);
				if (res.length() == 2) {
					carry = 1;
					sum.append(res.charAt(1));
				} else {
					carry = 0;
					sum.append(res.charAt(0));
				}
			} else {
				sum.append(num2.charAt(j));
			}
		}
		if (carry == 1)
			sum.append('1');

		return sum.reverse().toString();

	}

	private static String add(char n1, char n2, int carry) {
		String sum;
		if (n1 == '0') {
			sum = (n2 == '1') ? "1" : "0";
		} else {
			sum = (n2 == '1') ? "10" : "1";
		}

		if (carry == 1) {
			if (sum == "10")
				sum = "11";
			else {
				sum = add('1', sum.charAt(0), 0);
			}
		}

		return sum;
	}

}
