// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while (left<=right) {
            int mid = (left+right)/2;

            if(nums[mid]==target) {
                int n1,n2;
                if (nums[mid-1]==target) {
                    n1=mid-1;
                    n2=mid;
                } else {
                    n1=mid;
                    n2=mid+1;
                }
                return new int[] {n1,n2};
            }
            if (nums[mid] > target) {
                right = mid-1;
            } else {
                left = mid+1;
            }
            if (nums[left++]==target) {
                return new int[] {left-1,left};
            } 
            if (nums[right--]==target) {
                return new int[] {right, right+1};
            }
        }

        return new int[] {-1,-1};
        
    }
}
