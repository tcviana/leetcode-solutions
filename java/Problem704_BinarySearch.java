// https://leetcode.com/problems/binary-search/

class Solution {
    private final Integer DEFAULT = -1;

    public int search(int[] nums, int target) {
        int size = nums.length;
        int index = 0;

        if (size < 1) return DEFAULT;

        if (size > 3) {
            index = Math.abs(size / 2);
        }

        int value = retrieveValueByIndex(nums, index);

        if (target == value) {
            return index;
        }
        int start = target<value ? 0 : target;
        int end = target>value ? size : target;
        
        return retrieveValueByStartEndIndex(nums,target,start,end);
    }

    private int retrieveValueByStartEndIndex(int[] nums, int target, int start, int end) {
        for (int i=start; i<nums.length; i++) {
            if (target == nums[i]) {
                return nums[i];
            }
        }
        return DEFAULT;
    }

    private int retrieveValueByIndex(int[] nums, int index) {
        return nums[index];
    }

}
