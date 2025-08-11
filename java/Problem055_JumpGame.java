// https://leetcode.com/problems/jump-game

class Solution {
    public boolean canJump(int[] nums) {
        int size = nums.length-1;
        int first = nums[0];

        if (first > size) return false;

        int jump = nums[first];

        if (jump > size) return false;

        int result = nums[jump]+jump;

        return (result == size);
    }
}
