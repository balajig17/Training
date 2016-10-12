/**
 * 
 */
package strings;

/**
 * @author Balaji Gurumurthy
 *
 */
public class subStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String haystack = " This is a tetest string";
		String needle = "test";
		
		System.out.println(subStr(haystack, needle));

	}
	
	static public int subStr(String haystack, String needle) {
		
		if(needle.length()==0)
			return 0;
		
		int index = -1;
		int lastIndex = needle.length() - 1;
		for(int i=0; i<haystack.length(); i++ ) {
			for(int j = 0; j < needle.length(); j++) {
				try {
					if(haystack.charAt(i+lastIndex-j) == needle.charAt(lastIndex-j)) {
						index = i;
						continue;
					}
					else {
						index = -1;
						i += needle.length()-1;
						break;
					}
				}
				catch(StringIndexOutOfBoundsException e) {
					return -1;
				}
				
			}
			if(index != -1)
				return index;
		}
		
		return index;
	}

}
