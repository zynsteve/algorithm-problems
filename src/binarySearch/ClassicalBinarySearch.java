package binarySearch;

/**
 * Find any position of a target number in a sorted array
 * return -1 if target does not exist
 * 
 * Example
 * given [1, 2, 2, 4, 5, 5]
 * for target = 2, return 1 or 2
 * for target = 5, return 4 or 5
 * for target = 6, return -1
 */

public class ClassicalBinarySearch {
    /**
     * @param A an integer array sorted in ascending order
     * @param target an integer
     * @return an integer
     */
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        
        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }
        return -1;
    }
}
