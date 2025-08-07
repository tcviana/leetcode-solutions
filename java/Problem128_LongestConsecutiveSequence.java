// https://leetcode.com/problems/longest-consecutive-sequence

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int max = 1;

        for (int i=1; i<nums.length; i++) {
            if (nums[i] == nums[i-1])
                continue;
                
            if (nums[i] == (nums[i-1]+1)) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }

        return max;

    }
}
