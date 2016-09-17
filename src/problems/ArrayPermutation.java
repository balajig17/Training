/**
 * 
 */
package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Balaji Gurumurthy
 *
 */
public class ArrayPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr1[] = {1, 2, 3, 6, 2};
		int arr2[] = {3, 6, 1 , 2, 2};
		
		boolean isPerm = checkPermutation(arr1, arr2);
		System.out.println(isPerm);
	}
	
	public static boolean checkPermutation(int[] ar1, int[] ar2) {
		
		if(ar1.length != ar2.length)
			return false;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<ar1.length; i++)
			{
				Integer val = map.get(ar1[i]);
				if(val == null)
					map.put(ar1[i], 1);
				else
					map.put(ar1[i], val+1);
			}
		System.out.println(map);
		for(int j=0; j<ar2.length; j++) {
			if(!map.containsKey(ar2[j]))
				return false;
			else {
				Integer count = map.remove(ar2[j]);
				if(--count == 0)
					continue;
				else
					map.put(ar2[j], count);
			}
			System.out.println(map);
		}
		
			
		return true;
	}

}
