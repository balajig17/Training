/**
 * Find the range indices for a given target in an array of sorted integers
 */
package problems;

/**
 * @author Balaji Gurumurthy
 *
 */
public class RangeSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = {1, 2, 5, 5, 6, 7, 9, 9, 9, 9, 9, 9, 9, 9,9, 9, 9, 9, 9, 9, 9, 9,9, 9, 9, 9, 9, 9, 9, 9,9, 9, 9, 9, 9, 9, 9, 9,9, 9, 9, 9, 9, 9, 9, 9,9, 9, 9, 9, 9, 9, 9, 9,9, 9, 9, 9, 9, 9, 9, 9,9, 9, 9, 9, 9, 9, 9, 9,9, 9, 9, 9, 9, 9, 9, 9,9, 9, 9, 9, 9, 9, 9, 9,9, 9, 9, 9, 9, 9, 9, 9,9, 9, 9, 9, 9, 9, 9, 9,9, 9, 9, 9, 9, 9, 9, 9,9, 9, 9, 9, 9, 9, 9, 9,9, 9, 9, 9, 9, 9, 9, 9,9, 9, 9, 9, 9, 9, 9, 9, 10};
		int target = 9;
		int[] range = searchRange(nums, target);
		
		System.out.println("Range = ["+range[0]+", "+range[1]+"]");

	}
	
	static public int[] searchRange(int[] nums, int target) {
		
		int[] range = {-1, -1};
		int l = 0;
		int r = nums.length-1;
		int mid;
		while(l<=r) {
			mid = l + (r-l)/2;
			if(nums[mid] < target) {
				l = mid + 1;
				continue;
			}
			else if(nums[mid]> target) {
				r = mid -1;
				continue;
			}
			else if(nums[mid] == target){
				int l_index = mid;
				while(l_index != -1 && nums[l_index] == target) {
					range[0] = l_index;
					l_index = binarySearch(nums, target, l, l_index-1);					
				}
				int r_index = mid;
				while(r_index != -1 && nums[r_index] == target) {
					range[1] = r_index;
					r_index = binarySearch(nums, target, r_index+1, r);					
				}
				break;
			}
		}
		
		return range;
	}
	
	
	static public int binarySearch(int[] nums, int target, int l, int r) {
		int mid;
		while(l <= r) {
			mid = l + (r-l)/2;
			if(nums[mid] == target)
				return mid;
			if(nums[mid] < target) {
				l = mid+1;
			}
			else if(nums[mid] > target) {
				r = mid-1;
			}
		}
		
		return -1;
	}

}
