// https://leetcode.com/problems/jump-game

class Solution {
    public boolean canJump(int[] nums) {
        int size = nums.length;
        int maxJump = 0;

        for (int i=0; i<size; i++) {
            maxJump--;
            maxJump = Math.max(maxJump, nums[i]);
            if ((i + maxJump) >= size-1) return true;
            if (maxJump==0) return false;
        }

        return true;

    }
}
