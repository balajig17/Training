/**
 * Program to validate username. username must be of 8-30 characters,
 * Start with an alphabet, can contain only alphanumeric characters or _
 */
package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Balaji Gurumurthy
 *
 */
public class UsernameChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String username = "balajig17";
		if(valid(username))
			System.out.println("The user name is valid");
		else
			System.out.println("The user name is invalid");

	}
	
	public static boolean valid(String username) {
		String p = "^[A-Za-z][_A-Za-z0-9]{7,29}$";
		Pattern r = Pattern.compile(p);
		Matcher m = r.matcher(username);
		
		if(m.find()) {
			System.out.println(m.group(0));
			return true;
		}
		else 
			return false;
	}

}
