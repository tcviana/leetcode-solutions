// https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length -1;

        for (int i=0; i<=right; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[right] == target) {
                return right;
            }
            right--;
        }

        return -1;
        
    }
}
