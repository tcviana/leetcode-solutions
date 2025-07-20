// https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;

        if (k < 0 || size < 2) 
            return;

        int index = k-1;
        int[] copy = new int[size--];

        for (int i=0; i<=size; i++) {
            copy[i] = nums[i];
            if (index >= 0) {
                nums[i] = nums[size - index];
                index--;
            } else {
                nums[i] = copy[i - k];
            }
        }
    }
}
