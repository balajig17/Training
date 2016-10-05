/**
 * Returns the zigzag representation of a string.
 * leetCode #6
 */
package strings;

/**
 * @author Balaji Gurumurthy
 *
 */
public class ZigZag {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "NEWSTRING";
		System.out.println(getZigZag(s, 1));

	}
	
	public static String getZigZag(String s, int numRows) {
		if(numRows <=1)
			return s;
		int length = s.length();
		char[][] zz = new char[numRows][length];
		int x=0, y=0;
		boolean downwards = true;
		for(int i=0; i < length; i++) {
			zz[x][y] = s.charAt(i);
			if(downwards) {
				if(x+1 >= numRows) {
					downwards = false;
				}
				else {
					x++;
				}
			}
			if(!downwards) {
				if(x<=0) {
					downwards = true;
					x++;
				}
				else {
					y++;
					x--;
				}
			} 			
			
		}
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<numRows; i++) {
			for(int j=0; j<length; j++) {
				if(zz[i][j]!='\u0000')
					result.append(zz[i][j]);
			}
		}
		return result.toString();
		
		
	}

}
