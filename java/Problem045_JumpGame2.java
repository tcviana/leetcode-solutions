// https://leetcode.com/problems/jump-game-ii/

class Solution {
    public int jump(int[] nums) {
        int size = nums.length;
        int jumps = 0;

        if (size <= 1) return jumps;

        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < size - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;            
                currentEnd = farthest; 

                if (currentEnd >= nums.length - 1) break;
            }
        }

        return jumps;
    }
}
