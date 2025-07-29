// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        int n1 = -1, n2 = -1;

        while (left<=right) {
            int mid = (left+right)/2;

            if(nums[mid]==target) {
                return validResult(nums,mid,target);
            }
            if (nums[mid] > target) {
                right = mid-1;
            } else {
                left = mid+1;
            }
            if (left<=right && nums[left]==target) {
                return validResult(nums,left,target);
            } 
            if (right >=0 && nums[right]==target) {
                return validResult(nums,right,target);
            }
        }

        return new int[] {n1,n2};
    }

    private int[] validResult(int[] nums, int i, int target) {
        int n1 = i,n2 = i, j;

        j = i-1;
        while (validIndex(nums, j) && nums[j]==target) {
            n1 = j--;
        }

        j=i+1;
        while (validIndex(nums, j) && nums[j]==target) {
            n2 = j++;
        }
        
        return new int[] {n1,n2};
    }

    private boolean validIndex(int [] nums, int i) {
        try {
            return nums[i] == nums[i];
        } catch (Exception e) {
            return false;
        }
    }
}
