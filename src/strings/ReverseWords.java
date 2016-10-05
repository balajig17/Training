/**
 * Program to reverse the order of words in a given String
 */
package strings;

/**
 * @author Balaji Gurumurthy
 *
 */
public class ReverseWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = " How are you doing";
		System.out.println("String : "+ s);
		System.out.println("Reversed String : "+ reverseWords(s));

	}
	
	public static String reverseWords(String s) {
		StringBuffer reverse = new StringBuffer();
		String[] words = s.split(" ");
		for(int i= words.length-1; i >0; i--) {
			reverse.append(words[i]);
			reverse.append(" ");
		}
		reverse.append(words[0]);
		return reverse.toString();
		
	}

}
