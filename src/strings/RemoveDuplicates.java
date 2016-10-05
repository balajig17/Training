/**
 * Program to eliminate repetitive words in a string
 */
package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Balaji Gurumurthy
 *
 */
public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "How do do do you you do";
		System.out.println("String: "+s);
		System.out.println("Modified: "+removeDuplicates(s));

	}
	
	public static String removeDuplicates(String s) {
		String pattern = "\\b(\\w+)(\\s\\1\\b)+";
		Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		Matcher m = r.matcher(s);
		while(m.find()) {
			s = s.replaceAll(m.group(0), m.group(1));
		}
		return s;
	}

}
