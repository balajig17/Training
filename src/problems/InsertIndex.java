/**
 * Return the index of a target element in a sorted array if found.
 * Else return the index where the target element should be placed.
 */
package problems;

/**
 * @author Balaji Gurumurthy
 *
 */
public class InsertIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] nums = {1, 3, 5};
		int target = 2;
		System.out.println(searchInsert(nums, target));
		
		

	}
	
	static public int searchInsert(int[] nums, int target) {
		
		
		if(target <= nums[0])
			return 0;
		else if(target > nums[nums.length-1])
			return nums.length;
		int low =0;
		int high = nums.length-1;
		while(low < high) {
			int mid = (low+high)/2;
			if(nums[mid] == target)
				return mid;
			if(nums[mid] < target) {
				if(nums[mid+1] >= target)
					return mid+1;
				else
					low = mid+1;
			}
			else if(nums[mid] > target) {
				if(nums[mid-1] < target)
					return mid;
				else
					high = mid-1;
			}
		}
		return -1;
	}
	

}
