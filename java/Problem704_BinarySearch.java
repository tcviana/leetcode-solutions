// https://leetcode.com/problems/binary-search/

class Solution {
    private final Integer DEFAULT = -1;

    public int search(int[] nums, int target) {
        int size = nums.length;
        int start = 0, end = size-1;

        while (start <= end) {
            int index = Math.abs((end+start) / 2);
            int value = nums[index];

            if (target == value) {
                return index;
            }

            // new index to start/end different of target becouse the target is different that my result
            start = target>value ? index+1 : start;
            end   = target<value ? index-1 : end;
        }
        
        return DEFAULT;
    }

}
